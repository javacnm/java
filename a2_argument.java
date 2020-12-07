/******************************************************************************************
* Compilation: javac a2_argument.java 
* Exection: java a2_argument sometext
*
* Prints "Hello Noor!" where "Noor" is replaced by the command-line argument
*******************************************************************************************/

public class a2_argument {
  public static void main(String[] args) {   
      //gets input from user (command line/terminal)
      string name = args[0]; 

      System.out.print("Hello ");
      System.out.print(name);
      System.out.print("!");      
      System.out.println(); //prints new line     
  }
}