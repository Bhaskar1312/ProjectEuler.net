package problems_2_to_25;

public class Problem4 {
	
	public static void main(String[] args) {
		int largep=10000;
		for(int i=100;i<=999;i++) {
			for(int j=100;j<=i;j++) {
				if(IsPalindome(i*j))
					{System.out.println((i*j)+" is a Palindome\t"+i+"\t"+j);
					largep = (largep > (i*j))? largep:(i*j);
					}
			}
		}
		System.out.println(largep+" is a palindrome: "+IsPalindome(largep));
	}
	
	/** A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
	public static boolean IsPalindome(int n) {
		String str =n+"";
		int len=str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)!=str.charAt(len-1-i))
				return false;
		}
		return true;
	}
}
