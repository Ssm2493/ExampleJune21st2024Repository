package com.sgtesting.assignment;
class employee1
{
    String empName;
    int eid;
    String address;
    int sal;
    employee1()
    {
        empName="raja";
        eid=111;
        address="rajajinagar";
        sal=12000;
        System.out.println("empname  :"+empName);
        System.out.println("eid:"+eid);
        System.out.println("adresss:"+address);
        System.out.println("sal:"+sal);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");}

}
class department1
{
    String depName;
    int did;
    String depmgr;
    String depbranch;
    department1()
    {
        depName="hr";
        did=01;
        depmgr="rohan";
        depbranch="vnagar";
        System.out.println("depname:" +depName);
        System.out.println("did:"+did);
        System.out.println("depmgr:"+depmgr);
        System.out.println("depbranch:"+depbranch);
        System.out.println("++++++++++++++++++++++++");
    }}
class insurence1
{
    String iname;
    int iNo;
    String ipno;
    insurence1()
    {
        iname="lic";
        iNo=001;
        ipno="AD12";
        System.out.println("insurance name:"+iname);
        System.out.println("insurance no:"+iNo);
        System.out.println("########################");
    }
}
public class company1 {
    public static void main(String args[])
    {
        employee1 obj= new employee1();

        department1 obj1=new department1();

        insurence1 obj2=new insurence1();


    }

}
