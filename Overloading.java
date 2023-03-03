// public class Overloading {
//     static int max(int a, int b)
//     {
//         return a>b?a:b;
//     }
//     static double max(double a,double b){
//         return a>b?a:b;
//     } 

// public static void main(String[] args)
//     {
//         System.out.println(max(5,7));
//         System.out.println(max(5.5,6.7));
//     }
// }
public class Overloading{
    static void test(){
        System.out.println("test methods with no argument");
    }
    static void test(int a){
        System.out.println("test methods with 1 arg");
    }
    static void test(int a,int b){
        System.out.println("test methods with 2 arg");
    }

public static void main(String[] args)
    {
        test();
        test(3,4);
        test(10);
    }
}    