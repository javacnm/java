/******************************************************************************************
* Compilation: javac a9_loops.java 
* Exection: java a8_loops
*
* Demonstrates loops in java
* Prints all prime numbers under 100. 
*
* The prime algorithm used here only works for below 100. because for more than 100, we should check for all possible divisors that are less than sqrt(n)
* 
*******************************************************************************************/

public class a9_loops {
  public static void main(String[] args) {         
    //print all primes under 100. 1 is not a prime.
    for(int i = 2; i <= 100; i++) 
    {
      int j = 2;

      while(j <= 10) {
        if (i != j && i > j && i % j == 0) // if the number is divisible with any number from 2 to 9, it is not prime
          break;
        j++;
      }
      
      if( j > 10) // if is not divisible by any number between 2 and 9, then it is a prime
        System.out.println(i);
      
      j = 2; //reset j
    }        
  }
}

