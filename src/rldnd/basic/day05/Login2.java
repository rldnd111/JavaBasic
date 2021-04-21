package rldnd.basic.day05;

import java.util.Scanner;

public class Login2 {
	public static void main(String[] ergs) {
		// 키보드로 아이디, 비밀번호 입력해서
		// 로그인 성공여부를 출력하는 프로그램
		// 아이디 : abc123
		// 비밀번호 : 987xyz
		// 1. 아이디x, 비밀번호x - 로그인 실패!
		// 2. 아이디o, 비밀번호x - 비밀번호가 틀려요!
		// 3. 아이디x, 비밀번호o - 아이디가 틀려요!
		// 4. 아이디o, 비밀번호o - 로그인 성공!
		// => 입력값에 따른 결과처리가 복잡하므로 단순화 시킴
		// 입력처리가 복잡해지면 코드도 복잡하게 짤 수 밖에 없음
		// 즉 1,2,3 => 로그인 실패, 4 => 로그인 성공

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

		// 문자열 비교시 == 이 아닌 equals 메서드 사용할것!!

		// if (userid.equals("abc123")) { // 아이디를 올바르게 입력한 경우
		// if (passwd.equals("987xyz"))

		// result = "로그인 성공!!";
		// else
		// result = "비밀번호가 틀려요";

		// } else {

		// if (passwd.equals("987xyz"))
		// result = "아이디는 틀리고, 비밀번호는 맞아요";
		// else
		// result = "아이디와 비밀번호가 틀려요";

		// System.out.println(result);
		// }

		// 로그인 성공여부를 4가지 경우데 따라 작성 - 코드 복잡

		// if(userid.equals("abc123")) {
		// if(passwd.equals("987xyz"))
		// result = "로그인 성공!";
		// else
		// result = "로그인 실패!";
		// }
		// else
		// result = "로그인 실패!";
		// System.out.println(result);

		if (userid.equals("abc123") && passwd.equals("987xyz"))
			result = "로그인 성공!";
		else
			result = "로그인 실패";

		// 조건식들을 논리식으로 재작성 - 코드가 단순해짐

		System.out.println(result);

	}
}
