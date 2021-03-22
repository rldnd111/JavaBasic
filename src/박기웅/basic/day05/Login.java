package 박기웅.basic.day05;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// 키보드로 아이디, 비밀번호 입력해서
		// 로그인 성공여부를 출력하는 프로그램
		// 아이디 : abc123
		// 비밀번호 : 987xyz
		// 1. 아이디x, 비밀번호x - 로그인 실패!
		// 2. 아이디o, 비밀번호x - 비밀번호가 틀려요!
		// 3. 아이디x, 비밀번호o - 아이디가 틀려요!
		// 4. 아이디o, 비밀번호o - 로그인 성공!

		// 변수선언
		String userid;
		String passwd;
		Scanner sc = new Scanner(System.in);
		String result;

		// 아이디/비밀번호 입력 받아 비교
		System.out.println("아이디는? ");
		userid = sc.next();

		System.out.println("비밀번호는? ");
		passwd = sc.next();

		// 결과 출력

		if (userid.equals("abc123") & passwd.equals("789xyz")) {

			System.out.println("로그인 성공");
		}

		else if (userid.equals("abc123") & !passwd.equals("789xyz")) {

			System.out.println("비밀번호가 틀립니다");

		} else if (!userid.equals("abc123") & passwd.equals("789xyz")) {

			System.out.println("아이디가 틀립니다");
		}

		else {

			System.out.println("로그인 실패");

		}
	}
}
