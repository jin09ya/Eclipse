import java.util.Scanner;

/*
Q10. while문을 사용하여, Scanner 클래스 활용
보고 싶은 구구단의 단을 입력(예시 : 7)하면,
다음의 결과 화면과 같이 해당하는 구구단이 출력되는
자바 프로그램을 제작해 보시기 바랍니다.

[결과 화면]

보고 싶은 구구단의 단을 입력해 주시기 바랍니다 ==> 7
7 X 1 = 7
7 X 2 = 14
7 X 3 = 21
7 X 4 = 28
7 X 5 = 35
7 X 6 = 42
7 X 7 = 49
7 X 8 = 56
7 X 9 = 63
*/

public class Coding_Test10{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("보고 싶은 구구단의 단을 입력해 주세요 ==> ");
		int dan = scan.nextInt(); // i가 입력받는값. 즉, 구하고자하는 단의 값		
		int times = 1; // 곱해지는 수 1~9까지. 즉 , 9까지 1씩 증가해야하는 값
		int result = 1;
		
		while (times <= 9) {
			result = dan * times;
			System.out.println(dan + " X " + times + " = " + result);
			times++;
		}
		scan.close();
	}
}

