class Solution {
    public int lengthOfLastWord(String s) {
        String words[] = s.split("\\s+");
        String lastWord = words[words.length -1];
        int length = lastWord.length();
        return length;
    }
}