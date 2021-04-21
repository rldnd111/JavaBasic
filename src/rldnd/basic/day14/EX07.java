package rldnd.basic.day14;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        // 두수를 입력받아 두 사이의 모든 값이
        // 총합을 구하는 코드를 작성하세요
        // ex) 10, 3 => 3,4,5,6,7,8,9,10 에 대한 총합
        // ex) 3, 10 => 3,4,5,6,7,8,9,10 에 대한 총합

        Scanner sc = new Scanner(System.in);
        int a,b;
       int sum = 0;
        System.out.println("첫번째 숫자");
        a = sc.nextInt();
        System.out.println("두번째 숫자");
        b = sc.nextInt();


                if(a>b) {

                    for(int i=b; i<=a; ++i)
                     sum +=i;

                }
                else if (a<b){
                    for(int i=b; i>=a; --i)
                        sum +=i;
                }
                else if(a==b){
                    sum +=a;
                }
                  System.out.println(sum);





    }
}
