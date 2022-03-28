public class Solution {
    public int solve(int A) {
        long a=A;
        long low=1,high=a, mid = (low+high)/2;
        while(low<=high){
            mid=(low+high)/2;
            if(mid*mid<a) low = mid+1;
            else if(mid*mid>a) high = mid -1;
            else if (mid*mid == a) return (int)mid;
        }
        return -1;
    }
}

