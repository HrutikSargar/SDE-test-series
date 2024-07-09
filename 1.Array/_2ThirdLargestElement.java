/*
2. Third largest element 
Basic Accuracy: 46.52% Submissions: 30174 Points: 1
Given an array of distinct elements. Find the third largest element in it. 

Example 1:

Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3
Example 2:

Input:
N = 2
A[] = {10,2}
Output: -1
Your Task:
Complete the function thirdLargest() which takes the array a[] and the size of the array, n, as input parameters and returns the third largest element in the array. It return -1 if there are less than 3 elements in the given array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 105
*/

public static int thirdLargest(int [] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for (int a:arr){
            if (a> first){
                third=second;
                second=first;
                first=a;
            }else if (a>second && a!= first){
                third=second;
                second=a;
            }else if (a>third && a!=first && a!=second){
                third=a;
            }
        }
        return (arr.length>=3 )? third :  -1;
    }
