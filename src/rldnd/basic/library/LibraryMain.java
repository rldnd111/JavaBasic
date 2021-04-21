package rldnd.basic.library;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryService lsrv = new LibraryServiceImpl();

        String menu = " ";
        LibraryVO l = null;

        while (true){
            lsrv.displayMenu();
            menu= sc.next();

            switch (menu) {
                case "1":
                    lsrv.newLibrary();
                    break;
                case "2": lsrv.showLibrary(); break;
                case "3": lsrv.showOneLibrary(); break;
                case "4": lsrv.modifyLibrary(); break;
                case "5": lsrv.removeLibrary(); break;
                case "0": System.exit(0);
                default:
                    System.out.println("잘못입력하셧습니다");


            }

        }

    }
}
