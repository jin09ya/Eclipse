import java.util.Scanner;

// Q1.
// 덧셈 연산을 수행하는 함수를 생성하고,
// 두 정수를 입력 받아서, 합의 결과값을 구현하는
// 자바 프로그램을 제작하시기 바랍니다.

public class Coding_Test01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in); // 실제 키보드에서 입력받는 값
		System.out.print("첫번째 연산 정수를 입력해 주세요 ==>  ");
		int num1 = scan.nextInt(); // 키보드에 입력한 값에서 정수값을 뽑아냄
		System.out.print("두번째 연산 정수를 입력해 주세요 ==>  ");
		int num2 = scan.nextInt();
		
//		System.out.println("합의 결과값 = " + num1 + num2);
//		int result = num1 + num2;
//		System.out.println("두 정수의 합 = " + result);

		int result = sum(num1,num2); // 아래에 만든 sum함수 호출
		System.out.println("두 정수의 합 = " + result);		
	} // 디버그 F5??? 놓쳤다!!
	
	private static int sum(int num1, int num2) { //덧셈 연산을 수행하는 함수. 왜 생성하는것일까? 문제에 사용하라고해서?
		int sum = 0; // sum 변수 초기화 0
		sum = num1 + num2;
		return sum; // return문이 sum(num1,num2) 로 값을 보내줌
	}
}
