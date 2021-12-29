import java.util.*;

public class userinputm {
    public static void main(String[] args) {
        String[] arr = new String[12];
        Scanner ss = new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            System.out.print("Enter Char " + (i+1) + " : ");
            String n = ss.nextLine();
            // System.out.println("");
            arr[i]=n;
        }
        System.out.println("Array contains : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        ss.close();
    }
}