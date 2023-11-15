import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            List<Long> answer = obj.PosNegPair(a, n);
            int sz = answer.size();
            
            if(sz==0)
            System.out.println(0);
            
            else{
                StringBuilder output = new StringBuilder();
                for(long x : answer)
                output.append(x+" ");
                System.out.println(output);
            }
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public List<Long> PosNegPair(long a[], long n)
    {
        Arrays.sort(a);
        List<Long> list = new ArrayList<>();
        
        int start = 0;
        int end = (int)n - 1;
        
        while (start < end)
        {
            if (a[start] < 0 && Math.abs(a[start]) == a[end])
            {
                list.add(a[start]);
                list.add(a[end]);
                start++;
                end--;
            }
            
            else if (Math.abs(a[start]) < a[end])
                end--;
                
            else
                start++;
        }
        
        int i1 = 0;
        int j1 = 1;
        int i2 = list.size() - 2;
        int j2 = list.size() - 1;
        
        while (j1 < list.size() / 2)
        {
            swap(list, i1, i2);
            swap(list, j1, j2);
            
            i1 += 2;
            j1 += 2;
            i2 -= 2;
            j2 -= 2;
        }
        return list;
    }
    public void swap(List<Long> list, int i, int j)
    {
        long temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }}
