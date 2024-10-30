public class SomeEmployees {
    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final double salary;
    private final int age;

    public SomeEmployees(String fullName, String position, String email, String phone, double salary, int age) {
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
        System.out.println();
    }

    public static void main(String[] args) {
        SomeEmployees[] SomeEmployees = new SomeEmployees[5];
        SomeEmployees[0] = new SomeEmployees("Иванов Иван Иванович", "Программист", "IvanIvan@mail.ru", "+79218526365", 100000, 25);
        SomeEmployees[1] = new SomeEmployees("Петров Петр Петрович", "Менеджер", "Petrov@mail.ru", "+79990148865", 55000, 27);
        SomeEmployees[2] = new SomeEmployees("Сидоров Серей Сергеевич", "Аналитик", "Sidorov@mail.ru", "+79963214589", 80000, 33);
        SomeEmployees[3] = new SomeEmployees("Федоров Степан Федорович", "Тестировщик", "Fedorov@mail.ru", "+78521589654", 65000, 28);
        SomeEmployees[4] = new SomeEmployees("Семенов Семен Семенович", "Дизайнер", "Semenov@mail.ru", "+7875248555", 45000, 29);

        for (SomeEmployees someEmployees: SomeEmployees) {
            someEmployees.displayInfo();
        }
    }
}
