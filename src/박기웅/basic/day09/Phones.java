package 박기웅.basic.day09;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Phones {
    public static void main(String[] args) {

        Feature f = new Feature();
        f.sendcall();
        f.receiveCall();

        MP3Phone m = new MP3Phone();
        m.playMusic();

        SmartPhone s = new SmartPhone();
        s.playGame();

    }
}


interface PhoneInterface {
    void sendcall ();
    void receiveCall ();
}

interface MP3Interface {
    void playMusic();
    void viewMovie();
}

interface SmartPhoneInterface {
    void takePic();
    void surfInternet();
    void playGame();
}

class Feature implements PhoneInterface{


    @Override
    public void sendcall() {
        System.out.println("전화 거는 중...");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 받는 중...");
    }
}

class MP3Phone implements PhoneInterface, MP3Interface{
    @Override
    public void sendcall() { }

    @Override
    public void receiveCall() { }

    @Override
    public void playMusic() {
        System.out.println("음악을 재생합니다");
    }

    @Override
    public void viewMovie() {
        System.out.println("동영상을 재생합니다");
    }
}

// 상속extends : 부모클래스가 가진 특성과 기능을 변화없이 받음
// 구현implements : 부모클래스가 정해준 틀에 맞춰 새롭게 작성
// 따라서, 아래처럼 짜는 것은 다소 세련되지 못함
class MP3Phone2 extends Feature implements MP3Interface {

    @Override
    public void playMusic() { }

    @Override
    public void viewMovie() { }
}

class SmartPhone implements PhoneInterface, SmartPhoneInterface{

    @Override
    public void sendcall() { }

    @Override
    public void receiveCall() { }

    @Override
    public void takePic() {
        System.out.println("사진을 찍습니다.");
    }

    @Override
    public void surfInternet() {
        System.out.println("인터넷을 합니다");
    }

    @Override
    public void playGame() {
        System.out.println("게임을 합니다");
    }
}