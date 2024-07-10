/*
3. Max and Second Max 
Easy Accuracy: 49.94% Submissions: 26400 Points: 2
Given an array arr[] of size N of positive integers which may have duplicates. The task is to find the maximum and second maximum from the array,
and both of them should be distinct, so If no second max exists, then the second max will be -1.

Example 1:

Input:
N = 3
arr[] = {2,1,2}
Output: 2 1
Explanation: From the given array 
elements, 2 is the largest and 1 
is the second largest.
Example 2:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 5 4
Explanation: From the given array 
elements, 5 is the largest and 4 
is the second largest.
Your Task:
The task is to complete the function largestAndSecondLargest(), which should return maximum and second maximum element from the array
with first element as maximum element and second element as second maximum(if there is no second maximum the  second element should be -1)
*/
public static void firstSecondLargest(int [] arr){  
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int a:arr){
            if (a>first){
                second=first;
                first=a;
            }else if (a>second && a!= first){
                second=a;
            }
        }
        System.out.println(second +" "+first);
    }
