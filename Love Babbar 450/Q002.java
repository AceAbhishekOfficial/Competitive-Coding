
class pair 
{
    long first, second;
    public pair(long first, long second) 
    {
        this.first = first;
        this.second = second;
    }
}

public class Q002 
{
    static pair getMinMax(long a[], long n) 
    {
        long max = a[0], min = a[0];
        for (long i : a)
            if (i > max)
                max = i;
            else if (i < min)
                min = i;
        pair pr = new pair(min, max);
        return pr;
    }
}
