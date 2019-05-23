 
import java.math.BigInteger;

public class Factorial {
    
    public BigInteger factorialOf(Integer value){
        
        BigInteger count = BigInteger.ONE;
        BigInteger number = BigInteger.valueOf(value);
        BigInteger result = number;
        while (count.compareTo(number) != 0) {
            result = result.multiply(count);
            count = count.add(BigInteger.ONE);
        }
        return result;
    }

}
