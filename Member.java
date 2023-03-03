public class Member {
    private String name;
    abstract void welcomeMessage();
    
}
class student extends Member{
    void welcomeMessage()
    {
        System.out.println("Hello Student...");
    }
  
}
class Teacher extends Member{
    void welcomeMessage()
    {
        System.out.println("Hello Teacher...");
    }
}
public class Member {
    public static void main(String[] args){
        Student s1 = new Student();
        Teacher t1 = new Teacher();

        Member m1 = new Student();

        Member[] m = new Member[4];
        m[0] = new Student();
        m[1] = new Student();
        m[2] = new Teacher();
        m[3] = new Teacher();

        for( Member m1 : m)
        {
            m1.welcomeMessage();
        }
    }
}
