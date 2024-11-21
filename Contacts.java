import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contacts {
    public static void main (String[] args) {
        Contacts myContacts = new Contacts();

        myContacts.add("Иванов", "+7-999-888-77-66");
        myContacts.add("Иванова", "+7-885-447-85-88");
        myContacts.add("Сидоров", "+7-122-533-56-55");
        myContacts.add("Петров", "+7-526-863-00-00");
        myContacts.add("Иванов", "+7-665-655-85-52");
        myContacts.add("Иванов", "+7-222-555-47-85");

        System.out.println("Номера Иванова: " + myContacts.get("Иванов"));
        System.out.println("Номера Ивановой: " + myContacts.get("Иванова"));
        System.out.println("Номера Сидорова: " + myContacts.get("Сидоров"));
        System.out.println("Номера Петрова: " + myContacts.get("Петров"));
    }

    private Map<String, List<String>> contacts;

    public Contacts() {
        contacts = new HashMap<>();
    }
    public void add (String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }
    public List<String> get(String name){
        return contacts.getOrDefault(name, new ArrayList<>());
    }

}
