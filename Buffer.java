import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Buffer {
    public static void main(String[] args)
    throws IOException
    {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));


        String name = read.readLine();

        System.out.println(name);
   }
}