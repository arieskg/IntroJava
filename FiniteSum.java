/******************************************************************************
 *  Compilation:  javac LargestPowerOfTwo.java
 *  Execution:    java LargestPowerOfTwo n
 *
 *  computes a finite sum ( 1 + 2 + ... + N)
 *
 *
 ******************************************************************************/

public class FiniteSum {
    public static void main(String[] args) {

        // read in one command-line argument
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 1; i <= n; i++){
          sum += i;
        }
        
        System.out.println(sum);   // print out the power of two

    }
}
