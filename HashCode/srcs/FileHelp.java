import java.io.*;
import java.util.*;

public class FileHelp {

    private Map<String, Integer> allIngredient;


    public List<PizzaCustomer> getInputFromFile(String fileName) throws FileNotFoundException, IOException {
        allIngredient = new HashMap<>();
        List<PizzaCustomer> customers = new ArrayList<PizzaCustomer>();
        int nbrCustomer;
        try {
            BufferedReader fr = new BufferedReader(new FileReader("inputs\\" + fileName));
            String line;

            nbrCustomer = Integer.parseInt(fr.readLine());// this info does not important because i used dynamic table

            while ((line = fr.readLine()) != null) {

                String likedIngredientInput[] = line.split(" ");
                List<String> likedIngredientCustomer = new ArrayList();

                for (int i = 1; i < likedIngredientInput.length; i++) {
                    // i started from 1 to avoid reading the length ingredient (dynamic table)
                    likedIngredientCustomer.add(likedIngredientInput[i]);
                    allIngredient.put(likedIngredientInput[i], 0);
                }
                line = fr.readLine();
                String dislikedIngredientInput[] = line.split(" ");
                List<String> dislikedIngredientCustomer = new ArrayList();

                for (int i = 1; i < dislikedIngredientInput.length; i++) {
                    // i started from 1 to avoid reading the length ingredient (dynamic table)
                    dislikedIngredientCustomer.add(dislikedIngredientInput[i]);
                    allIngredient.put(dislikedIngredientInput[i], 0);
                }
                PizzaCustomer customer = new PizzaCustomer(likedIngredientCustomer, dislikedIngredientCustomer);
                customers.add(customer);

            }
            fr.close();

        } catch (IOException ex) {
            System.out.println("ex " + ex.getMessage());

        }
        return customers;
    }

    public Map<String, Integer> getAllIngredient() {
        return allIngredient;
    }

    //removes ingredient that is disliked by any customer
    public Map<String, Integer> algorithm_1(List<PizzaCustomer> customers, Map<String, Integer> allIngredient) {
        for (PizzaCustomer customer : customers) {
            //iterating through customers dislikes
            for (String dislikedIngredient : customer.dislikedIngredients()) {
                //removing ingredient that is disliked by any customer
                if (allIngredient.containsKey(dislikedIngredient))
                    allIngredient.remove(dislikedIngredient);
            }
        }

        return allIngredient;

    }

    public List<String> toArrayList(Map<String, Integer> allIngredient) {
        List<String> choosedIngredient = new ArrayList();
        for (String key : allIngredient.keySet()) {
            choosedIngredient.add(key);

        }
        return choosedIngredient;
    }


    public Map<String, Integer> algorithm_2(List<PizzaCustomer> customers) {
        Collections.sort(customers, new CustomerComparator());
        Map<String, Integer> choosedIngredient = new HashMap();

        for (PizzaCustomer customer : customers) {
            boolean isTakenIngredient = true;
            // iterate over whole dislikes ingredient;
            for (String dislikedIngredient : customer.dislikedIngredients()) {
                if (choosedIngredient.containsKey(dislikedIngredient)) {
                    isTakenIngredient = false;
                    break;
                }
            }

            if (isTakenIngredient) {
                for (String likedIngredient : customer.likedIngredients()) {
                    choosedIngredient.put(likedIngredient, 0);
                }
            }

        }
        return choosedIngredient;
    }

    //selecting ingredients which are are more liked and less disliked
    public Map<String, Integer> algorithm_3(List<PizzaCustomer> customers) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> map1 = new HashMap<String, Integer>();

        for (PizzaCustomer customer : customers) {

            for (String liked : customer.likedIngredients()) {
                if (map.containsKey(liked)) {
                    map.put(liked, map.get(liked) + 1);
                } else {
                    map.put(liked, 1);
                }
            }

            for (String disliked : customer.dislikedIngredients()) {
                if (map.containsKey(disliked)) {
                    map.put(disliked, map.get(disliked) - 1);
                } else {
                    map.put(disliked, 0);
                }
            }
        }

        // preparing string of final ingredients
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 0) {
                map1.put(entry.getKey(), entry.getValue());
            }

        }

        return map1;

    }

    public List<String> toArrayListAlgo3(Map<String, Integer> allIngredient) {
        List<String> choosedIngredient = new ArrayList();

        // preparing string of final ingredients
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 0) {
                choosedIngredient.add(entry.getKey());
            }

        }

        return choosedIngredient;
    }

    //Approach
    //1. Remove Customer which dislikes are move than 2
    //2. Selecting Ingredients whose likes are more than dislikes
    public Map<String, Integer> algorithm_4(List<PizzaCustomer> customers){

        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> map1 = new HashMap<String, Integer>();

        for (PizzaCustomer customer : customers) {

            //skipping customer whose disliked are more
            if(customer.dislikedIngredients().size() > 2) continue;

            for (String liked : customer.likedIngredients()) {
                if (map.containsKey(liked)) {
                    map.put(liked, map.get(liked) + 1);
                } else {
                    map.put(liked, 1);
                }
            }

            for (String disliked : customer.dislikedIngredients()) {
                if (map.containsKey(disliked)) {
                    map.put(disliked, map.get(disliked) - 1);
                } else {
                    map.put(disliked, 0);
                }
            }
        }

        // preparing string of final ingredients
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 0) {
                map1.put(entry.getKey(), entry.getValue());
            }

        }

        return map1;
    }


    public void writeIntoFile(List<String> choosedIngredient, String fileName) {
        try {
            System.out.println("\n------- output " + fileName);
            PrintWriter outputFile = new PrintWriter("outputs\\" + fileName + ".out", "UTF-8");
            outputFile.print(choosedIngredient.size() + " ");
            for (String ingredient : choosedIngredient) {
                outputFile.print(ingredient + " ");
            }

            outputFile.close();
        } catch (Exception e) {
            System.err.println("" + e);
        }
    }
}
