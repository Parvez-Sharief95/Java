class Person {
    String name;
    int age;
    char gender;
    public Person(String string, int i, char c) {
    }
    public Person() {
    }
    void printDetails(){
        System.out.println("Name is:" +name);
        System.out.println("Age is:" +age);
        System.out.println("Gender:" +gender);
    }
}
public class Example5{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Virat";
        p1.age = 35;
        p1.gender = 'M';
        p1.printDetails();
        Person p2 = new Person();
        p2.name = "Smriti";
        p2.age = 27;
        p2.gender = 'F';
        p2.printDetails();
        Person p3 = new Person();
        p3.name = "Hardik";
        p3.age = 35;
        p3.gender = 'M';
        p3.printDetails();
    }
}
