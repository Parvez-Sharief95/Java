 class SimpleCalculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void multiply(int a,int b){
        System.out.println(a*b);
    }
    void divide(int a,int b){
        System.out.println(a/b);
    }
 }
 class AdvancedCalculator extends SimpleCalculator{
    void sqrt(int n){
        System.out.println(Math.sqrt(n));
    }
    void getPow(int b,int e){
        System.out.println(Math.pow(b, e));
    }
 }
public class inheritanceExample {
    public static void main(String[] args) {
        SimpleCalculator sc1 = new SimpleCalculator();
        sc1.add(1, 1);
        sc1.sub(4, 2);
        sc1.multiply(4, 2);
        sc1.divide(10, 2);
        AdvancedCalculator ac1 = new AdvancedCalculator();
        ac1.getPow(2,3);
        ac1.sqrt(4);
    }
}
