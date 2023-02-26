package equilibriumPoint;

public class equilibriumPoint {
    public static void main(String[] args) {
        int i, sum=0, flagSum = 0, rightSum = 0, leftSum = 0, leftInd = 0, temp = 0;
        int[] a = { 1, 3, 5, 2, 2 };
        int size = 5;
        for(i=0;i<size;i++)
            sum += a[i];
        flagSum = sum/2;
        for(i = 0; i< size; i++){
            temp += a[i];
            leftInd = i;
            if(temp > flagSum)
                break;
            leftSum = temp;
        }
        temp = 0;
        for(i = 0; i< size; i++){
            temp += a[i];
            // leftInd = i;
            if(temp > flagSum)
                break;
            rightSum = temp;
        }
        if(leftSum == rightSum)
            System.out.println(leftInd);
    }
}


// static int i=1;
// // a: input array
// // n: size of array
// // Function to find equilibrium point in the array.
// public static int equilibriumPoint(long arr[], int n) {
//  int rs,ls;
    
//     if(i<n){
//         for(int j=0;j<i;j++){
//              ls+=arr[j];
//         }
//         for(int j=i+1;j<n;j++){
//             rs+=a[j];
//         }
//         if(ls==rs)
//         {
//             System.out.print(i);
//         }
//         else
//         {
//             ++i;
//             System.out.print(equilibriumPoint(arr[],n));
//         }
        
//     }
//     return -1;
       
       
// }
// }