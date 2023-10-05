import java.util.Scanner;
public class functions_2{
    static int ascival(String s)
    {
         int sum = 0;
         for(int i=0;i<s.length();i++)
         {
            sum+=(int)s.charAt(i);
         }
         return sum;
    }
    public static void main(String[] args) {
        String a = "hello";
        int result = ascival(a);
        System.out.println(result);
    }
}