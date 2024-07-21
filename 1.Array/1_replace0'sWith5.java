/*1. Replace all 0's with 5 
Basic Accuracy: 51.24% Submissions: 32214 Points: 1
You are given an integer N. You need to convert all zeroes of N to 5.

Example 1:

Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004.
on replacing all zeroes with "5", the new
number will be "1554".
Example 2:

Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
Your Task:
Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. Your function should return the converted number.

Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 10000
*/


public static void replace0with5(){
        int num=1004;
        int answer=0;
        System.out.println("reverseTheNumber");
        while (num>0){
            int temp=num%10;
            if (temp==0){
                temp=5;
            }
            answer=temp+(answer*10);
            num/=10;
        }
        //called below function to reverse the number
        answer=reverseTheNumber(answer);
        System.out.println(answer);

    }
    public static int reverseTheNumber(int num){
        int answer=0;
        while (num>0){
            int temp=num%10;
            answer=(answer*10)+temp;
            num=num/10;
        }
        return answer;
    }
