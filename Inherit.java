  public class Employee{     // base class,super class,parent class
    private String name;
    private double salary;
        Employee(String n,double s){
            name = n;
            salary = s;
        }
        Employee(String n,double s){
            Name= " ";
            Salary= 0.0;
        }
        public String getName() {return name;}
        public void setName(String n) {name = n;}
        public double getSalary(){return salary;}
        public viod setSalary(double s) {salary = s;}

        public void raiseSalary(double parcent)
        {
        salary += salary*percent/100;
        }
     
    }
    class Manager extends Employee{  /*  derived class, sub class,child*/
        private double bonus;
        Manager(String n, double s, double b)
        {
           super(n,s);
            bonus = b;
        }
        public void setBonus(double b)
        {
            super(n,s);
            bonus = b;
        }
        double getSalary()      /*overriding */
        { 
        return super.getSalary()+bonus;
        }
    }
    public class InheritanceDemo{
        public static void main(String[] args){
            Employee e1 = new Empolyee("Ram",35000);
            e1.raiseSalary(10);
            System.out.println(e1.getSalary());


            Manager m1 = new Manager("john",65000.0,0.0);
            m1.setBonus(20000);

            System.out.println(m1.getSalary());

            Empolyee e2 = new Manager("Sara",68000,0); //polymorphism
            int[] arr = new int[50];
            Employee[] employees =  new Employee[20];
            employees[0] = new Employee("Ram",35000);
            employees[1] = new Employee("Sara",32000);
            employees[2] = new Employee("Bala",38000);
            employees[3] = new Employee("Nithiya",37000);
            employees[4] = m1;  

            for(Employee e:employee){ //dynamic binding
                System.out.println(e.getName() + " " + e.getSalary());
            }
            
    }   
}


