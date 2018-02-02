
import java.io.*;

public class shifting_characters 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        StringBuffer sin = new StringBuffer(br.readLine());
        int k = Integer.parseInt(br.readLine());
        
        StringBuffer sout = new StringBuffer(sin);
        for(int i = 0 ; i < sin.length();i++)
        {
            sout.setCharAt((i+k)%sin.length(), sin.charAt(i));
        }
    }
}
