public class reverseString {
    public static String reverse(String orig){
      char[] s = orig.toCharArray();
      int n = s.length;
      int halfLength = n / 2;
      for (int i=0; i<halfLength; i++){
        char temp = s[i];
        s[i] = s[n-1-i];
        s[n-1-i] = temp;
      }
      return new String(s);
    }

    public static void main(String[] args) {

        String kevin = "kevinistry";
        String results = reverse(kevin);

        System.out.println(results);
    }
}
