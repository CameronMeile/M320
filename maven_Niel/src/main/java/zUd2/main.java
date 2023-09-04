package zUd2;

public class main {

    public static void main (String[] args)
    {
        Person p1 = new Person("Niel", "Müller");
        Person p2 = new Person("Linus", "Daniels");
        Person p3 = new Person("Samuel", "Muggli");
        p1.newContact("Samuel", "samuel@gmail.com", 417653872);
        p1.newContact("Dings", "Dings@gmail.com", 417653652);
        p2.newContact("Jamal", "jamal@gmail.com", 417653232);
        p2.newContact("Samuel", "samuel@gmail.com", 417653872);
        p3.newContact("Dings", "Dings@gmail.com", 417653652);
        p3.newContact("Jamal", "jamal@gmail.com", 417653232);
        p1.printContacts();
        p2.printContacts();
        p3.printContacts();
    }
}
