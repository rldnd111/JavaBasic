package 박기웅.basic.day08;

public class BookInfo {
    public static void main(String[] args) {



        Book b = new Book();

        b.setBname("누구나 알기쉬운 자바 : 입문편");
        b.setWriter("카와바 타케시");
        b.setTranslator("하진일");
        b.setCompany("혜지원");
        b.setDay("2014년 06월");
        b.setPrice(25000);
        b.setSelling(22500);
        b.setSale(2250);



        System.out.println("도서명 : "+ b.getBname());
        System.out.println("저자 : " + b.getWriter());
        System.out.println("역자 : " + b.getTranslator());
        System.out.println("출판사 : " + b.getCompany());
        System.out.println("출간일 : " + b.getDay());
        System.out.println("정가 : " + b.getPrice() + "원");

        System.out.println("할인가 : " + b.getSale() +"원");

    }
}

class Book {

private String bname;
private String writer;
private String translator;
private String company;
private String day;
private int price;
private int selling;
private double sale;
private int save;

    public Book() { }

    public Book(String bname, String writer, String translator, String company, String day, int price, int selling, double sale, int save) {
        this.bname = bname;
        this.writer = writer;
        this.translator = translator;
        this.company = company;
        this.day = day;
        this.price = price;
        this.selling = selling;
        this.sale = sale;
        this.save = save;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSelling() {
        return selling;
    }

    public void setSelling(int selling) {
        this.selling = selling;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }
}




