package rldnd.basic.day10;

public class StarCraft2 {
    public static void main(String[] args) {
        // 인터페이스 기반으로 스타크래프트의 유닛을 정의해 봄

        Scv2 s = new Scv2();
        System.out.print("SCV의 체력 " + s.hp);
        System.out.print(" 공격력 " + s.damage);
        System.out.print(" 이동속도 " + s.speed);
        System.out.print(" 소요미네랄 " + s.mineral);
        System.out.println(" 소요가스 " + s.gas);

        s.attack();
        s.move();
        s.specialAbility();


        Marin2 m = new Marin2();
        System.out.print("해병의 체력 " + m.hp);
        System.out.print(" 공격력 " + m.damage);
        System.out.print(" 이동속도 " + m.speed);
        System.out.print(" 소요미네랄 " + m.mineral);
        System.out.println(" 소요가스 " + m.gas);

        m.attack();
        m.move();
        m.specialAbility();

        Firebat2 f = new Firebat2();
        System.out.print("화염방사병 체력 " + f.hp);
        System.out.print(" 공격력 " + f.damage);
        System.out.print(" 이동속도 " + f.speed);
        System.out.print(" 소요미네랄 " + f.mineral);
        System.out.println(" 소요가스 " + s.gas);
        f.attack();
        f.move();
        f.specialAbility();

    }


}

abstract class Terran2 {


protected String name;
protected int hp;
protected int damage;
protected double speed;
protected int mineral;
protected int gas;

public Terran2() { }

}
// 추상클래스에서 정의했던 추상메서드를
// 독립적인 코드들로 분리함 -> 인터페이스

interface Option {

    void attack();
    void move(); // abstract public 생략 가능
    void specialAbility();

}


class Scv2 extends Terran2 implements Option {

    final String fmtattack ="융합절단기를 이용해서 대상에 %d 의 피해를 주고있습니다.\n";
    final String fmtmove =" 지정한 위치로 %.2f 속도로 이동중.\n";
    final String fmtspabty ="대상을 수리하는 중입니다.\n";

    public Scv2() {

        name = "건설로봇";
        hp=45;
        damage=5;
        speed=2.81;
        mineral=50;
        gas=0;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack,damage);

    }

    @Override
    public void move() {
        System.out.printf(fmtmove,speed);

    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);

    }
}

class Marin2 extends Terran2 implements Option {

    final String fmtattack ="가우스소총을 이용해서 대상에 %d 의 피해를 주고있습니다.\n";
    final String fmtmove =" 지정한 위치로 %.2f 속도로 이동중.\n";
    final String fmtspabty ="스팀팩을 사용하여 공격속도 33% 증가 이동속도 50% 가 증가 하였습니다.\n";

    public Marin2() {

        name = "마린";
        hp=40;
        damage=6;
        speed=1.875;
        mineral=50;
        gas=0;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack,damage);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove,speed);
    }

    @Override
    public void specialAbility() {
        System.out.print(fmtspabty);
    }
}

class Firebat2 extends Terran2 implements Option {
    final String fmtattack ="화염방사기를 이용해서 대상에 %d 의 피해를 주고있습니다.\n";
    final String fmtmove =" 지정한 위치로 %.2f 속도로 이동중.\n";
    final String fmtspabty ="스팀팩을 사용하여 공격속도 33% 증가 이동속도 50% 가 증가 하였습니다.\n";

    public Firebat2() {


        name = "화염방사병";
        hp=50;
        damage=8*2;
        speed=1.875;
        mineral=50;
        gas=25;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack,damage);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove,speed);
    }

    @Override
    public void specialAbility() {
        System.out.print(fmtspabty);
    }
}



