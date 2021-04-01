package 박기웅.basic.lab;

import java.util.Scanner;

public class EmployeeV1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeService esrv = EmployeeServiceImpl.getInstance();

        String menu = " ";
        EmployeeVO e = null;

        while (true){
            esrv.displayMenu();
            menu = sc.next();

            switch (menu){
                case "1": esrv.newEmployee(); break;
                case "2": esrv.showEmployee(); break;
                case "3": esrv.showOneEmployee(); break;
                case "4": esrv.modifyEmployee(); break;
                case "5": esrv.removeEmployee(); break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못입력하셨습니다");

            }

        }

    }
}
