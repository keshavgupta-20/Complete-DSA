public class pallindrome {
    int isDigitSumPalindrome(int n) {
        int sum =0;
        int reverse = 0;
        while(n >0)
        {
            sum = sum + n%10;
            n = n/10;
        }
        int ans = sum;
        while(sum > 0){

            reverse  = reverse *10 + sum%10;
            sum = sum/10;
        }
        if(reverse == ans){
            return 1;
        }
        else{
            return 0;
        }
    }
}
