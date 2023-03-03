public class fiboncci {
    public static void main(String[] args)
    {
        int n1=0,n2=1,temp=0,i,count=10;
        System.out.println(n1+ " " +n2); //printing 0 and 1 

        for(i=0;i<count;++i) // loop start from 2 becasuse 2 because 0 and 1 are already printed
        {
            // int n1 = 0;
            // int n2 = 1;
            int temp = n1;
            n1 = n2;
            n2 = temp;

            System.out.println(temp);
           
        }
    }}
    

