package stringChallenge;

import java.util.Set;
import java.util.*;
import java.io.*;

public class StringChallenge {
	public static String StringChallenge(String str) {
		int maxUnique=0;
		for(int i=0;i<str.length()-1;i++) {
			char currentChar=str.charAt(i);
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(j)==currentChar) {
					int uniqueChar=findUniqueChars(str.substring(i+1,j));
					maxUnique=Math.max(maxUnique,uniqueChar);
				}
			}
		}
		return String.valueOf(maxUnique);
	}
	public static int findUniqueChars(String s) {
		Set<Character> uniqueChar=new HashSet<>();
		for(char c:s.toCharArray()) {
			uniqueChar.add(c);
		}
		return uniqueChar.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(StringChallenge(sc.nextLine()));
		
		

	}

}
