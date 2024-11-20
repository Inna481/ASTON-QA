public class FoodBowl {
    private int foodAmount;

    public FoodBowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood() {
        if (foodAmount > 0) {
            foodAmount--;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды в миску. Теперь в миске " + foodAmount + " еды.");
        } else {
            System.out.println("Количество добавляемой еды не может быть отрицательным.");
        }
    }
}
