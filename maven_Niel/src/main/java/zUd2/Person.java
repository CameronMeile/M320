package zUd2;
import java.util.ArrayList;

public class Person {
    String firstName;
    String secondName;
    ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void newContact(String name, String email, int phoneNumber){
        contacts.add(new Contacts(name, email, phoneNumber));
    }

    public void printContacts() {
        System.out.println(firstName+" "+secondName);
        for (Contacts contact : contacts)
        {
            System.out.println(contact.getinfo());
        }
    }

}
