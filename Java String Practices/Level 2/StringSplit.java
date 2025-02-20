import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        String[] customSplitWords = customSplit(inputString);
        String[] builtInSplitWords = inputString.split(" ");
        
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);
        
        System.out.println("Custom split result:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }
        
        System.out.println("Built-in split result:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }
        
        System.out.println("Are the results equal? " + areEqual);
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

    public static String[] customSplit(String str) {
        int length = getStringLength(str);
        int wordCount = 1;
        
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        
        String[] words = new String[wordCount];
        int startIndex = 0;
        
        for (int i = 0; i < wordCount; i++) {
            int endIndex = (i < wordCount - 1) ? spaceIndexes[i] : length;
            words[i] = str.substring(startIndex, endIndex);
            startIndex = endIndex + 1;
        }
        
        return words;
    }

    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        
        return true;
    }
}
