public class primeall {
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
        int i;
        for(i=2; i<=100; i++){
            if(isPrime(i) == true){
                System.out.println(i + " is a Prime");
            }
            else System.out.println(i + " is not a Prime");
        }
    }
}
