package 박기웅.basic.lab;

public class EmployeeVO {

    protected int empno;
    protected String fname;
    protected String lname;
    protected String email;
    protected String phone;
    protected String hdate;
    protected double jobid;
    protected double sal;
    protected double comm;
    protected double mgrid;
    protected double deptid;

    public EmployeeVO(int empno, String fname, String lname, String email, String phone, String hdate, double jobid, double sal, double comm, double mgrid, double deptid) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
        this.jobid = jobid;
        this.sal = sal;
        this.comm = comm;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public double getJobid() {
        return jobid;
    }

    public void setJobid(double jobid) {
        this.jobid = jobid;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public double getMgrid() {
        return mgrid;
    }

    public void setMgrid(double mgrid) {
        this.mgrid = mgrid;
    }

    public double getDeptid() {
        return deptid;
    }

    public void setDeptid(double deptid) {
        this.deptid = deptid;
    }
}

