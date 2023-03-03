/*
*    interface - what to do buy how to do
*
*     java 1.8 default method
*
*   */


// class Vehicle{     
//     void ride(){     //dummy method
         
//     }
// }
interface Ridable{
    public void ride();
    default void display(){
        System.out.println("hello from ridable interface");
    }
}

class Car implements Ridable{
    public void ride(){
    System.out.println("you are riding a car");
    }
    public void display(){
        System.out.println("hello from car calss");
    }
}    
class Bike implements Ridable {
    public void ride(){
        System.out.println("you are riding a bike");
    }
} 
class Machanic{
    void check(Ridable r){
        System.out.println("Checking");
        r.ride();
    }
}

class InterFace{
    public static void main(String[] args){
        Ridable r = new Car();
        Machanic m = new Machanic();
        Car c = new Car();
        Bike b = new Bike();


        c.display();
        m.check(c);
        m.check(b);
    }
}