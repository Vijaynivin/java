public class Nithiya{

    public static void main(String[] args){
        String str ="vijay";
        String str1 = "";

        for(int i=0;i<str.length()/2;i++){

            char u = str.charAt(i);
            char y = str.charAt(str.length()-1-1);

            int com = Character.compare(u,y);
            if(com==0){
                System.out.print("its is a palimdrom");
                break;
            }else{
                System.out.print("its i a not palimdrom");
                break;
            }
        }
    }
}