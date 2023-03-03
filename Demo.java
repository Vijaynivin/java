public class Demo {
    
    public static void main(String[] args){
         int[] n= new int[100];

        for(int i=0;i<n.length;i++){
            n[i]= i-1;
            for(int j=i+1;j<n.length;j++)
            if(n[i] != n[j]){
                System.out.println(n[j]);
            }
            
        }
        
    }
}
