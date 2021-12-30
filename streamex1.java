import java.util.*;
public class streamex1 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        System.out.println("Enter Input : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            int dt = sc.nextInt();
            ls.add(dt);
        }
        System.out.println("Data Present in the List : ");
        // ls.stream().forEach(System.out::println);
        ls.sort((a,b) -> {
            if(a>b){
                return -1;
            }
            return 0;
        });
        ls.stream().forEach(System.out::println);
        sc.close();
    }
}
