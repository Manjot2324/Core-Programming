import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String text) {
        int length = 0;
        while (text.charAt(length) != '\0') {
            length++;
        }
        return length;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            char currentChar = text.charAt(i);
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[index++] = currentChar;
            }
        }
        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
    }
}
