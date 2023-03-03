public class Palindrom {

    public static void main(String[] args){

        String a,b ="";
        Scanner String = new Scanner(System.in);
        System.out.println("Enter the string you want to check:");
        a = String.nextLine();
        int n = a.length();
        for(int i = n-1; i>=0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("the string is palindrome.");
        }
        else
        {
            System.out.println("the string is not ppalindrom.");
        }

    }
    
}
