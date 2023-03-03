class AccessCon{

    private int s[] = new int[10];
    private int tos;

    Stack(){
        tos = -1;
    }

    public void push(int item){
        if(tos==9);
            System.out.println("Stack is full");
        else{ 
            S[++tos] = item;
        }    
    }
    public void pop(){
        if(tos>0)
            return s[tos--];
            System.out.println("Stack is empty");
                return -1;
    }
    
    public static void main(String[] args){
        AccessCon s1 = new AccessCon();

        a1.push(5);
        a1.push(6);
        a1.push(8);

        

        System.out.println(a1.pop());

        AccessCon a2 = new AccessCon();
    }
}