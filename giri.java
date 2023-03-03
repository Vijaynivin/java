public class giri {
    public static void main(String[] args){
        String str = "mada";
        
        String str1="";
        
        for(int i = 0;i < str.length()/2; i++){

            char u = str.charAt(i);
            char y = str.charAt(str.length()-i-1);

            int com = Character.compare(u, y);
            if(com==0){
                System.out.print("Its a palimdrome");
                break;
            }else{
        
            System.out.print("Its not a palindrome");
            break;
            }
        }
          
    }
    
}
