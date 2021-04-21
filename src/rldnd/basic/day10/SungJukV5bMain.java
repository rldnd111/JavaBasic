package rldnd.basic.day10;

import rldnd.basic.sungjuk.SungJukService;
import rldnd.basic.sungjuk.SungJukServiceImpl;
import rldnd.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
       // SungJukService sjsrv = new SungJukServiceImpl();

       SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);


    }
}
