import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            String data = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.isIsogram(data) ? "1" : "0");

        }
    }
}
// } Driver Code Ends

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        int[] count = new int[26];

        // store the frequencies of characters
        for (int i = 0; i < data.length(); i++) {
            // internal typecasting happening from CHAR to INT
            count[data.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 1) {
                return false;
            }
        }
        return true;
        // Your code here
    }
}