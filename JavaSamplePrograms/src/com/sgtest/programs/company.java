package com.sgtest.programs;
class employee
{
        String empName;
        int eid;
        String address;
        int sal;
}
class department
{
    String depName;
    int did;
    String depmgr;
    String depbranch;
}
class insurence
{
    String iname;
    int iNo;
    String ipno;
}
public class company {
    public static void main(String args[])
    {
        employee obj= new employee();
        obj.empName="raja";
        obj.eid=111;
        obj.address="rajajinagar";
        obj.sal=12000;
        System.out.println("empname  :"+obj.empName);
        System.out.println("eid:"+obj.eid);
        System.out.println("adresss:"+obj.address);
        System.out.println("sal:"+obj.sal);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
        department obj1=new department();
        obj1.depName="hr";
        obj1.did=01;
        obj1.depmgr="rohan";
        obj1.depbranch="vnagar";
        System.out.println("depname:" +obj1.depName);
        System.out.println("did:"+obj1.did);
        System.out.println("depmgr:"+obj1.depmgr);
        System.out.println("depbranch:"+obj1.depbranch);
        System.out.println("++++++++++++++++++++++++");
        insurence obj2=new insurence();
        obj2.iname="lic";
        obj2.iNo=001;
        obj2.ipno="AD12";
        System.out.println("insurance name:"+obj2.iname);
        System.out.println("insurance no:"+obj2.iNo);
        System.out.println("########################");

    }

}
