// 264. Ugly Number II
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

// Given an integer n, return the nth ugly number.

 

// Example 1:

// Input: n = 10
// Output: 12
// Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
// Example 2:

// Input: n = 1
// Output: 1
// Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 

// Constraints:

// 1 <= n <= 1690

public class UglyNumber2 {
        public int nthUglyNumber(int n) { 
        int[] ugly=new int[n];
        ugly[0]=1;

        int i2=0;
        int i3=0;
         int i5=0;
        
        for(int i=1;i<n;i++){
            int a=ugly[i2]*2;
            int b=ugly[i3]*3;
            int c=ugly[i5]*5;


            int next=Math.min(a,Math.min(b,c));
            ugly[i]=next;

            if(next==a) i2++;
            if(next==b) i3++;
            if(next==c) i5++;
        }

        return ugly[n-1];
}
}
