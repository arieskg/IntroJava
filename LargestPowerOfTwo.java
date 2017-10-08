/******************************************************************************
 *  Compilation:  javac LargestPowerOfTwo.java
 *  Execution:    java LargestPowerOfTwo n
 *
 *  This program prints largest power of two less than or equal to N
 *
 *
 ******************************************************************************/

public class LargestPowerOfTwo {
    public static void main(String[] args) {

        // read in one command-line argument
        int n = Integer.parseInt(args[0]);

        int v = 1;
        while (v <= n/2)
          v *= 2;

        System.out.println(v);   // print out the power of two

    }
}
