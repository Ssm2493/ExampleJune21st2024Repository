package com.sgtest.programs;
class user
{
    String username;
    String useradd;
    int userno;
    String userplace;
}
class userprofile
{
    String upname;
    String updp;
    double upno;
    String upadd;
}
class role
{
    String rname;
    String rtype;
    int rsal;
    String rplace;
}
public class website{
    public static void main(String args[])
    {
        user obj= new user();
        obj.username="raghu12";
        obj.useradd="navarang";
        obj.userno=123;
        obj.userplace="kakinada";
        System.out.println("username  :"+obj.username);
        System.out.println("user address:"+obj.useradd);
        System.out.println("userno:"+obj.userno);
        System.out.println("userplace:"+obj.userplace);
        System.out.println("=========================");
        userprofile obj1=new userprofile();
        obj1.upname="ravana";
        obj1.upadd="rn layout";
        obj1.updp ="potrait";
        obj1.upno=104545;
        System.out.println("upname:" +obj1.upname);
        System.out.println("upadd:"+obj1.upadd);
        System.out.println("upno:"+obj1.upno);
        System.out.println("updp:"+obj1.upadd);
        System.out.println("++++++++++++++++++++++++");
        role obj2=new role();
        obj2.rname="quality enginner";
        obj2.rsal=12000;
        obj2.rtype="marketing";
        obj2.rplace="belagavi";
        System.out.println("role name:"+obj2.rname);
        System.out.println("role sal:"+obj2.rsal);
        System.out.println("role type:"+obj2.rtype);
        System.out.println("role place:"+obj2.rplace);
        System.out.println("========================");

    }

}