/******************************************************************************************
* Compilation: javac a10_isprime.java 
* Exection: java a10_isprime
*
* Checks if a given number is prime or not
* Observe that all primes greater than 3 are of the form 6k ± 1, where k is any integer greater than 0. 
* This is because all integers can be expressed as (6k + i), where i = −1, 0, 1, 2, 3, or 4. Note that 2 divides (6k + 0), (6k + 2), and (6k + 4) 
* and 3 divides (6k + 3). 
* So, a more efficient method is to test whether n is divisible by 2 or 3, then to check through all numbers of the form 6k+-1 <= sqrt(n) 
* This is 3 times faster than testing all numbers up to √n.
*******************************************************************************************/

public class a10_isprime {
  public static void main(String[] args) {         
      int n = Integer.parseInt(args[0]);
      System.out.println(isPrime(n));
  }

  public static boolean isPrime(int n)
  {
      if(n < 3)
        return n > 1;       
      if(n % 2 == 0 || n % 3 ==0)
        return false;
      
      int i = 5; 
      int sqrtofn = (int) Math.sqrt(n);

      while(i <= sqrtofn) {
        if(n % i == 0 || n % i + 2 == 0)
          return false;
        i+=6; 
      }        
      return true;    
  }
}