package zUd2;

public class Contacts {
    String name;
    String email;
    int phoneNumber;
    public Contacts(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public  String getinfo() {
        return name+" "+email+" "+phoneNumber;
    }
}
