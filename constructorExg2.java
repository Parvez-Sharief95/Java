class Person{
     String name;
    int age;
    char gender;
public Person() {}
Person(String n){
    name = n;
}
Person(String n,int a){
    name = n;
    age = a;
}
Person(String n,int a,char c){
    name = n;
    age = a;
    gender = c;
}
}

public class constructorExg2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
        Person p2 = new Person("Virat");
        System.out.println(p2);
        Person p3 = new Person("Smriti",23);
        System.out.println(p3);
        Person p4 = new Person("Hardik", 33, 'm');
        System.out.println(p4);
    }
}
