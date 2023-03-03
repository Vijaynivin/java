public class Smallestnumber {

    public static void main(String[] args)
    {
        int small,large,i;
        int n= new int[]{1,2,3,4,5};
        int n = a.length;
        small=large= a[0];
        for(i=1;i<n.length;i++)
        {
            if(a[i]>small){
                smalll= a[i];
            }
            if(a[i]<large){
                large= a[i];
            }
            System.out.println("\n smallest element is " +small);
            System.out.println("\n largest element is " +large);
        }
    }
    
}
