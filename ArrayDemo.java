import java.util.Scanner;

public class ArrayDemo{

    public static void main(String[] args) {
        
        // int[] a = {1,2,3,4,5,1,6};
        int[] a = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 element of the array: ");

        for(int i=0;i<a.length;i++)
            a[i]=scanner.nextInt();
    
            // a[1] a[2] a[3] a[4] a[5]

        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}