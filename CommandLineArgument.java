/******************************************************************************************
* Compilation: javac Argument.java 
* Exection: java Argument sometext
*
* Prints "Hello Noor!" where "Noor" is replaced by the command-line argument
*******************************************************************************************/

public class CommandLineArgument {
  public static void main(String[] args) {   
      System.out.print("Hello ");
      System.out.print(args[0]);
      System.out.print("!");      
      System.out.println(); //prints new line     
  }
}