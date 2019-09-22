import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CUS1151__lastName_HW1
{
    public static void main(String[] args) 
    {   
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println(list2);

        System.out.println(alternate(list1, list2));

    }
         public static List <Integer> alternate(List<Integer> list1, List<Integer> list2)
            {
            List result = new ArrayList<Integer>(); // we have a arraylist of integers
            Iterator i1 = list1.iterator();
            Iterator i2 = list2.iterator();
        // To do return result 
            while(i1.hasNext() || i2.hasNext())
            {
            // add first number from list1 to arraylist 
                if(i1.hasNext())
                {
                    result.add(i1.next());
                }
            // add the next number from list2 to arraylist
                if(i2.hasNext())
                {
                    result.add(i2.next());
                }
            }
        // return the arraylist
              return result;
        }
    }
