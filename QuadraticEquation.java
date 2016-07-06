/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Lab:           12
 * Program:       7
 * ProgramName:   QuadraticEquation
 * Purpose:       Used from a test program to take in three coefficents and determine the discriminant and the roots.
 * Operation:     Program has a constructor with arguments a b and c from the test program, and getter methods for
 *                each of the arguments. Then the program has a method to find the discriminant given the coefficients.
 *                Last it has one for each + and - root.
 * Input(s):      Double values a, b, and c from test program.
 * Output(s):     Output the discriminant, and teh two roots if required.
 * Methodology:   The program is used from a test program, takes coefficients, constructs an object and returns the
 *                discriminant, and the proper roots when called.
 *                
 */
 
public class QuadraticEquation
{
   private double a;
   private double b;    // Variables, private.
   private double c;
 
   QuadraticEquation(double a,double b,double c)   // Constructor, arguments a, b, and c.
   {
      getA(a); // Method calls to set parameters equal to inputs from test program, get the variables.
      getB(b);
      getC(c);
   }
   
   public double getA(double a)  // Method to get a.
   {
   this.a = a;
   return a;
   }
   
   public double getB(double b)  // Method to get b.
   {
   this.b = b;
   return b;
   }
   
   public double getC(double c)  // Method to get c.
   {
   this.c = c;
   return c;
   }
 
   public double getDiscriminant()  // Method to get the discriminant.
   {
      return getB(b) * getB(b) - 4 * getA(a) * getC(c);
   }
   
   public double getRoot1()         // Method to get first root.
   {
      return (-getB(b) + Math.pow(getDiscriminant(), .5)) / (2 * getA(a));
   }
   
   public double getRoot2()         // Method to get second root.
   {
      return (-getB(b) - Math.pow(getDiscriminant(), .5)) / (2 * getA(a));
   }
}