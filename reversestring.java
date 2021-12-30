public class reversestring {
    public static void main (String[] args) {
       
        String str= "Muni Raghava", nstr="";
        char ch;
       
      System.out.println("Original word: " + str);
      System.out.println("");
      System.out.println("String Reversing Flow :");
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        nstr= ch+nstr;
        System.out.println(nstr);
      }
      System.out.println("");
      System.out.println("Reversed word: "+ nstr);
    }
}