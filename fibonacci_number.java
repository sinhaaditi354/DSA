class Solution {
    public int fib(int n) {
        if(n==1 || n==0){
            return n;
        }
        int second = fib(n-1);
        int first = fib(n-2);
        return first+second;
    }
}



