package n_aClasseMathSeusMetodos.exemplo_sem_o_uso_da_math.USANDOMATH;

import java.util.Scanner;

public class MaximumFinder 
{
   // obtain three floating-point values and determine maximum value
   public void determineMaximum()
   {
      // create Scanner for input from command window
      Scanner input = new Scanner( System.in );

      // prompt for and input three floating-point values
      System.out.print( 
         "Enter three floating-point values separated by spaces: " );
      double number1 = input.nextDouble(); // read first double
      double number2 = input.nextDouble(); // read second double
      double number3 = input.nextDouble(); // read third double

      // determine the maximum value
      double result = Math.max(number1,Math.max(number2,number3));
              
         }
}