class Solution {
    public String intToRoman(int num) {
        StringBuilder Roman = new StringBuilder();
        int[][] IntRoman = {{1000, 0}, {900, 1}, {500, 2}, {400, 3}, {100, 4}, {90, 5}, {50, 6}, {40, 7}, {10, 8}, {9, 9}, {5, 10}, {4, 11}, {1, 12}};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        for (int i = 0; i < IntRoman.length; i++){
            while (num >= IntRoman[i][0]){
                Roman.append(romanSymbols[IntRoman[i][1]]);
                num -= IntRoman[i][0];
            }
        }
        return Roman.toString();
    }
}
