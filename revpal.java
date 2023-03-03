public class revpal {
    public static void main(String[] args){
        String str = "madam";
        
        String str1="";

        for(int i = str.length()-1; i>=0; i--){
            str1 = str1+str.charAt(i);
        }
        if(str.equals(str1)){           //when checking string == is not good to work .equals is fine;
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Its not a palindrome");
        }
            System.out.print(str1);
            
        
    }
    
}
