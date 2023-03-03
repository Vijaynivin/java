import java.util.HashMap;

public class Strcount{
    public static void main(String[] args){
        String str = "vi vi";
        String[] sp = str.split(" ");

        HashMap <String,Integer> map = new HashMap<String,Integer>();

        for(int i = 0; i<sp.length; i++){
            if(map.containsKey(sp[i])){
                int count = map.get(sp[i]);
                map.put(sp[i], count+1);
            }else{
                map.put(sp[i], 1);
            }
        }
        System.out.print(map);
    }
}