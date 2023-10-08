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
    //if you want to print without dress 
    public String toString(){
        return"(" +name+ "," +age+ "," +gender+ ")";
    }
   /*  void printDetails(){
        System.out.println("name is:" +" ");
        System.out.println("Age is: " +" ");
        System.out.println("Gender:" +" ");
    }*/
}
public class constructor {
    public static void main(String[] args) {
        Person p1 = new Person("Virat",35,'M');
      // p1.printDetails();
       
        Person p2 = new Person("Smriti",22,'F');
       // p2.printDetails();
       
        Person p3 = new Person("Hardik",27,'M');
       //p3.printDetails();
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
        
    }
}
