/*키보드로 아이디와 패스워드를 입력받습니다.
입력조건으로 이름은 문자열이고 패스워드는 정수입니다.
입력된 내용을 비교해서 아이디가 "java"이고 패스워드가 12345라면 "로그인 성공"을 출력하고
그렇지 않으면 "로그인 실패"를 출력해보세요
*/
package Team;

import java.util.Scanner;

public class Team_Test_sujin {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 ==> ");
		String id = scan.next();
		System.out.print("패스워드를 입력해주세요 ==> ");
		int password = scan.nextInt();
		
		if (id.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		} else {
			System.out.println("로그인 실패");
		}
	}

}
