public class forndifcheck {
    public static void main(String[] args) {
        int n1=0,n2=0;
        int i;
        System.out.println("************** Set Begins **************");
        System.out.println("Before loop n1,n2 are :"+ n1 + " , " + n2);
        for(i=0;i<5;i++){
            System.out.println("In for i,n1,n2 are :"  + i + " , "  + n1 + " , " + n2);
            if(++n1>2 && ++n2>2){
                System.out.println("In if before i,n1,n2 are :"  + i + " , "  + n1 + " , " + n2);
                n1++;
                System.out.println("In if after i,n1,n2 are :"  + i + " , "  + n1 + " , " + n2);
            }
        }
        System.out.println("After loop ends i,n1,n2 are :"  + i + " , "  + n1 + " , " + n2);
        System.out.println("************** Set Ends **************");
    }
}