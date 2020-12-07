/******************************************************************************************
* Compilation: javac a7_random.java 
* Exection: java a7_random a b
*
* prints a random integer between 0 and n-1
*
* Math.random() produces a pseudo-random real between 0.0 and 1.0
* the pseso-rand real number will be multiplied by the input from user and then excplicitly type casted to integer
*******************************************************************************************/

public class a7_random {
  public static void main(String[] args) {     
    //get input from user
    int n = Integer.parseInt(args[0]);

    double r = Math.random();
    int randomNumber = (int) (r * n); // r*n gives a double which need to be type casted to integer

    System.out.println("A Random number: " + randomNumber);
    
  }
}