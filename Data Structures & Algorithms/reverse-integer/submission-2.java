class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        int reverse = 0;
        boolean isNegative = (x < 0);

        x = isNegative ? (x * -1) : x;

        while(x != 0){
            int digit = x % 10;
            x = x / 10;

            if(reverse > max / 10 || (reverse == max / 10 && digit > max % 10)){
                return 0;
            }

            if(reverse < min / 10 || (reverse == min / 10 && digit < min % 10)){
                return 0;
            }
            reverse = reverse * 10 + digit;
        }

        return isNegative ? reverse * -1 : reverse;
    }
}
