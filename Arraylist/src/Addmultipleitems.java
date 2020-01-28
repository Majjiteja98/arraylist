import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Addmultipleitems 
{
    public static void main(String[] args) 
    {
        List<String> namesList = Arrays.asList( "alex", "brian", "charles");  
        ArrayList<String> otherList = new ArrayList<>();
        otherList.addAll(namesList);    
        System.out.println(otherList);
            }
}