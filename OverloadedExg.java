class subtract {
    static void sub(){
    System.out.println("Nothing to print");
    }
    static void sub(int a,int b){
        System.out.println(a-b);
    }
    static void sub(int a,int b,int c){
        System.out.println(a-b-c);
    }
    static void sub(int a,double b){
        System.out.println(a-b);
    }
    static void sub(int[] arr){
        int s=0;
        for(int i=0; i<arr.length;i++)
        {
            s-=arr[i];
        }
        System.out.println(s);
    }
}

public class OverloadedExg {
    public static void main(String[] args) {
        subtract.sub(10,5);
        subtract.sub(100,20,30);
        subtract.sub();
        subtract.sub(new int[]{1000,20,30,40,10});
    }
}
