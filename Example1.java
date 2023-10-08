public class Example1 {
    /*GENERIC METHOD */
    static <T> void printArray(T[] arr){
        for(T i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    /*  OVERLOADIN METHOD ==>
    static void printArray(String[] arr){
        for(String i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void printArray(Double[] arr)
    {
        for(Double i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void printArray(Character[] arr)
    {
        for(Character i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }*/
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,40,50};
        printArray(arr);
        String[] strArr = {"parvez","koushik","hussain"};
        printArray(strArr);
        Double[] douArr ={12.5,14.6};
        printArray(douArr);
        Character[] charArr = {'h','i','@','&'};
        printArray(charArr);
    }
}
