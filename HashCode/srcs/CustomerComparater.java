import java.util.Comparator;

class CustomerComparator implements Comparator<PizzaCustomer>{

    @Override
    public int compare(PizzaCustomer customer1, PizzaCustomer customer2) {

        if(customer1.dislikedIngredients().size() == customer2.dislikedIngredients().size()){
            return customer1.likedIngredients().size()-customer2.likedIngredients().size();
        }

        return customer1.dislikedIngredients().size() - customer2.dislikedIngredients().size();
    }
}