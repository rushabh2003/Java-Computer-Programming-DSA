import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();

            System.out.println(printNumber(s, s.length()));
        }

    }

    // } Driver Code Ends
    // User function Template for Java

    // Function to find matching decimal representation of a string as on the
    // keypad.
    public static String printNumber(String s, int n) {
        int[] arr = new int[] { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9 };
        String ans = "";
        for (int i = 0; i < n; i++) {
            int t = arr[s.charAt(i) - 'a'];
            ans += t;
        }
        return ans;
        // Your code here
    }
}