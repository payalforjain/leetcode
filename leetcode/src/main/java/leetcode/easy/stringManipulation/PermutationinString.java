package leetcode.easy.stringManipulation;

import java.util.ArrayList;
import java.util.List;

public class PermutationinString {
/*
Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
Example 1:
Input:s1 = "ab" s2 = "eidbaooo"
Output:True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:
Input:s1= "ab" s2 = "eidboaoo"
Output: False
Note:
The input strings only contain lower case letters.
The length of both given strings is in range [1, 10,000].
 */
	/*
	Instead of making use of a special HashMap datastructure
	just to store the frequency of occurence of characters, we can use a simpler array data structure to store the frequencies.
	 Given strings contains only lowercase alphabets ('a' to 'z').
	  So we need to take an array of size 26.The rest of the process remains the same as the last approach.
	 */
	//Other Solution works but time will be exceeded
	public boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length())
			return false;
		int[] s1map = new int[26];
		for (int i = 0; i < s1.length(); i++)
			s1map[s1.charAt(i) - 'a']++;
		for (int i = 0; i <= s2.length() - s1.length(); i++) {
			int[] s2map = new int[26];
			for (int j = 0; j < s1.length(); j++) {
				s2map[s2.charAt(i + j) - 'a']++;
			}
			if (matches(s1map, s2map))
				return true;
		}
		return false;
	}
	public boolean matches(int[] s1map, int[] s2map) {
		for (int i = 0; i < 26; i++) {
			if (s1map[i] != s2map[i])
				return false;
		}
		return true;
	}

}
