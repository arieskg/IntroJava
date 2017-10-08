/******************************************************************************
 *
 *  This program computes a finite product (N! = 1 * 2 * .. * N)
 *
 *
 ******************************************************************************/

public class FiniteProduct {
    public static void main(String[] args) {


        int n = Integer.parseInt(args[0]);      // read in one command-line argument
        int product = 1;                        // because anything * 0 is 0, duh

        for (int i = 1; i <= n; i++){
          product *= i;
        }

        System.out.println(product);   // print out the power of two

    }
}
