//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&sortBy=submissions

public class sorting012
{
    public static void main(int a[], int n)
    {
        int i, count0 = 0, count1 = 0, count2 = 0;
        for(i = 0; i<n; i++){
            if(a[i]==0)
                count0++;
            else if(a[i]==1)
                count1++;
            else if(a[i]==2)
                count2++;
        }
        for(i=0; i<count0; i++)
            a[i]=0;
        for(; i<count1+count0; i++)
            a[i]=1;
        for(; i<count2+count0+count1; i++)
            a[i]=2;
    }
}