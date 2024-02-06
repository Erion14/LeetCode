
class Solution {
    public int romanToInt(String s) { 
         HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int value = romanMap.get(currentChar);
            if(value < prevValue){
                result -= value;
            }
            else{
                result += value;   
            }
            prevValue = value; 
           
    }
    return result;
}
}