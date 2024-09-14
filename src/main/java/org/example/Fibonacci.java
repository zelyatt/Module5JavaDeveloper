package org.example;

import java.util.HashMap;

/* Iterative method
Time complexity:
O(n)
Spatial complexity:
O(1)
*/
public class Fibonacci {

    public static int fib(int n) {
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = curr + prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(fib(6) + " Iter");
    }
}

/* Recursive method
Time complexity:
O(2^n)
Spatial complexity:
O(n)
*/

class FibonacciRecursive {
    public static int fib(int n) {
        if (n== 0){
            return 0;
        } else if(n == 1){
            return 1;

        } return fib(n - 1) + fib(n - 2);

    }


    public static void main(String[] args) {

        System.out.println(fib(6) + " Rec");

    }
}
/* DP method
Time complexity:
O(n)
Spatial complexity:
O(n)
*/

class FibonacciDP{
    private static HashMap<Integer,Integer> map = new HashMap<>();

    public static int fib(int n){
        if (n== 0){
            return 0;
        } else if(n == 1){
            return 1;
        }

        if (map.containsKey(n)){
            return map.get(n);
        }
        int result = fib(n-1) + fib(n-2);
        map.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(6) + " DP");
    }
}
