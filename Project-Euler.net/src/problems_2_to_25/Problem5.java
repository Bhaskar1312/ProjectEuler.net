package problems_2_to_25;

public class Problem5 {
	public static void main(String[] args) {
		int least=1;
	for(int i=1;i<20;i++) {
	least=lcm(i,least);
	}
	System.out.println(least);
	}
	/**2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
	public static int lcm(int x, int y) {
		int max = (x>y)? x:y;
		//for x y>0
		while(true) {
			if(max%x==0 && max%y==0)
				return max;
			else max++;
		}
	}
}
