
         
import java.util.ArrayList;
import java.util.Arrays;
 
public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("alex", "brian", "charles","alex","dough","gary","alex","harry"));
         
        int firstIndex = list.indexOf("brian");
         
        System.out.println(firstIndex);
         
        firstIndex = list.indexOf("hello");
         
        System.out.println(firstIndex);
    }
}