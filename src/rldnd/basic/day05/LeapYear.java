package rldnd.basic.day05;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		// 윤년 여부를 출력
		// 지구의 공전주기와 자전주기의 불일치로 발생하는
		// 공전주기 :365.24일
		// 자전주기 : 0.24일
		// 이 두간의 오차 때문에 4년마다 하루를 추가하는 방법으로
		// 오류를 보정함
		// 조건 : 4로 나누어 떨어지지만, 100으로 나눠 떨어지지 않음
		// 조건2 : 단, 400 으로 나눠 떨어짐
		// 1600(윤년), 2020(윤년) 1900(평년), 2021(?)

		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("년도를 입력해 주세요 ");
		year = sc.nextInt();
		String result;

		if ((year % 4 == 0 & year % 100 != 0) || year % 400 == 0)

			result = "윤년입니다.";

		else
			result = "평년입니다.";

		System.out.println(result);

	}
}
