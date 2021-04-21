package rldnd.basic.day11;

import java.util.Scanner;


public class EX06 {
    public static void main(String[] args) {
//           Q14
//        하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
//        한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
//        일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.

        int day=86400;
        int h=3600;
        int m=60;

        System.out.println(1234567890/day + "일");
        System.out.println(98765/h + "시간");
        System.out.println(12345/m + "분");

//        25. 다음 조건을 만족하는 복권 발행 프로그램을 작성하세요. (Lotto)
//
//        가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)
//
//        나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
//
//        다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급
//
//        라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력


        int[] yourkey = new int[3];
        int[] lottokey = new int[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("1~10 까지의 복권 숫자 3개를 입력해 주세요");
        yourkey[0] = sc.nextInt();
        yourkey[1] = sc.nextInt();
        yourkey[2] = sc.nextInt();



        lottokey[0] = (int) (Math.random() * 10) + 1;
        System.out.print(lottokey[0] + " ");
        lottokey[1] = (int) (Math.random() * 10) + 1;
        System.out.print(lottokey[1] + " ");
        lottokey[2] = (int) (Math.random() * 10) + 1;
        System.out.print(lottokey[2] + " ");

        if(yourkey[0]==lottokey[0]||yourkey[0]==lottokey[1]||yourkey[0]==lottokey[2]){
            if(yourkey[1]==lottokey[0]||yourkey[1]==lottokey[1]||yourkey[1]==lottokey[2]) {
                if (yourkey[2] == lottokey[0] || yourkey[2] == lottokey[1] || yourkey[2] == lottokey[2]) {
                    System.out.println("당");
                }
            }
                }

        else System.out.println("다음");





    }
}
