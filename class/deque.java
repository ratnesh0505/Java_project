import java.util.*;

public class deque {
    public static void main(String[]args){
        Deque<String>deque=new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("After offFirst Traversal...");
    }
}
