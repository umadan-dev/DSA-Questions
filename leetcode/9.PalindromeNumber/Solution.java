class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        if(x<0) return false;
        for(int i=x;i>0;i/=10){
            reverse = reverse*10+i%10;
        }
        if(reverse==x) return true;
        return false;
    }
}
