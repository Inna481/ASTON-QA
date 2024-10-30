import java.util.ArrayList;
import java.util.List;
public class Park {

        private final List<Attraction> attractions;
        public Park() {
            attractions = new ArrayList<>();
        }

        public void addAttraction(String name, String workingHours, double price) {
            attractions.add(new Attraction(name, workingHours, price));
        }

        public void displayAttractions() {
            System.out.println("Аттракционы в парке:");
            for (Attraction attraction : attractions) {
                attraction.displayInfo();
            }
        }

            private static class Attraction {
            private final String name;
            private final String workingHours;
            private final double price;

            public Attraction(String name, String workingHours, double price) {
                this.name = name;
                this.workingHours = workingHours;
                this.price = price;
            }

            public void displayInfo() {
                System.out.println("Название: " + name);
                System.out.println("Время работы: " + workingHours);
                System.out.println("Стоимость: " + price + " руб");
                System.out.println(); // Пустая строка для разделения аттракционов
            }
        }

        public static void main(String[] args) {
            Park park = new Park();
            park.addAttraction("Американские горки", "09:00 - 21:00", 600);
            park.addAttraction("Паровозик", "09:00 - 21:00", 200);
            park.addAttraction("Свободное падение", "09:00 - 21:00", 300);
            park.addAttraction("Комната страха", "09:00 - 21:00", 700);
            park.addAttraction("Цепь", "09:00 - 21:00", 250);
            park.displayAttractions();
        }
    }