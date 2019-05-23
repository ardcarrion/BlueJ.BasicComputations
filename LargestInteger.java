 

import java.util.Scanner;

public class LargestInteger {

    public static Integer findLargestNumberUsingConditional(Integer[] integers){
        int largest;
        
        int first = integers[0];
        int second = integers[1];
        int third = integers[2];
        
        if (first > second && first > third) {
            largest = first;
        } else if (second > first && second > third) {
            largest = second;
        } else {
            largest = third;
        }
        return largest;
    }

    public static Integer findLargestNumberUsingMathMax(Integer[] integers){
        int first = integers[0];
        int second = integers[1];
        int third = integers[2];
        
        return Math.max(first, Math.max(second, third));
    }
    
}
