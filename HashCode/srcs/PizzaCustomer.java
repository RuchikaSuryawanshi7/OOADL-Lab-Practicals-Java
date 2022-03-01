import java.util.List;

public class PizzaCustomer {
    private List<String> likedIngredient;
    private List<String> dislikedIngredient;

    public PizzaCustomer(List<String> likedIngredients, List<String> dislikedIngredients) {
        this.likedIngredient = likedIngredients;
        this.dislikedIngredient = dislikedIngredients;
    }

    public List<String>likedIngredients() {
        return likedIngredient;
    }

    public List<String>dislikedIngredients() {
        return dislikedIngredient;
    }
}
