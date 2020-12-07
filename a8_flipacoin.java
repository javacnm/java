/******************************************************************************************
* Compilation: javac a8_flipacoin.java 
* Exection: java a8_flipacoin
*
* flips a coin and prints Heads or Tails
*
* Math.random() produces a pseudo-random real between 0.0 and 1.0
* 
*******************************************************************************************/

public class a8_flipacoin {
  public static void main(String[] args) {         
    double r = Math.random();
    
    if(r < 0.5)
      System.out.println("Heads ");
    else
      System.out.println("Tails ");    
  }
}