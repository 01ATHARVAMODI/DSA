class Solution
{
    public boolean isPalindrome(int n)
    {
        int i , rev = 0 , d , num;
       
        if(n<0)
        {
            return false;
        }
        num = n;
        while(num!=0)
        {
            d = num%10;
            rev = rev*10 + d;
            num /= 10;
        }
        if(n == rev)
        {
            return true;
        }
        return false;
    }
}