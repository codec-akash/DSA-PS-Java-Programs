/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 */
public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char word = chars[i];
            if (!isContainsWord(chars, word, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isContainsWord(char[] words, char word, int currPos) {
        for (int i = 0; i < words.length; i++) {
            if (currPos == i) {
                continue;
            }
            if (words[i] == word) {
                return true;
            }
        }
        return false;
    }
}