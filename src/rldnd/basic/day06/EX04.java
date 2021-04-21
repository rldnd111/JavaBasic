package rldnd.basic.day06;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

        //생년월일을 이용해서 나이를 계산하는 프로그램을 작성하여라.

        // checkBirth();



        //고객에게 돌려줘야 하는 잔돈을 계산

       // computeChange();





        //

        int num1,num2,num3;
        int change;
        int[] coin = {50000, 10000, 5000, 1000, 500, 100, 10};
        int leftcoin = 9;

        Scanner sc = new Scanner(System.in);

        System.out.println("계산할 물건의 값을 입력해 주세요");
        num1 = sc.nextInt();
        System.out.println("손님에게 받은 금액을 입력해 주세요");
        num2 = sc.nextInt();

        num3 = (num2 - num1);

        System.out.println("거스름돈 : " + num3);


        for(int i=0; i < coin.length; ++i){

            change = (num3 / coin[i]);

            System.out.println(coin[i]+"원" + change +"개");
        }




    }

    public static void checkBirth() {
        int a;
        int b;
        int mm;
        int dd;
        int c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("태어난 년도 4자리를 입력해 주세요");
        a = sc.nextInt();
        System.out.println("태어난 월과 일을 입력해 주세요");
        mm = sc.nextInt();
        dd = sc.nextInt();
        System.out.println("현재 년도를 입력해 주세요");
        b = sc.nextInt();

        c = (b - a) + 1;

        String fmt = "태어난 년도는 %d 이고, 생일은 %d월 %d일 이며 현재 나이는 %d 입니다 \n";
        System.out.printf(fmt, a, mm, dd, c );

    }
    public static void computeChange() {
        int a, b, c,d,e,f,g;

        Scanner sc = new Scanner(System.in);

        System.out.println("계산할 물건의 금액을 입력해주세요");
        a = sc.nextInt();
        System.out.println("손님에게 받은 금액을 입력해주세요");
        b = sc.nextInt();
        c = (b - a);

        String fmt = "계산할 물건의 값은 %d 원 이며 손님에게 받은 금액은 %d 원 이고" +
                "거스름돈은 %d 원 입니다. \n";

        System.out.printf(fmt, a, b, c);
    }
}

