/*
Line 1: No of Clients
Line 2: Client 1 no of Liked Ingredients Ingre1, ingre2, ingreN
Line N for No of clients
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Pizzarie {
    public static void main(String args[]) throws IOException {
        FileHelp helper = new FileHelp();
        String firstGroup[] = { "a_an_example.in.txt", "b_basic.in.txt" };

        for (String input : firstGroup) {
            //getting input from file
            List<PizzaCustomer> customers = helper.getInputFromFile(input);

            Map<String, Integer> allIngredient = helper.getAllIngredient();
            Map<String, Integer> choosedIngredient = helper.algorithm_1(customers, allIngredient);

            List<String> choosedIngredientList = helper.toArrayList(choosedIngredient);

            helper.writeIntoFile(choosedIngredientList, input);
            LocalScoreBoardSimulator localScoreBoardSimulator = new LocalScoreBoardSimulator(customers, choosedIngredient);

            System.out.println("Score of" + input +" algo1 : " + localScoreBoardSimulator.getScore());

            Map<String, Integer> map = helper.algorithm_3(customers);

            LocalScoreBoardSimulator newsimulator = new LocalScoreBoardSimulator(customers, map);
            System.out.println("Score of" + input +" algo3 : " + newsimulator.getScore());

        }

        String secondGroup[] = { "c_coarse.in.txt", "d_difficult.in.txt", "e_elaborate.in.txt" };

        for (String input : secondGroup) {// 3 1441 1658
            List<PizzaCustomer> customers = helper.getInputFromFile(input);
            Map<String, Integer> choosedIngredient = helper.algorithm_2(customers);
            List<String> choosedIngredientList = helper.toArrayList(choosedIngredient);
            helper.writeIntoFile(choosedIngredientList, input);
            LocalScoreBoardSimulator localScoreBoardSimulator = new LocalScoreBoardSimulator(customers,
                    choosedIngredient);
            System.out.println("Score of" + input + " algo2 : " + localScoreBoardSimulator.getScore());

            Map<String, Integer> map = helper.algorithm_3(customers);
            LocalScoreBoardSimulator newsimulator = new LocalScoreBoardSimulator(customers, map);
            System.out.println("Score of" + input + " algo3 : " + newsimulator.getScore());

        }
    }
}
