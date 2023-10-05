import java.util.Arrays;
public class varArray2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[]{10,20,30,40,50};
        arr[1] = new int[]{60,70};
        arr[2] = new int[]{80,90,100};
        for(int i=0;i<3;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
