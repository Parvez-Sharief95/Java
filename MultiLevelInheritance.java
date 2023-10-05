class Person{
    String name;
    int age;
    Char gender;
}
    class Student extends Person{
    String branch;
    String clg;
    int studentId;
}
class Trainer extends Person{
   
    int empId;
    double salary;
}
class intern extends Student{
    double salary;
    int internId;
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student s1 = new Student();
        Trainer t1 = new Trainer();
        intern i1 = new intern();
        System.out.println(i1 instanceof intern);
        System.out.println(i1 instanceof Student);
        System.out.println(i1 instanceof Person);
    }
}
