class Adder {
    static void add() {
        System.out.println("Nothing to print");
    }
    static void add(int a,int b) {
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void add(int a, double b){
        System.out.println(a+b);
    }
    static void add(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
public class PolymorphismExg{
    public static void main(String[] args){
        Adder.add(10,20);
        Adder.add(10,20,30);
        Adder.add(10,20.5);
        Adder.add();
        Adder.add(new int[]{10,20,30,40,50});
    }
}