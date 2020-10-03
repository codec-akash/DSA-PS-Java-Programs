/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        char[] secondWord = t.toCharArray();
        for (char letter : secondWord) {
            if (!isContainsLetter(s, letter)) {
                return false;
            }
        }
        return true;
    }

    private boolean isContainsLetter(String word, char specificLetter) {
        return word.contains(String.valueOf(specificLetter));
    }
}