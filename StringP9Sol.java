import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();

            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);

        }
    }
}
// } Driver Code Ends

// User function Template for Java
class Solution {
    char firstRep(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < S.length(); i++) {

            if (map.get(S.charAt(i)) > 1) {
                return S.charAt(i);
            }
        }
        return '#';
        // your code here
    }
}