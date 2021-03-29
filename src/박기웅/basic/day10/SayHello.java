package 박기웅.basic.day10;

public class SayHello {
    // 다국어(한글,영어,일본어)로 인사하는 프로그램 작성
    public static void main(String [] ergs){

//        SayHelloKor say = new SayHelloKor();
//        say.sayHello();

//        SayHelloEng say2 = new SayHelloEng();
//        say2.sayHello();

//        SayHelloJpn say3 = new SayHelloJpn();
//        say3.sayHello();

        SayHelloService say4 = new SayHelloKor();
        say4.SayHello();

        say4 = new SayHelloEng();
        say4.SayHello();

        say4 = new SayHelloJpn();
        say4.SayHello();


    }



}
interface SayHelloService {

    void SayHello();
}







class SayHelloKor implements SayHelloService {

    @Override
    public void SayHello() {
        System.out.println("안녕하세요, 자바8");
    }
}

class SayHelloEng implements SayHelloService {


    @Override
    public void SayHello() {
        System.out.println("Hello, Java8");
    }
}

class SayHelloJpn implements SayHelloService {

    @Override
    public void SayHello() {
        System.out.println("こんにちは、ジャワ8!");
    }
}