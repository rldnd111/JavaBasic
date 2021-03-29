package 박기웅.basic.day10;

import 박기웅.basic.sungjuk.SungJukService;
import 박기웅.basic.sungjuk.SungJukServiceImpl;
import 박기웅.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
       // SungJukService sjsrv = new SungJukServiceImpl();

       SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);


    }
}
