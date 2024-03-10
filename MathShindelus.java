import java.util.Scanner;
/*
Name: Rachel Shindelus
Date: 10/24/2022
Program Description: This program works as a simple calculator and request the users input to enter two different integers and their required operand. 
   The program then completes the operation and displays the output in words. 
Self Grade: I beleive I should receive 100% for this assignment as I have completed each required task and designed the desired working program.
*/
public class MathShindelus {
}
class Expression  {
   public static void main(String[] args)   {
      start();
   }
   /* Request a users input for the operand and two different integers. Displays the desired calculation and it's results in words. */
   public static void start()   {
      Scanner kb = new Scanner(System.in);
      System.out.print("How many times do you want to use the software: ");
      int count = kb.nextInt();
      menu();
      for(int i = 1; i <= count; i++)     {  
         System.out.print(" Enter the desired operation: ");
         String operation = kb.next();
         System.out.print(" Enter a number 1-9: ");
         int firstNum = kb.nextInt();
         System.out.print(" Enter a number 1-9: ");
         int secondNum = kb.nextInt();
         convertNumToWord(firstNum);
         convertOpToWords(operation);
         convertNumToWord(secondNum);
         evaluate(firstNum, secondNum, operation);
         System.out.println("\n");       
      }
   }
   /* Using switch statments, takes the users input of the desired operator and returns the name of the operand. */
   public static String convertOpToWords(String operator)   {
     switch(operator)   {
      case "+":
      System.out.print("plus");     
      break;
      case "-": 
      System.out.print("minus");     
      break;   
      case "*":
      System.out.print("multiplied by");     
      break;
      case "/":
      System.out.print("divided by");     
      break;
      case "^":
      System.out.print("to the power of");     
      break;
      case "%":
      System.out.print("modulo");     
      break;
     }
      return "";
   }
   /* Using only if/else statements, this method gets a number 1-9 from the users input and returns it in  words. */
   public static String convertNumToWord(int a)   {       
     if(a == 1)
      System.out.print(" one ");
     else if(a == 2)
      System.out.print(" two ");
     else if(a == 3)
      System.out.print(" three ");
     else if(a == 4)
      System.out.print(" four ");
     else if(a == 5)
      System.out.print(" five ");
     else if(a == 6)
      System.out.print(" six ");
     else if(a == 7)
      System.out.print(" seven ");
     else if(a == 8)
      System.out.print(" eight ");
     else if(a == 9)
      System.out.print(" nine ");
     else
      System.out.print("Invalid Input");
      return "";
   }
   /* Using the switch case method, this method gets two numbers and the operation and returns the result of the expression. */
   public static int evaluate(int a, int b, String op)   {        
      System.out.print("equals ");
      switch(op)   {
      case "+":
      System.out.print(a + b);     // Adds the integers
      break;
      case "-": 
      System.out.print(a - b);     // Subtracts the integers
      break;   
      case "*":
      System.out.print(a * b);     // Multiplies the integers
      break;
      case "/":
      System.out.print(a / b);     // Divides the integers (no decimals)
      break;
      case "^":
      System.out.print(Math.pow(a, b));     // a to the power of b
      break;
      case "%":
      System.out.print(a % b);     // a modulo b
      break;
     } 
      return 0;                 
   }
   /* A list of all possible operations displayed. Print only. */
   public static void menu()
   {
     System.out.println(" _________OPERATIONS________  \n"
                      + "| Addition       |   ( + )  | \n"
                      + "| Subtraction    |   ( - )  | \n"
                      + "| Multiplication |   ( * )  | \n"
                      + "| Division       |   ( / )  | \n"
                      + "| Exponent       |   ( ^ )  | \n"
                      + "| Modulous       |   ( % )  | \n"
                      + " ---------------------------    ");
   }
}