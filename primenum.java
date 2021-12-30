import java.util.Scanner;

public class primenum {
    public static boolean isPrime(int num){
        boolean a = true;
        for(int i = num-1; i>1; i--){
            if(num % i == 0){
                a = false;
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        System.out.println(isPrime(number));
        if(isPrime(number) == true){
            System.out.println(number+" is a Prime");
        }
        else{
            System.out.println(number + " is not a Prime");
        }
        sc.close();
    }
}
