public class Q005 
{
    public static void rearrange(int arr[])
    {
        int i=0;
        for(int a:arr)
        {
            if(a>0)
            break;
            i++;
        }
        for(int a=i+1;a<arr.length;a++)
        if(arr[a]<0)
        {
            int temp = arr[a];
            arr[a] = arr[i];
            arr[i] = temp;
            i++;
        }
    }   
}
