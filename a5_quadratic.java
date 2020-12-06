/******************************************************************************************
* Compilation: javac a5_quadratic.java 
* Exection: java a5_quadratic a b
*
* Implementation of Quadratic Forumala: if ax2+bx+c = 0, then x = (-b +(or -) sqrt(b2 - 4ac)) / 2a
*
* Illustrates Math functions and Double operations
*
* Given b, and c, find the values of x in the equation: x2 + bx + c = 0
* User inputs b and c values in the command line
*******************************************************************************************/

public class a5_quadratic {
  public static void main(String[] args) {     
    double b = Double.parseDouble(args[0]);
    double c = Double.parseDouble(args[1]);
    
    double a = 1;
    //Quadratic formula: x = (-b +(or -) sqrt(b2 - 4ac))/ 2a

    double determinant = b*b - 4*a*c;
    double square_root_of_determinant = Math.sqrt(determinant);
    double x1 = (-b + square_root_of_determinant) / (2 * a);
    double x2 = (-b - square_root_of_determinant) / (2 * a);

    System.out.println("values of x are: " + x1 + " and " + x2);

  }
}