import java.util.*;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        else{
            Map<Character, Integer> counts = new HashMap<>();
            // char[] arr = s.toCharArray();
            for (char c : s.toCharArray()) {
                // getOrDefault handles adding the first occurrence of a character
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
            for (char c : t.toCharArray()) {
                if (!counts.containsKey(c) || counts.get(c) == 0) {
                    // Character not found or already used up more than available
                    return false;
                }
                // Decrement the count
                counts.put(c, counts.get(c) - 1);
            }
            return true;
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        // Sort the character arrays
        Arrays.sort(c1);
        Arrays.sort(c2);

        // Compare the sorted arrays
        return Arrays.equals(c1, c2);
    }

    public static void main(String[] args) {
        String input1 = "Race";
        String input2 = "Care";

        if (areAnagrams(input1, input2)) {
            System.out.println("\"" + input1 + "\" and \"" + input2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + input1 + "\" and \"" + input2 + "\" are not anagrams.");
        }
    }
}
