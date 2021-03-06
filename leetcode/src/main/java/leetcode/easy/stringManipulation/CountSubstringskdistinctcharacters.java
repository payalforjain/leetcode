package leetcode.easy.stringManipulation;

import java.util.Arrays;

public class CountSubstringskdistinctcharacters {

    /*
    Input: abc, k = 2
Output: 2
Possible substrings are {"ab", "bc"}

Input: aba, k = 2
Output: 3
Possible substrings are {"ab", "ba", "aba"}

Input: aa, k = 1
Output: 3
Possible substrings are {"a", "a", "aa"}
     */

    int countkDist(String str, int k)
    {
        // Initialize result
        int res = 0;

        int n = str.length();

        // To store count of characters from 'a' to 'z'
        int cnt[] = new int[26];

        // Consider all substrings beginning with
        // str[i]
        for (int i = 0; i < n; i++)
        {
            int dist_count = 0;

            // Initializing count array with 0
            Arrays.fill(cnt, 0);

            // Consider all substrings between str[i..j]
            for (int j=i; j<n; j++)
            {
                // If this is a new character for this
                // substring, increment dist_count.
                if (cnt[str.charAt(j) - 'a'] == 0)
                    dist_count++;

                // Increment count of current character
                cnt[str.charAt(j) - 'a']++;

                // If distinct character count becomes k,
                // then increment result.
                if (dist_count == k)
                    res++;
            }
        }

        return res;
    }
    int countkDistTry(String input, int k )
    {
        int result = 0;
        int[] map = new int[26];
        int distinct = 0;
        for(int i = 0 ; i < input.length() ; i++)
        {
            distinct = 0;
            map = new int[26];
            for(int j = i;  j < input.length() ; j++)
            {
                if(map[ input.charAt(j) - 'a'] == 0)
                    distinct++;

                map[ input.charAt(j) - 'a']++;

                if(distinct == k )
                    result ++;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        CountSubstringskdistinctcharacters c = new CountSubstringskdistinctcharacters();
        c.countkDistTry("pqpqs" , 2);
    }
}
