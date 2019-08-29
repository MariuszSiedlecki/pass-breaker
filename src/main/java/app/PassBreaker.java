package app;

import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PassBreaker {

    public void passBreaker(String password){
        String pass = null;
        String value;
        BigInteger counter = BigInteger.ZERO;
        long start = System.nanoTime();

        while ( true ){
            pass = RandomStringUtils.randomAlphabetic(password.length());
            counter = counter.add(BigInteger.ONE);
            if(pass.equalsIgnoreCase(password)){
                break;
            }
//            System.out.println(pass + " | " + counter);
//            try {
//                Thread.sleep(200);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
        }
        long stop = System.nanoTime();
        double elapsedTime = (double) (stop -start)/1_000_000_000;
        double convert = TimeUnit.MILLISECONDS.convert((stop-start),TimeUnit.NANOSECONDS);
        System.out.println("BROKEN!" + counter + " | " + pass + " at time sec. " + elapsedTime);
    }
}
