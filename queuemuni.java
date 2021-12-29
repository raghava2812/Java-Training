import java.util.ArrayDeque;
import java.util.Queue;

public class queuemuni{
    public static void main(String[] args) {
        Queue<String> a = new ArrayDeque<>();

        a.offer("Muni");
        a.offer("Raghava");
        a.offer("Nellore");
        a.offer("Naidupeta");

        a.forEach(System.out::println);
    }
}