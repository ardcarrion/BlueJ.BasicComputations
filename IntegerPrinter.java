 

import java.util.Scanner;

public class IntegerPrinter {

    public static String printIntegerAsBinary(int value){
        return Integer.toBinaryString(value);
    }

    public static String printIntegerAsOctal(int value){
        return Integer.toOctalString(value);
    }

    public static String printIntegerAsHexadecimal(int value){
        return Integer.toHexString(value);
    }

    public static void main(String[] args){
        System.out.println("Give me an integer:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        
        String binaryRep = printIntegerAsBinary(number);
        String octalRep = printIntegerAsOctal(number);
        String hexRep = printIntegerAsHexadecimal(number);
        
        System.out.printf("In binary %d is: %s\n", number, binaryRep);
        System.out.printf("In octal %d is: %s\n", number, octalRep);
        System.out.printf("In hexadecimal %d is: %s\n", number, hexRep);
        
      
    }
}
