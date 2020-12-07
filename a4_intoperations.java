/******************************************************************************************
* Compilation: javac a4_intoperations.java 
* Exection: java a4_intoperations a b
*
* Integer operations a + b, a-b, a * b, a / b, a % b
* 
*******************************************************************************************/

public class a4_intoperations {
  public static void main(String[] args) {   
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    int sum = a + b; 
    int diff = a - b; 
    int product = a * b; 
    int quotient = a / b; 
    int reminder = a % b; 

    System.out.println(a + " + " + b + " = " + sum);
    System.out.println(a + " - " + b + " = " + diff);
    System.out.println(a + " * " + b + " = " + product);
    System.out.println(a + " / " + b + " = " + quotient);
    System.out.println(a + " % " + b + " = " + reminder);
  }
}