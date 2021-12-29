import java.util.ArrayList;
import java.util.List;

public class listmuni {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(23);
        list.add(45);
        list.add(2);
        list.add(12);
        // if(list.contains(23)) {
        //     System.out.println("Yes the list contains");
        // } else {
        //     System.out.println("No, the list don't");
        // }
        System.out.println("List Contains :");
        for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
        }
    }
}