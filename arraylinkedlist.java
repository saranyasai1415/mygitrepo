import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class arraylinkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hi");
        linkedList.add("ji");
        linkedList.add("bi");

        Iterator it = linkedList.iterator();
        while(it.hasNext()){
    System.out.println("linkedList :"+it.next());
        }
        linkedList.remove(1);
        Iterator it1 = linkedList.iterator();
        while(it1.hasNext()){
            System.out.println("ls :"+it1.next());
        }


    }
}
