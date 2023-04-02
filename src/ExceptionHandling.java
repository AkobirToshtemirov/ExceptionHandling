public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            String welcome = "Welcome!";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length - 1];
            System.out.println("Last Char: " + lastChar);

            String nothing = null;
            System.out.println(nothing.length());
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Code ran successfully!");

    }
}
