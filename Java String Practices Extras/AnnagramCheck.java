import java.util.*;
class AnnagramCheck {
    public static void checkAn(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        checkAn(str1, str2);
    }
}