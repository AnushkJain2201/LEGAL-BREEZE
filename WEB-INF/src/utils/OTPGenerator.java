package utils;
import java.util.Random;
public class OTPGenerator{
    public static String generateOTP(){
        return Integer.toString(new Random().nextInt(8889)+1111);
    }
}