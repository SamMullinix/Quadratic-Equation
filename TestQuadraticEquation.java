/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Lab:           12
 * Program:       7
 * ProgramName:   TestQuadraticEquation
 * Purpose:       To emplement the program QuadraticEquation to return the roots of input coefficients.
 * Operation:     Program prompts for user to input coefficients, an object with the coeffceients is created
 *                and based on the getDisciminant method, the correct roots are printed to the user.  
 * Input(s):      3 inputs, the coefficients.
 * Output(s):     Output prompts to enter a, b, and c. Then output the roots.
 * Methodology:   The program prompts the user for the inputs, then it creates the new object. The program
 *                is used to calculate the disciminant, and based on that the correct roots are calculated and
 *                returned to the user.
 *                
 */       
 
/***************************************
//  Import the java utility; Scanner  //
***************************************/

import java.util.Scanner;

public class TestQuadraticEquation
{
   public static void main (String[] args)
   {
      /********************************************
      //          Create new Scanner item        //
      ********************************************/
                   
      Scanner input = new Scanner(System.in);
      
      /******************************************************************************
      *                              Declare Variables                              *
      ******************************************************************************/
      
      double a = 0;
      double b = 0;
      double c = 0;
      
      /******************************************************************************
      *                                Input Section                                *
      ******************************************************************************/
      
      System.out.print("Enter a:\t");
      a = input.nextDouble(); // Inputs.
      System.out.print("Enter b:\t");
      b = input.nextDouble();
      System.out.print("Enter c:\t");
      c = input.nextDoubl e();
      
      /******************************************************************************
      *                          Calculation Section #1                             *
      ******************************************************************************/
      
      QuadraticEquation coefficient = new QuadraticEquation(a, b, c);   // Construct an object made of coefficients.
      
      /******************************************************************************
      *                               Output Section                                *
      ******************************************************************************/
      
      if (coefficient.getDiscriminant() > 0) // Correct output based on what the disciminant is.
      {
         System.out.print("\nThe equation has two roots " + coefficient.getRoot1() + " and " + coefficient.getRoot2());
      }
      
      else if (coefficient.getDiscriminant() == 0)
      {
         System.out.print("\nThe equation has one root " + coefficient.getRoot1());
      }
      
      else
      {
         System.out.print("\nThe equation has no real roots.");
      }
   }
}
