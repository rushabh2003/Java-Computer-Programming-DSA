import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution {
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        int i;
        Arrays.sort(A1);
        for (i = 0; i <= A1.length - 1; i++) {
            ls.add(A1[i]);
        }
        HashSet<Integer> ls1 = new HashSet<Integer>();
        for (i = 0; i <= A2.length - 1; i++) {
            ls1.add(A2[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int j;
        for (i = 0; i <= A2.length - 1; i++) {
            for (j = 0; j <= A1.length - 1; j++) {
                if (A1[j] == A2[i]) {
                    ans.add(A1[j]);
                }
            }
        }
        for (i = 0; i <= A1.length - 1; i++) {
            if (!ls1.contains(A1[i])) {
                ans.add(A1[i]);
            }
        }
        int ans1[] = new int[ans.size()];
        for (i = 0; i <= ans.size() - 1; i++) {
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
}