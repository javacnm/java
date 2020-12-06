/******************************************************************************************
* Compilation: javac Argument.java 
* Exection: java Argument sometext
*
* Prints concatenated strings
*******************************************************************************************/

public class StringConcatenation {
  public static void main(String[] args) {   
    String part1 = " * ";
    String part2 = part1 + " # " + part1; 
    String part3 = part2 + " @ " + part2;
    String part4 = part3 + " % " + part3;
    String part5 = part4 + " ^ " + part4;
    
    System.out.println(part1);
    System.out.println(part2);
    System.out.println(part3);
    System.out.println(part4);
    System.out.println(part5);
  }
}