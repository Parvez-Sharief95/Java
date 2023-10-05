public class TwoD{
    public static void main(String[] args) {
        char[] [] arr = {{'a','b','c'},{'x','y','z'},{'?','#','&'}};
        for(char i[]:arr)
        {
            for(char j:i)
            {
                System.out.print((int)j+' ');
            }
            System.out.println( ); 
        }
    }
}
