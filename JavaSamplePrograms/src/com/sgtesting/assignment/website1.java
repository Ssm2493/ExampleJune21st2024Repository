package com.sgtesting.assignment;
class user
{
    String username;
    String useradd;
    int userno;
    String userplace;
    user()
    {
        username="raghu12";
        useradd="navarang";
        userno=123;
        userplace="kakinada";
        System.out.println("username  :"+username);
        System.out.println("user address:"+useradd);
        System.out.println("userno:"+userno);
        System.out.println("userplace:"+userplace);
        System.out.println("=========================");}
}
class userprofile
{
    String upname;
    String updp;
    double upno;
    String upadd;
    userprofile()
    {
        upname="ravana";
        upadd="rn layout";
        updp ="potrait";
        upno=104545;
        System.out.println("upname:" +upname);
        System.out.println("upadd:"+upadd);
        System.out.println("upno:"+upno);
        System.out.println("updp:"+upadd);
        System.out.println("++++++++++++++++++++++++");}
}
class role
{
    String rname;
    String rtype;
    int rsal;
    String rplace;
    role()
    {
        rname="quality enginner";
        rsal=12000;
        rtype="marketing";
        rplace="belagavi";
        System.out.println("role name:"+rname);
        System.out.println("role sal:"+rsal);
        System.out.println("role type:"+rtype);
        System.out.println("role place:"+rplace);
        System.out.println("========================");}
}
public class website1{
    public static void main(String args[])
    {
        user obj= new user();

        userprofile obj1=new userprofile();
        role obj2=new role();


    }

}
