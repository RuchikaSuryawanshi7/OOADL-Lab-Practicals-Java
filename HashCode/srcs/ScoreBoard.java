import java.util.List;
import java.util.Map;

public class ScoreBoard {

    List<PizzaCustomer> customers;
    Map<String, Integer> ingredient;

    public ScoreBoard(List<PizzaCustomer> customers, Map ingredient) {
        this.customers = customers;
        this.ingredient = ingredient;
    }

    public int getScore() {
        int customerCount = 0;

        for (PizzaCustomer customer : customers) {

            Boolean is_selected = true;

            //checking if any ingredient of customer that is not in our selection
            for (String likedIngredient : customer.likedIngredients()) {
                if (!ingredient.containsKey(likedIngredient)) {
                    likedStatus = false;
                    break;
                }
            }

            if(!is_selected) continue;

            //checking if any ingredient of customer that is disliked by customer
            for (String dislikedIngredient : customer.dislikedIngredients()) {
                if (ingredient.containsKey(dislikedIngredient)) {
                    is_selected = false;
                    break;
                }
            }

            //increase count of customers if that ingredient is
            //liked by customer and not disliked by that customer
            if (is_selected)
                customerCount++;
        }

        return customerCount;
    }
}
