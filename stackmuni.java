import java.util.Stack;

public class stackmuni {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Pallamala");
        stack.push("Muni");
        stack.push("Raghava");
        stack.push("Nellore");
        stack.push("Andhra Pradesh");
        System.out.println(stack.pop());
        stack.push("Andhra - 524421");
        stack.forEach(System.out::println);
    }
}
