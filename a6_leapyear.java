/******************************************************************************************
* Compilation: javac a6_leapyear.java 
* Exection: java a6_leapyear a b
*
* Checks if a give year is Leap Year or not.
*
* A year is a leap year if the following conditions are satisfied: 
*   The year is multiple of 400. OR 
*   The year is multiple of 4 and not multiple of 100.
*
*******************************************************************************************/

public class a6_leapyear {
  public static void main(String[] args) {     
    //get input from user
    int year = Integer.parseInt(args[0]);
    
    boolean isLeapYear = (year % 400 == 0);
    
    isLeapYear = isLeapYear || (year % 4 == 0 && year % 100 != 0);

    if(isLeapYear)
      System.out.println(year + " is a leap year");
    else
      System.out.println(year + " is NOT a leap year");
  }
}