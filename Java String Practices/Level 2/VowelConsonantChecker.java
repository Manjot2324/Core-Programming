import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        String[][] charTypes = findVowelsAndConsonants(inputString);
        displayCharTypes(charTypes);
    }

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] findVowelsAndConsonants(String str) {
        int length = getStringLength(str);
        String[][] charTypes = new String[length][2];
        
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            charTypes[i][0] = String.valueOf(ch);
            charTypes[i][1] = checkCharacterType(ch);
        }
        
        return charTypes;
    }

    public static void displayCharTypes(String[][] charTypes) {
        System.out.printf("%-10s %-20s%n", "Character", "Type");
        System.out.println("---------- --------------------");
        for (String[] charType : charTypes) {
            System.out.printf("%-10s %-20s%n", charType[0], charType[1]);
        }
    }
}
