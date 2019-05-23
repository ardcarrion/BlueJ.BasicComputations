 

import java.util.Scanner;

public class NormalizeAngle {

    public static Integer normalizeValueUsingModulo(Integer angle){
        int normalized;
        int remainder = angle % 360;
        if (remainder < 0) {
            normalized = remainder + 360;
        } else {
            normalized = remainder;
        }
        return normalized;
    }

    public static Integer normalizeValueUsingFloorMod(Integer integer){
        return Math.floorMod(integer, 360);
    }

    public static void main(String[] args){
        System.out.println("Give me an integer angle: ");
        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        Integer normalized = normalizeValueUsingModulo(number);
    
        System.out.printf("The normalized angle is: %d\n", normalized);
        
        
    }
}
