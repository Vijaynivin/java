import java.util.*;
public class Swap {
    static void swapValueUsingThirdVariable(int m,int n)
    {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("value of m is" +m +"and value of n" +n);
    }

    public static void main(String[] args)
    {
        int m = 25, n= 19;
        swapValueUsingThirdVariable(m, n);
    }
}
