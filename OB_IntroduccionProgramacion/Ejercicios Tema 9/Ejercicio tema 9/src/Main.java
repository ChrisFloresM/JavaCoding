// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Client
        Client Mark = new Client();

        Mark.setName("Mark");
        Mark.setAge(25);
        Mark.setPhoneNumber("6741123678");
        Mark.setCredit(30000);

        System.out.println("This is for the Client class:");
        System.out.printf("Name: %s, Age: %d, Phone Number: %s, Credit: %d", Mark.getName(), Mark.getAge(), Mark.getPhoneNumber(), Mark.getCredit());

        //Worker
        Worker Bob = new Worker();

        Bob.setName("Bob");
        Bob.setAge(33);
        Bob.setPhoneNumber("6741124678");
        Bob.setSalary(50000);

        System.out.println("\n\nThis is for the Worker class:");
        System.out.printf("Name: %s, Age: %d, Phone Number: %s, Salary: %d", Bob.getName(), Bob.getAge(), Bob.getPhoneNumber(), Bob.getSalary());
    }
}

class Person {
    private int age;
    private String name;
    private String phoneNumber;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class Client extends Person {
    private int Credit;

    public int getCredit() {
        return Credit;
    }

    public void setCredit(int credit) {
        Credit = credit;
    }
}

class Worker extends Person {
    private int Salary;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}