public class PrefixAgain {
        public static void main(String[] args) {
            boolean res = prefixAgain("aa", 1);
            System.out.println(res);
        }

        public static boolean prefixAgain(String str, int n) {
            String r1 = str.substring(0, n);
            for(int i = n; i < str.length() - n; i++) {
                if(str.substring(i, i + n).equals(r1)){
                    return true;
                }
            }

            return false;
        }
}
