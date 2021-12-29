import java.util.ArrayList;
import java.util.List;

public class listex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(-20);
        list.add(11);
        list.add(100);
        list.add(-30);
        int bigger=0;
        int smaller=0;
        for(int i=0; i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                bigger = list.get(i);
                smaller = list.get(i+1);
            }
        }
        System.out.println(bigger);
        System.out.println(smaller);
    }
}