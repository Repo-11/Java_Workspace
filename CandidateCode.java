/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.IOException;
import java.util.Scanner;

public class CandidateCode {
    public static void main(String args[]) throws IOException {
        int i, N, pwrGirls, temp = 0;
		Scanner scr = new Scanner(System.in);
		
        //Input
		N = scr.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        System.out.println();
        for(i = 0; i<N; i++)
			arr1[i] = scr.nextInt();
        System.out.println();
        for(i = 0; i<N; i++)
			arr2[i] = scr.nextInt();
		
        //Calculate
		i=0;
		pwrGirls = arr2[i] / arr1[i];
        for(; i<N-1; i++)
		{
            temp = (arr2[i]/arr1[i]<arr2[i+1]/arr1[i+1])?(arr2[i]/arr1[i]):(arr2[i+1]/arr1[i+1]);
			if(temp < pwrGirls)
				pwrGirls = temp;
		}
		
        //Output
        System.out.println("\n" + pwrGirls);
   }
}