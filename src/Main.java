import java.util.HashMap;

public class Main {

    // This is for question 1.1 from Cracking The Coding Interview
    public static void main(String[] args) {
        System.out.println(isUnique("abcdefg"));
        System.out.println(isUnique("aabd"));
    }
    private static boolean isUnique(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.putIfAbsent(str.charAt(i), i) != null) {
                return false;
            }
        }
        return true;
    }
}
