package 박기웅.basic.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{


    List<EmployeeVO> edata = new ArrayList<>();
    EmployeeVO e = null;


    private static EmployeeService esrv = null ;

    public EmployeeServiceImpl() {


    }

    public static  EmployeeService getInstance() {
        if(esrv==null) esrv = new EmployeeServiceImpl();
        return esrv;
    }


    @Override
    public void displayMenu() {

        String displaymenu =
                "------------------------\n"
                        + "    사원정보 프로그램 v1  \n"
                        + "------------------------\n"
                        + "1. 사원정보 입력 	 \n"
                        + "2. 사원정보 조회 	 \n"
                        + "3. 사원정보 상세조회  \n"
                        + "4. 사원정보 수정 	 \n"
                        + "5. 사원정보 삭제 	 \n"
                        + "0. 프로그램 종료 	 	 \n"
                        + "------------------------\n"
                        + " 작업을 선택 하세요 : ";
        System.out.println(displaymenu);

    }

    @Override
    public void newEmployee() {
        Scanner sc = new Scanner(System.in);
try {
    System.out.println("사원번호는? : ");
    int empno = sc.nextInt();
    System.out.println("이름은? : ");
    String fname = sc.next();
    System.out.println("성은? : ");
    String lname = sc.next();
    System.out.println("이메일은? : ");
    String email = sc.next();
    System.out.println("전화번호는? : ");
    String phone = sc.next();
    System.out.println("입사일은? : ");
    String hdate = sc.next();

    double jobid = Math.random();
    double sal = Math.random();
    double comm = Math.random();
    double mgrid = Math.random();
    double deptid = Math.random();

    EmployeeVO e = new EmployeeVO(empno, fname, lname, email, phone, hdate, jobid, sal, comm, mgrid, deptid);

    edata.add(e);

} catch (Exception ex){
    System.out.println("잘못입력하셨습니다!!");
    return;
}
    }

    @Override
    public void showEmployee() {

        String fmt = "번호 : %d, 사원번호 : %d, 이름 : %s, 성 : %s, 이메일 : %s, \n 전화번호 : %s, 입사일 : %s";
        int pos = 0;

        for(EmployeeVO e : edata) {

            System.out.printf(fmt,pos,e.getEmpno(),e.getFname(),e.getLname(),
                    e.getEmail(),e.getPhone(),e.getHdate());
            ++pos;
            System.out.println(" ");
        }


    }

    @Override
    public void showOneEmployee() {

        String fmt = "번호 : %d, 사원번호 : %d, 이름 : %s, 성 : %s, 이메일 : %s, \n 전화번호 : %s, 입사일 : %s";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사원의 번호는? : ");
try {


    int pos = sc.nextInt();

    EmployeeVO e = edata.get(pos);

    System.out.printf(fmt, pos, e.getEmpno(), e.getFname(), e.getLname(),
            e.getEmail(), e.getPhone(), e.getHdate());

    System.out.println(" ");
    System.out.println("직책:" + (int) (e.jobid * 500));
    System.out.println("급여:" + (int) (e.sal * 40000));
    System.out.println("수당:" + (int) (e.comm * 40000));
    System.out.println("상사번호:" + (int) (e.mgrid * 500));
    System.out.println("부서번호:" + (int) (e.deptid * 500));
} catch (Exception ex) {
    System.out.println("데이터가 존재하지 않습니다.");
}

    }

    @Override
    public void modifyEmployee() {

    }

    @Override
    public void removeEmployee() {

    }
}
