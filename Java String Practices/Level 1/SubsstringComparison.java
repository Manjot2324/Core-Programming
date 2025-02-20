import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.next();
        System.out.println("Enter start index:");
        int start = scanner.nextInt();
        System.out.println("Enter end index:");
        int end = scanner.nextInt();

        String substringCharAt = createSubstringWithCharAt(str, start, end);
        String substringMethod = str.substring(start, end);

        System.out.println(substringCharAt.equals(substringMethod));
    }

    public static String createSubstringWithCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
