import java.util.Scanner;

//check palindrome and prime together
public class Palindromeprime {//check for palindrome
	public static boolean ispal(int n) {
		int temp=n;
		int rev=0;
		while(temp>0) {
			int d=temp%10;
			rev=rev*10+d;
			temp/=10;
		}
		return n==rev;
	}
	public static boolean isprime(int n) {//check for prime
		if(n<2) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int n1=s.nextInt();
		boolean pal=ispal(n1);
		boolean prime = isprime(n1);
		if(pal && prime) {
			System.out.println(n1+" both pal and prime ");
		}
		else {
			System.out.println(n1+" not pal and prime ");
		}

	}

}
