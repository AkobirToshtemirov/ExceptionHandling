public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            String welcome = "Welcome!";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length - 1];
            System.out.println("Last Char: " + lastChar);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index Exception");
            e.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Any Exception");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            doSomething();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Code ran successfully!");

    }

    public static void doSomething() throws InterruptedException {
        Thread.sleep(1000);
    }
}
