package 박기웅.basic.day07;

import jdk.internal.dynalink.beans.StaticClass;

public class EX05 {
    public static void main(String[] args) {



Account AC = new Account(1120, 20000, 4.5, "2014-08-15 14:34:29");

        Account.AccountService ac = new Account.AccountService();




    }

    // 선풍기를 나타내는 Fan 클래스
//    회전속도 1,2,3 을 나타내는 상수 SLOW, MEDIUM, FAST
//    선풍기의 속도를 나타내는 speed 변수, 초기값은 SLOW
//    동작상태를 표시하는 on 변수, 초기값은 false
//    선풍기 팬 크기를 나타내는 radius 변수, 초기값은 5.0
//    선풍기 색상을 표시하는 color 변수, 초기값은 blue
//
//    시험값 : 10, yellow, 최고속도, 동작중 / 5, blue, 중간속도, 정지



    static class Fan {

        private int slow=1;
        private int medium=2;
        private int fast=3;
        private int speed=slow;
        private boolean on=false;
        private double radius=5.0;
        private String  color="blue";



                public Fan(){ }

                public Fan(double radius, String color, int speed, boolean on, int slow, int medium, int fast){
                    this.slow=slow;
                    this.medium=medium;
                    this.fast=fast;
                    this.speed=speed;
                    this.on=on;
                    this.radius=radius;
                    this.color=color;
                }

    }
//    은행 계좌를 나타내는 Account 클래스를 작성하라
//
//    계좌번호를 위한 aid 변수, 초기값은 0
//    통장잔액을 나타내는 balance 변수, 초기값은 0
//    연간 이자율을 나타내는 interestRate 변수, 초기값은 0
//    통장개설 날짜를 위한 dateCreated 변수
//
//    시험값 : 1122, 20000, 4.5, 2014-08-15 14:34:29

static class Account {

    private  int aid=0;
    private  int balance=0;
    private  double interestRate=0;
    private  String dateCreated;

    public Account(){}

    public Account(int aid, int balance, double interestRate, String dateCreated){

        this.aid=aid;
        this.balance=balance;
        this.interestRate=interestRate;
        this.dateCreated=dateCreated;

    }

    static class AccountService {}


    public void prinrntAccount(Account ac){
        String fmt = "%d, %d, %f, %s";
        System.out.printf(fmt, aid,balance,interestRate,dateCreated);
    }
}

}

