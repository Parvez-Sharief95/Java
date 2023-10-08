class Student{
    String name;
    int id;
    String clg;
    String brn;
    public Student(String str1, int i, String c, String str4) {
        name = str1;
        id = i;
        clg = c;
        brn = str4;
    }
    void printDetails(){
        System.out.println("name is:" +name);
        System.out.println("Id     :" +id);
        System.out.println("College:" +clg);
        System.out.println("Branch :" +brn);
    }
    
}
public class constructorTask {
    public static void main(String[] args) {
        Student s1 = new Student("parvez",28,"ACET", "CSE AIM-ML");
        s1.printDetails();
        Student s2 = new Student("koushik",26,"ACET","CSE AIM-ML");
        s2.printDetails();
        Student s3 = new Student("hussain",38,"ACET","CSE AIM-ML");
        s3.printDetails();
    }
}
