package rldnd.basic.day08;

public class Inheritance2 {
    public static void main(String[] args) {

    }
}

class People{

    public void talk(){}
    public void eat(){}
    public void run(){}
    public void sleep(){}

}

class Student extends People{

    public void study(){}
}

class StudentWorker extends  People{

    public void study(){}
    public void work(){}
}

class  Researcher extends People{

    public void research(){}

}

class Professor extends  People{

    public void research(){}
    public void teaching(){}

}