class Employee{  //base class,super class,parent calss
    private String name;
    private double salary;
    Employee(String n,double s){
        name = n;
        salary= s;
    } 
    Employee(){  //base class
        name =" ";
        salary = 0.0;
    }
     public String getName() {return name;}
     public void setName(String n){name = n;}
     public double getSalary(){return salary;}
     public void setSalary(double s) {salary = s;}


     void raiseSalary(double percent){
        salary += salary*percent/100;
     }
}
