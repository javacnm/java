/********************************************************************************************************************
 *  Compiling a Java Program:    (this creates an output file with ".class" extension, for example, HelloWorld.class)
 *  -------------------------
 *  > javac HelloWorld.java    

 *  Executing(Running) a Java Program: 
   -----------------------------------
 * > java HelloWorld
*********************************************************************************************************************/

public class HelloWorld {
   public static void main(String[] args) {   
      // Prints "Hello, World" in console            
      System.out.println("Hello " + args[0] + "!");
      
   }
}