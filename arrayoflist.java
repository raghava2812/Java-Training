import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayoflist {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1 :");
        String N1 = sc.nextLine();
        ls.add(N1);
        System.out.println("Enter String2 :");
        String N2 = sc.nextLine();
        ls.add(N2);
        System.out.println("Data Present in list : ");
        ls.forEach(System.out::println);
        sc.close();
    }
}