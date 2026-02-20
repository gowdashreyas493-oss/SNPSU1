package fibonacci;

public class fiboacci1 {
	public void fibonacci(int n) {
		int a=0;
		int b=1;
		int sum=0;
		System.out.println("Fibonacci Series:");
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
		
	}
	public static void main(String[]args) {
		fiboacci1 f = new fiboacci1();
		f.fibonacci(5);
	}

}
