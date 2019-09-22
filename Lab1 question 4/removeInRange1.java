import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;;
public class removeInRange1
{
    public static void removeInRange(List<Integer> list, int value, int min, int max)
    {
        Iterator<Integer> itr = list.iterator(); 
        //to do 
        int index = 0;

        while(itr.hasNext())
        {
            if(index< max && index >= min )
            {
                if (itr.next() == value)
                {
                    itr.remove();
                    index--;
                    max--;
                }
            }
            else
            {
                itr.next();
            }
            index++;
        }
    }



    public static void main(String []args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(5);
        list1.add(6);
        list1.add(5);
        list1.add(7);
        list1.add(5);
        list1.add(5);
        list1.add(8);
        list1.add(9);
        list1.add(5);
        list1.add(0);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(5);
        list1.add(5);
        list1.add(5);
        System.out.println(list1);
        removeInRange(list1, 5, 0, 21);
        System.out.println("All the 5 are gone");
        System.out.println(list1);
    }
}
 

