public class primepallin {
    public static boolean isPrime(int num){
        boolean prime = true;
        for(int i=num-1; i>1; i--){
            if(num %i == 0){
                prime=false;
            }
        }
        return prime;
    }

    public static boolean isPalindrome(int num){
        String s = num + "";
        String r = "";
        char ch;
        for (int i=0; i<s.length(); i++){
            ch= s.charAt(i);
            r= ch+r;
        }
        if(r.equals(s)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        int i;
        System.out.println("The Prime Palindrome Numbers are : ");
        for(i=2; i<=200; i++){
            if(isPrime(i) && isPalindrome(i) == true){
                System.out.println(i);
            }
        }
    }
}