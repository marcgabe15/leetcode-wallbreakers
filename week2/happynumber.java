class Solution {
    public boolean isHappy(int n) {
                int slow, fast;
        slow = n;
        fast = n;
        do {
            slow = squareDigitSum(slow);
            fast = squareDigitSum(fast);
            fast = squareDigitSum(fast);

        } while (slow != fast);
        
        if(slow == 1)
            return true;
        else
            return false;
    }
    public int squareDigitSum(int n){
        int sum = 0;
        int rem;
        
        while(n != 0){
            rem = n%10;
            sum += rem * rem;
            n = n/10;
        }
        
        return sum;
    }
    
    
   
}