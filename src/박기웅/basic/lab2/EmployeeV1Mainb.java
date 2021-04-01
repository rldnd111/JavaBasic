package 박기웅.basic.lab2;



import java.util.Scanner;

public class EmployeeV1Mainb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeServiceb empsrv = EmployeeServiceImplb.getInstance();

        String menu = " ";
       EmployeeVOb e = null;

        while (true){
            empsrv.displayMenu2();
            menu = sc.next();

           switch (menu){
                case "1": empsrv.newEmployee2(); break;
               case "2": empsrv.showEmployee2(); break;
                case "3": empsrv.showOneEmployee2(); break;
                case "4": empsrv.modifyEmployee2(); break;
                case "5": empsrv.removeEmployee2(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못입력하셨습니다");

            } //switch

        }//while
//        empsrv.makeExtInfo(null);
    }//main
}

