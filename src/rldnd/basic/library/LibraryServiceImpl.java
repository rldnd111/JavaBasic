package rldnd.basic.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {

  List<LibraryVO> ldata = new ArrayList<>();
  LibraryVO lmp = null;


  private static LibraryService lsrv = null;

  public LibraryServiceImpl() {
  }


  public static LibraryService getInstance() {
    if (lsrv == null) lsrv = new LibraryServiceImpl();
    return lsrv;
  }


  @Override
  public void displayMenu() {

    String displaymenu =
            "------------------------\n"
                    + "    도서관 프로그램   \n"
                    + "------------------------\n"
                    + "1. 도서관데이터 입력 	 \n"
                    + "2. 도서관데이터 조회 	 \n"
                    + "3. 도서관데이터 상세조회  \n"
                    + "4. 도서관데이터 수정 	 \n"
                    + "5. 도서관데이터 삭제 	 \n"
                    + "0. 프로그램 종료 	 	 \n"
                    + "------------------------\n"
                    + " 작업을 선택 하세요 : ";
    System.out.println(displaymenu);
  }


  @Override
  public void newLibrary() {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("도서관명은? : ");
      String lbname = sc.next();
      System.out.println("시도명은? : ");
      String sido = sc.next();
      System.out.println("시군구명은? : ");
      String gugun = sc.next();
      System.out.println("도서관유형은? : ");
      String lbtype = sc.next();
      System.out.println("휴관일은? :");
      String clsday = sc.next();
      System.out.println("주소는? :");
      String addr = sc.next();
      System.out.println("전화번호는? : ");
      String phone = sc.next();
      System.out.println("홈페이지주소는? :");
      String homepage = sc.next();
      System.out.println("위도는? :");
      String lat = sc.next();
      System.out.println("경도는? :");
      String lon = sc.next();

      LibraryVO lmp = new LibraryVO(lbname, sido, gugun, lbtype, clsday, addr, phone, homepage, lat, lon);

      ldata.add(lmp);
    } catch (Exception ex){
      System.out.println("잘못입력하셨습니다.");
      return;
    }
  }


  @Override
  public void showLibrary() {
    int pos = 0;
    String fmt = "번호: %d, 도서관명: %s, 시도: %s, 시군구:%s, 도서관유형:%s, 휴관일:%s\n";
    for (LibraryVO lmp : ldata) {

      System.out.printf(fmt,pos, lmp.getLbname(), lmp.getSido(), lmp.getGugun(), lmp.getLbtype(), lmp.getClsday());
      ++pos;
      System.out.println(" ");


    }

  }

  @Override
  public void showOneLibrary() {
    String fmt = "번호: %d, 도서관명: %s, 시도: %s, 시군구:%s, 도서관유형:%s, 휴관일:%s\n" +
            "주소: %s, 전화번호: %s, 홈페이지주소: %s, 위도: %s, 경도: %s";
    Scanner sc = new Scanner(System.in);
    try {


      System.out.print("조회할 도서관 번호는? ");

      int pos = sc.nextInt();
      LibraryVO lmp = ldata.get(pos);
      System.out.printf(fmt, pos, lmp.getLbname(), lmp.getSido(), lmp.getGugun(), lmp.getLbtype(), lmp.getClsday(),
              lmp.getAddr(), lmp.getPhone(), lmp.getHomepage(), lmp.getLat(), lmp.getLon());
      System.out.println(" ");
    } catch (Exception ex){
      System.out.println("조회할 데이터가 없습니다.");
    }
  }

  @Override
  public void modifyLibrary() {

  }

  @Override
  public void removeLibrary() {

  }
}
