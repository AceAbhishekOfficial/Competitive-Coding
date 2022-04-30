class q001
{
    public static void reverse(int arr[])
    {
        int start=0, end = arr.length-1;
        while(start<=end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main()
    {
        int arr[]={1,2,3,4,5};
        reverse(arr);
        for(int i: arr)
        System.out.println(i);
    }
}