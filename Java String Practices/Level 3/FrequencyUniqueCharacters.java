import java.util.Scanner;

public class FrequencyUniqueCharacters {

    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
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

    public static int[] findCharacterFrequency(String text) {
        int[] freq = new int[256];
        int length = text.length();

        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);
        int[] freq = findCharacterFrequency(text);

        System.out.println("Frequency of unique characters:");
        for (char c : uniqueCharacters) {
            System.out.println(c + ": " + freq[c]);
        }
    }
}
