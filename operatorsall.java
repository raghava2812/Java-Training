public class operatorsall{  
    public static void main(String args[]){  
    int x=10;
    int a=11;
    int b=12;
    int c=13;
    boolean c1=true;
    boolean d1=false;
    // Unary Operator
    System.out.println("Unary Operator :");
    System.out.println(x++);//10
    System.out.println(++x);//12
    System.out.println(x--);//12
    System.out.println(--x);//10
    System.out.println(a++ + ++a);//24
    System.out.println(b++ + b++);//25
    System.out.println(~a);//-14
    System.out.println(~b);//-15
    System.out.println(!c1);//false
    System.out.println(!d1);//true

    // Arithmetic Operator
    System.out.println("Arithmetic Operator");
    System.out.println(a+b);//27
    System.out.println(a-b);//-1
    System.out.println(a*b);//182
    System.out.println(a/b);//0
    System.out.println(a%b);//13
    System.out.println(10*10/5+3-1*4/2);//21

    //Left Shift Operator
    System.out.println("Shift Operator");
    System.out.println("Left Shift Operator :");
    System.out.println(10<<2);//40
    System.out.println(10<<3);//80
    System.out.println(20<<2);//80
    System.out.println(15<<4);//240
    // Right Shift Operator
    System.out.println("Right Shift Operator :");
    System.out.println(10>>2);//2
    System.out.println(20>>2);//5
    System.out.println(20>>3);//2
    System.out.println(20>>2);//5
    System.out.println(20>>>2);//5
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2);//-5
    System.out.println(-20>>>2);//1073741819

    // AND Operator Example: Logical && and Bitwise &
    System.out.println("Logical Operator");
    System.out.println("AND Operator : Logical (&&) and Bitwise (&) :");
    System.out.println(a<b&&a<c);//false
    System.out.println(a<b&a<c);//false
    System.out.println(a<b&&a++<c);//false
    System.out.println(a<b&a++<c);//false
    // OR Operator Example: Logical || and Bitwise |
    System.out.println("OR Operator : Logical (||) and Bitwise (|) :");
    System.out.println(a>b||a<c);//true
    System.out.println(a>b|a<c);//true
    System.out.println(a>b||a++<c);//true
    System.out.println(a>b|a++<c);//true

    // Ternary Operator
    System.out.println("Ternary Operator :");
    int min=(a<b)?a:b;  
    System.out.println(min);//14

    // Assignment Operator
    System.out.println("Assignment Operator :");
    int p = (a+=3);
    System.out.println(p);  //19
    int q = (a-=4);
    System.out.println(q);  //15
    int r = (a*=2);
    System.out.println(r);  //30
    int s = (a/=2);
    System.out.println(s);  //15

    }
}