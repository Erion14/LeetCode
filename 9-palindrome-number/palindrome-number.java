class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int n = x;
        int reversed = 0;
        while(x != 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        if(reversed == n){
            return true;
        }
        else{
            return false;
        }
    }
}