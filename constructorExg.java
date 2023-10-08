import java.util.ArrayList;

class Person{
    String name;
    int age;
    char gender;
    //Parametric Constructor 
    Person(String n,int a,char g){
        name = n;
        age = a;
        gender = g;
    }
}
public class constructorExg {
    public static void main(String[] args) {
        ArrayList<Person> arr = new ArrayList<>();
            arr.add(new Person("Virat",35,'M'));
            arr.add(new Person("Smriti",27,'F'));
            arr.add(new Person("Hardik",33,'M'));
        System.out.println(arr.size());
        for(Person p:arr)
        {
            System.out.println(p);
        }
    }
}
