package Corejava;

public class Operators {
    public static void main(String[] args){
        // Arithmetic Operators:
        System.out.println("Arithmetic Operators");
        int x=14,y=5;
        System.out.println("x+y=" + (x+y));// Addition
        System.out.println("x-y=" + (x-y));// Subtraction
        System.out.println("x*y=" + (x*y));// Multiplication
        System.out.println("x/y=" + (x/y));// Division
        System.out.println("x%y=" + (x%y));// Modulo

        // Assignment Operators:
        System.out.println("Assignment Operators");
        int a = 4;
        int var;
        var = a;
        System.out.println("var using =: " + var);
        var += a;
        System.out.println("var using +=: " + var);
        var *= a;
        System.out.println("var using *=: " + var);

        // Relational Operators:
        System.out.println("Relational Operators");
        int num1 = 8;
        int num2 = 12;

        System.out.println(num1 == num2);    // == operator
        System.out.println(num1!= num2);    // != operator
        System.out.println(num1 > num2);    // > operator
        System.out.println(num1< num2);     // < operator
        System.out.println(num1>= num2);    // >= operator
        System.out.println(num1<= num2);    // <= operator

        //Logical Operators:
        System.out.println("Logical Operators");
        boolean p1 = true;
        boolean p2 = false;

        System.out.println("x && y: " + (p1 && p2));
        System.out.println("x || y: " + (p1 || p2));
        System.out.println("!x: " + (!p1));

        // Unary operators
        System.out.println("Unary Operators");
        int n1 = 10;
        int n2= 10;
        System.out.println("Post increment : " + (n1++));
        System.out.println("Pre increment : " + (++n1));
        System.out.println("Post decrement : " + (n2--));
        System.out.println("Pre decrement : " + (--n2));

        // Bitwise Operator:
        System.out.println("Bitwise Operators");
        int s1 = 60;
        int s2 = 13;
        int s3 = 10;

        s3= s1 & s2;  // Bitwise AND
        System.out.println("s1 & s2 = " + s3 );
        s3 = s1 | s2;  // Bitwise OR
        System.out.println("s1 | s2 = " + s3 );
        s3= s1 ^ s2;  // Bitwise XOR
        System.out.println("s1 ^ s2 = " + s3 );
        s3= ~ s1;  // Bitwise compliment
        System.out.println("s1 ~ s2 = " + s3 );
        s3= s1 >> 4;  // Bitwise Right Shift
        System.out.println("s1 >> 4 = " + s3 );
        s3= s1 << 2;  // Bitwise Left Shift
        System.out.println("s1 << 2 = " + s3 );





    }
}
