import java.util.Scanner;

public class FrequencyNestedLoops {

    public static int[] findCharacterFrequency(String text) {
        int length = text.length();
        int[] freq = new int[length];

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != '\0') {
                freq[i] = 1;
                for (int j = i + 1; j < length; j++) {
                    if (text.charAt(i) == text.charAt(j)) {
                        freq[i]++;
                        text = text.substring(0, j) + '\0' + text.substring(j + 1);
                    }
                }
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[] freq = findCharacterFrequency(text);
        System.out.println("Character frequencies:");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '\0') {
                System.out.println(text.charAt(i) + ": " + freq[i]);
            }
        }
    }
}
