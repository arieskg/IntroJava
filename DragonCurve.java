public class DragonCurve {
    public static void main(String[] args) {
        // F = Forward, L = Left, R = Right.
        // 1). F
        // 2). FLF
        // 3). FLFLFRF
        // 4). FLFLFRFLFLRFRF
        String f = "F";
        String l = "L";
        String r = "R";
        char[] s = secondFold.toCharArray();
        int n = s.length
        int halfLength = n / 2;
        for (int i=0; i<halfLength; i++){
          char temp = s[i];
          s[i] = s[n-1-i];
          s[n-1-i] = temp;
        }


        String reversedFold = for (int i = int foldReverse.length-1; i >= 0; i--)


        String firstFold = f;
        String secondFold = firstFold + l + f;
        String thirdFold = secondFold + l + secondFold.reverse() + f;
        String fourthFold = thirdFold + l + thirdFold.reverse() + f;
        System.out.println(fourthFold);
    }
}
