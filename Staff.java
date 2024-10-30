public class Staff {
        private final String fullName;
        private final String position;
        private final String email;
        private final String phone;
        private final double salary;
        private final int age;

        public Staff(String fullName, String position, String email, String phone, double salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("ФИО: " + fullName);
            System.out.println("Должность: " + position);
            System.out.println("E-mail: " + email);
            System.out.println("Телефон: " + phone);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);
        }

        public static void main(String[] args) {
            Staff staff = new Staff("Иванов Иван Иванович", "Программист", "IvanIvan@mail.ru", "+79218853585", 100000, 25);
            staff.displayInfo();
        }
    }

