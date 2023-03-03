class Area {
    
    int length;
    int breadth;
    //constructing the class 
     Area(int length,int breadth){
         this.length = length;
         this.breadth = breadth;
    }

    public void getArea(){
         int area = length * breadth;
         System.out.print("Area: " +area);
    }
}
class Encap{
    public static void main(String[] args){

        Area rectangle = new Area(2, 16);
        rectangle.getArea();
    }
}