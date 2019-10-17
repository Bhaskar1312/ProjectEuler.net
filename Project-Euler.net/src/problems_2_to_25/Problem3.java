package problems_2_to_25;
//The prime factors of 13195 are 5, 7, 13 and 29.
public class Problem3 {
	public static void main(String[] args) {
		long n =600851475143L;
//		long n1=8462696833L;
	for(long i=2;i<n;i++) {	
		if(n%i==0)
			{System.out.print(i+" is a divisor \t");
			System.out.println((n/i)+" is a divisor");
			n= (i>(n/i))? i:(n/i);
			//now check whether i and n/i are primes or not
			i--;
			}
		}
	}
	/*71 is a divisor 	8462696833 is a divisor
839 is a divisor 	10086647 is a divisor
1471 is a divisor 	6857 is a divisor*/
//		long n2=8462696833L;
//		System.out.println("Is "+n2+" a prime? \n"+isPrime(n2));

	/*71 is a divisor
839 is a divisor
1471 is a divisor
6857 is a divisor
59569 is a divisor
104441 is a divisor
486847 is a divisor
1234169 is a divisor
5753023 is a divisor
10086647 is a divisor
87625999 is a divisor
408464633 is a divisor
716151937 is a divisor
8462696833 is a divisor*/	
	
	public static boolean isPrime(long p) {
		if(p==1)
			return false;
		if(p==2 || p==3)
			return true;
		long i=2L;
		while(i<=Math.sqrt(p)) {
			if(p%i==0)
				return false;
			i++;
		}
		return true;
	}
}
