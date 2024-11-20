public class Main {
    public static void main(String[] args) {

        FoodBowl foodBowl = new FoodBowl(5);

        Cat[] cats = { new Cat(), new Cat(), new Cat(), new Cat() };

        for (Cat cat : cats) {
            cat.eat(foodBowl);
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + " сытость: " + (cats[i].isFull() ? "Да" : "Нет"));
        }

        foodBowl.addFood(3);

        for (Cat cat : cats) {
            cat.eat(foodBowl);
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + " сытость: " + (cats[i].isFull() ? "Да" : "Нет"));
        }

        Dog dogBobik = new Dog();
        Dog dogTima = new Dog();
        Dog dogVenya = new Dog();

        dogBobik.run(350);
        dogBobik.swim(15);
        dogTima.run(800);
        dogTima.swim(10);
        dogVenya.run(5);
        dogVenya.swim(100);


        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}
