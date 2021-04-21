package rldnd.basic.day17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCMember {
    public static void main(String[] args) {
        // 네이버 회원가입 기능을 JDBC로 구현
        // 테이블명 : NMember
        // 테이블 컬럼 구성 : 아이디userid, 비밀번호passwd, 이름name,
        //                    생년월일birth, 성별gender, 이메일email, 휴대전화hp
        // 자동입력 컬럼 :    회원번호mbno(PK), 가입일regdate


        // 테이블 생성

        // 데이터 삽입 테스트
        // insert into NMember(userid,passwd,name,birth,gender,email,hp)
        //         values ('abc123','987xyz','홍길동','2021-04-21',
        //                 '0','abc123@987xyz.com','012-3456-6789');

        // 데이터 조회 테스트

        // select mbno,userid,name,regdate from NMember
        //        order by mbno desc;


        // 데이터 상세조회 테스트
        // select * from NMember where mbno = 1;


        // 데이터 수정 테스트
        // update NMember set name = "전지현",
        //        birth = "2020-04-21", hp="010-6789-1234"
        // where mbno = 1;


        // 데이터 삭제 테스트
        // delete from NMember where mbno = 1;

        MaridJDBC jdbc = new MaridJDBC();

        String sql = " create table NMember (mbno int primary key auto_increment, userid varchar(18) not null, " +
                " passwd varchar(18) not null, name varchar(10) not null, birth varchar(10) not null, gender int not null, " +
                " email varchar(50), hp varchar(15), regdate datetime default current_timestamp ) ";


        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ) {

            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("회원가입 테이블 생성");
        } catch (Exception ex) {
            System.out.println("테이블이 이미 존재하거나 시스템 오류");
        }



        Scanner sc = new Scanner(System.in);



        System.out.println("아이디는?");
        String uid = sc.next();
        System.out.println("비밀번호는?");
        String pwd = sc.next();
        System.out.println("이름은?");
        String name = sc.next();
        System.out.println("생일은?");
        String bth = sc.next();
        System.out.println("성별은 0남자 1여자 2선택안함");
        String gdr = sc.next();
        System.out.println("이메일은?");
        String eml = sc.next();
        System.out.println("핸드폰번호는?");
        String hp = sc.next();

        // JDBC를 이용해서 NMember 테이블에 회원정보 저장하기
        sql = " insert into NMember (userid,passwd,name,birth,gender,email,hp) " +
                " values(?,?,?,?,?,?,?) ";

        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql)
                ) {
            pstmt.setString(1,uid);
            pstmt.setString(2,pwd);
            pstmt.setString(3,name);
            pstmt.setString(4,bth);
            pstmt.setString(5,gdr);
            pstmt.setString(6,eml);
            pstmt.setString(7,hp);

            int cnt =pstmt.executeUpdate();
            if(cnt > 0) System.out.println("회원정보 추가 완료");

        } catch (Exception ex){
            ex.printStackTrace();
        }


        // 회원가입 완료 후 지금까지 가입한 모든 회원 조회
        // 조회 대상 컬럼 : 회원번호, 아이디, 이름, 가입일

        sql = " select mbno,userid,name,regdate from NMember " +
                " order by mbno desc ";

        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                ) {
            StringBuffer sb = new StringBuffer();
            while(rs.next()){
                sb.append(rs.getString(1)).append(" ")
                        .append(rs.getString(2)).append(" ")
                        .append(rs.getString(3)).append(" ")
                        .append(rs.getString(4).substring(0,10)).append(" ")
                        .append("\n");
            }
            System.out.println(sb.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }



    } // main
} // class
