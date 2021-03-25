package 박기웅.basic.day08;

public class Person {

        //멤버변수

        private String name;
        private String gneder;
        private int age;
        private int height;
        private int weight;


        // 생성자


    public Person(String name, String gneder, int age, int height, int weight) {
        this.name = name;
        this.gneder = gneder;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    // setter / getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGneder() {
        return gneder;
    }

    public void setGneder(String gneder) {
        this.gneder = gneder;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
