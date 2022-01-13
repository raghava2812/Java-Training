import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listinputs {
    public static void main(String[] args) {
        List<Integer> ls= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for( int i=1; i<=10; i++){
            int inp= sc.nextInt();
            ls.add(inp);
        }
        sc.close();
        System.out.println("List Contains :");
        ls.stream().forEach(System.out :: println);
        // for (int i=1; i<=10; i++){
        //     System.out.println(ls.get(i));
        // }
        // ls.stream()
        // .sorted((p1, p2)->p1.x.compareTo(p2.x))
        // .forEach(System.out::println);
        System.out.println("After Sorting :");
        ls.stream().sorted().forEach(System.out::println);
    }
}