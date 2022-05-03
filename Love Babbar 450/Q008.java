public class Q008
{
    long maxSubarraySum(int arr[], int n)
    {
        if(arr.length<=0) return 0;
        long max=Integer.MIN_VALUE;
        long sum=0;
        for(int a=0;a<arr.length;a++)
        {
            sum+=arr[a];
            if(sum>max) max= sum;
            if(sum<0) sum=0;
        }
        return max;
    }
}