public class gratest
{
    public static void main (String args[])
{
int a[]={1,2,3,4,5,6,7,8,9,10};
int i, k=a[0];
for(i=0;i<10;i++)
{
    if(k < a[i])
    k=a[i];
}
System.out.println(k);
}
}