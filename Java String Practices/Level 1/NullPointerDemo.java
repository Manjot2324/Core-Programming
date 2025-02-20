public class NullPointerDemo {
    public static void main(String[] args) {
        generateNullPointerException();
        handleNullPointerException();
    }

    public static void generateNullPointerException() {
        String str = null;
        System.out.println(str.length());  
    }

    public static void handleNullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());  
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }
}
