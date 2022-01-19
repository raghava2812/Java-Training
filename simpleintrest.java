import java.util.Scanner;

public class simpleintrest {
    static int p,r,t;
    static double si;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        p=s.nextInt();
        r=s.nextInt();
        t=s.nextInt();

        si = (p*r*t)/100;

        System.out.println(si);
        s.close();
    }
}
