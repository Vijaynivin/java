import java.util.*;

//object - cosmic superclass
class Employee implements Comparable<Employee>{           
    private String name;
    private double salary;
    Employee(String n,double s){
        name = n;
        salary= s;
    } 
    // Employee(){  /*base class*/
    //     name =" ";
    //     salary = 0.0;
    // }
    public String getName() {return name;}
    public void setName(String n){name = n;}
    public double getSalary(){return salary;}
    public void setSalary(double s) {salary = s;}


    public void raiseSalary(double percent){
        salary += salary*percent/100;
     }
    public boolean equals(Object obj){
        if(this==obj)
        return true;

        if(obj==null)
        return false;

        if(this.getClass() != obj.getClass())
        return false;

        Employee e = (Employee)obj;
        return this.name.equals(e.name) && this.salary==e.salary;

     }

    public int comparaTo(Employee e){  //obj1.comparaTo(obj2) obj1-obj2
        if(salary == e.salary)
            return 0;
        if(salary<e.salary)
            return -1;
        return 1;
    }


}

class Manager extends Employee{  //derived class,sub class,child class
    double bonus;
    Manager(String n,double s,double b){
        // Manager m1 = new Manager("Sara",40000.0,0.0);
        super(n,s);
        bonus = b;
    }
    public void setBonus(double b){
        bonus = b;
    }
    public double getSalary(){ //method overriding
        return super.getSalary()+bonus;
    }
}

public class InheritanceDemo{
    public static void main(String[] args){
        Employee e1 = new Employee("Bala",35000);
        e1.raiseSalary(10);
        System.out.println(e1.getSalary());


        // Manager m1 = new Manager("Sara",40000.0,0.0);
        // m1.setBonus(20000);

        // System.out.println(m1.getSalary());
        
        Employee e2 = new Manager("Bala",68000,0);  //polymorphism
        
        int[] arr = new int[50];
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Bala",35000);
        employees[1] = new Employee("Sara",40000);
        employees[2] = new Employee("Nithiya",68000);
        // employees[3] =m1;
        employees[3] = new Manager("Nithiya",65000.0,0.0);

        employees[3].setSalary(75000);
        Manager m1 = (Manager) employees[3]; //using the type caseting
        m1.setBonus(20000);


        Manager m2;
        if(employees[2] instanceof Manager)       //instance value is a accepted to manager
            m2 = (Manager) employees[2];

        for(Employee e:employees){
            System.out.println(e.getName() +" " + e.getSalary());
        }

        Arrays.sort(employees);

        for(Employee e:employees){
            System.out.println(e.getName() +" " + e.getSalary());
        }
    }
}
