package rldnd.basic.day09;

public class StarCraft {
    public static void main(String[] args) {

        // Scv s = new Scv("Scv",45,5,2.81,50,0);
        // Scv 유닛을 만들때 마다 초기값을 지정하는 것은 다소 번거로움
        // 즉, 동일한 속성을 가진 유닛을 만들때 마다
        // 매개변수를 통해 객체를 만드는 것은 비효율적임
        // 이런경우, 생성자 내에서 초기값을 지정하는 것이 나음

        Scv s = new Scv();
        System.out.print("SCV의 체력 " + s.hp);
        System.out.print(" 공격력 " + s.damage);
        System.out.print(" 이동속도 " + s.speed);
        System.out.print(" 소요미네랄 " + s.mineral);
        System.out.println(" 소요가스 " + s.gas);

        s.attack();
        s.move();
        s.specialAbility();


        Marin m = new Marin();
        System.out.print("해병의 체력 " + m.hp);
        System.out.print(" 공격력 " + m.damage);
        System.out.print(" 이동속도 " + m.speed);
        System.out.print(" 소요미네랄 " + m.mineral);
        System.out.println(" 소요가스 " + m.gas);

        m.attack();
        m.move();
        m.specialAbility();

        Firebat f = new Firebat();
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

    abstract class Terran {


    protected String name;
    protected int hp;
    protected int damage;
    protected double speed;
    protected int mineral;
    protected int gas;

    public Terran() { }

//    public Terran(String name, int hp, int damage, double speed, int mineral, int gas) {
//        this.name = name;
//        this.hp = hp;
//        this.damage = damage;
//        this.speed = speed;
//        this.mineral = mineral;
//        this.gas = gas;
//}


    abstract public void attack();
    abstract public void move();
    abstract public void specialAbility();
}


class Scv extends Terran {

    final String fmtattack ="융합절단기를 이용해서 대상에 %d 의 피해를 주고있습니다.\n";
    final String fmtmove =" 지정한 위치로 %.2f 속도로 이동중.\n";
    final String fmtspabty ="대상을 수리하는 중입니다.\n\n";

    public Scv() {

        name = "건설로봇";
        hp=45;
        damage=5;
        speed=2.81;
        mineral=50;
        gas=0;
    }

    @Override
    public void attack() {
//        sout ("융합절단기를 이용해서 ...")
//        System.out.println("융합절단기를 이용해서 대상에 " + damage + " 의 피해를 주고있습니다.");
        // 추상메서드를 이용해서 부모클래스에 정의된
        // attack메서드를 유닛에 맞게 재정의함

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

class Marin extends Terran {

    final String fmtattack ="가우스소총을 이용해서 대상에 %d 의 피해를 주고있습니다.\n";
    final String fmtmove =" 지정한 위치로 %.2f 속도로 이동중.\n";
    final String fmtspabty ="스팀팩을 사용하여 공격속도 33% 증가 이동속도 50% 가 증가 하였습니다.\n\n";

    public Marin() {

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

class Firebat extends Terran{
    final String fmtattack ="화염방사기를 이용해서 대상에 %d 의 피해를 주고있습니다.\n";
    final String fmtmove =" 지정한 위치로 %.2f 속도로 이동중.\n";
    final String fmtspabty ="스팀팩을 사용하여 공격속도 33% 증가 이동속도 50% 가 증가 하였습니다.\n\n";

    public Firebat() {


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



