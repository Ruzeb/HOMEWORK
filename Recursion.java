public class Recursion {
	
	public static int fact(int n){
		if (n==0)
			return 1;	
		else
			return n*fact(n-1);		
	}
	
	public static int fib(int n){
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else 
			return fib(n-1) + fib(n-2);
	}
	
	public static int fibHelper(int a, int b, int n){
		//a=0;
		//b=1;
		if (n == 0)
			return a+b;
		else
			return fibHelper(b, a+b, n-1);
		
	}
	
	public static int fibLin(int n){
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else 
			return fibHelper(0,1,n-2);
	}
	
	public static void main (String[] args){
		System.out.println(fibLin(11));
	}
	
}
