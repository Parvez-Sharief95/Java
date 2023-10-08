public class funcArray {
    static int[] getSquare(int[] arr){
        int[] squares = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            squares[i] = arr[i] * arr[i];
        }
        return squares;
    }
    public static void main(String[] args) {
        int[] orr = {10,20,30,40,50};
        int[] result = getSquare(orr);
        for(int each: result)
        {
            System.out.println(each + " ");
        }
    }
}
