package Search;

import java.util.Scanner;

public class Palindrome_Index {
	static int palindromeIndex(String c) {
		char []s = c.toCharArray();
		int l = 0;
	    int r = s.length - 1;

	    while (l < r) {
	        if (s[l] == s[r]) {
	            l++;
	            r--;
	        }
	        else {
	            break;
	        }
	    }

	    if (l >= r) {
	        return -1;
	    }else{
	    	int left = l;
		    int right = r;

		    l++;
		    int ok = 1;
		    while (l < r) {
		        if (s[l] == s[r]) {
		            l++;
		            r--;
		        }
		        else {
		            ok = 0;
		            break;
		        }
		    }
		    return ok==1?left:right;
	    }

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = palindromeIndex(s);
			System.out.println(result);
		}
		in.close();
	}
}
