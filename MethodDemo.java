public class MethodDemo {
    int boxVolume(int length, int breath, int hight){
        int vol;
        vol = length*breath*hight;
        return vol;
        
    }  
public static void main(String[] args){
        System.out.println("hello world");// method call
        boxVolume();//passing arguments
    }
}
