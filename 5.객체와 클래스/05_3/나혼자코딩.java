package classpart;

public class FuchtionTest {

	public static void main(String[] args) {
		//맴버변수,클래스 변수 선언
		int num1 = 10 ;
		int num2 = 20;

		int sum = add(num1, num2);
		System.out.println("num1 + num2 = "+ sum +"입니다" );
		
		double mul_result = mul(num1,num2);
		System.out.println("num1 x num2 = " + mul_result );
	}
	
	private static int add( int n1, int n2) { //덧셈 함수 선언
		int result = n1 + n2;
		return result;
	}
	private static double mul(double n1, double n2) {
		double result = (double)n1*(double)n2;
		return result;
	}
}