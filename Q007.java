public class Q007 
{
    public void rotate(int arr[])
    {
        int temp =arr[arr.length-1];
        for(int a=arr.length-1;a>0;a--)
        arr[a]=arr[a-1];
        arr[0]=temp;
    }
}
