public class OuterClass {

    x = 5;

public class InnerClass{
    
    y = 10;
}
}
public static void main(String[] args){
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = MyOuter.new InnerClass();
    System.out.println(myInner.y+ myouter.x);
}    
    

