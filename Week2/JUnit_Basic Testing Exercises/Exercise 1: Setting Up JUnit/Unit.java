package tests;

public class Unit {
	public int square(int n) {
		return n*n;
	}
	
	public boolean palindrome(int num) {
		int temp=num;
		int check_palindrome=0;
		while(temp>0) {
			int remainder=temp%10;
			check_palindrome=(check_palindrome*10)+remainder;
			temp/=10;
			
		}
		return num==check_palindrome;
	}

}
