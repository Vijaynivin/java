import java.io.*;
import java.util.Scanner;

class EcapHandle{

    public static void main(String[] args) throws FileNotFoundException {

        int a=10,b=5;
        int c=0;
        try{
            int arr[] = null;
            // System.out.println(arr[1]);
            c=a/b;  //throw
            System.out.println("try block");

            // throw new NullPointerException("demo");
        }
        catch(ArithmeticException | NullPointerException e) {  //java 1.7
            System.out.println("Exception has occurred");
        }
        catch(Exception e){
            System.out.println("Error occurred");
        }
        finally{
            System.out.println("This gets printed no matter what");
        }
//checked exception
        File file = new File("abc.txt");
        FileInputStream fs = new FileInputStream(file);
        
        System.out.println(c);
        System.out.println("End of program");

        //try with resource
        int i =0;
        try(Scanner scanner = new Scanner(System.in))
        { 
        int i = scanner.nextInt();
        }
        
        System.out.println(i);


        // void withdraw (double amount) throws InsufficientBalanceException{
        //     if (amount > balance)
        //         throw new InsufficientBalanceException();
        //     else
        //         balance -= amount;
        // }
        // double bal = 500, withdraw = 700;

        // try{
        // if(bal<withdraw)
        //     throw new InsufficientFundException(withdraw-bal);
        // }
        // catch(InsufficientFundException e){
        //     System.out.println("Not enought money");
        // }
    }
}