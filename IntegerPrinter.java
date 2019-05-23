 

import java.util.Scanner;

public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        return Integer.toBinaryString(value);
    }

    public String printIntegerAsOctal(int value){
        return Integer.toOctalString(value);
    }

    public String printIntegerAsHexadecimal(int value){
        return Integer.toHexString(value);
    }

    public static void main(String[] args){
        System.out.println("Give me an integer:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        
        String binaryRep = Integer.toBinaryString(number);
        String octalRep = Integer.toOctalString(number);
        String hexRep = Integer.toHexString(number);
        
        System.out.printf("In binary %d is: %s\n", number, binaryRep);
        System.out.printf("In octal %d is: %s\n", number, octalRep);
        System.out.printf("In hexadecimal %d is: %s\n", number, hexRep);
        
      
    }
}
