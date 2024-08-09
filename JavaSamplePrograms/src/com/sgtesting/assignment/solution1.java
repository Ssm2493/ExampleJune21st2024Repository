package com.sgtesting.assignment;
class customer
{
    String cname;
    String caddress;
    int cno;
    String creq;
    customer()
    {
        cname = "zentech";
        caddress = "marthalli";
        cno = 12;
        creq = "bankingerp";
        System.out.println("cname  :" +cname);
        System.out.println("caddress:" +caddress);
        System.out.println("cno:" +cno);
        System.out.println("creq:" +creq);
        System.out.println("=========================");}
}
class project
{
    String pname;
    String ptitle;
    String phead;
    int pduration;
    project()
    {
        pname = "mastar plan";
        ptitle = "urban planning";
        phead = "aruana salimath";
        pduration = 7;
        System.out.println("phead:" + phead);
        System.out.println("pname" + pname);
        System.out.println("ptitle:" + ptitle);
        System.out.println("pduration:" + pduration);
        System.out.println("++++++++++++++++++++++++");}
}
class task
{
    String tname;
    String thead;
    String tduration;
    int tprice;
    task()
    {
        tname = "build one";
        thead = "priyanka kharge";
        tprice = 2000;
        tduration = "45days";
        System.out.println("task name:" +tname);
        System.out.println("task head:" + thead);
        System.out.println("task duration:" + tduration);
        System.out.println("task price:" + tprice);
        System.out.println("========================");
    }
}
public class solution1 {
    public static void main(String args[]) {
        customer obj = new customer();

        project obj1 = new project();

        task obj2 = new task();


    }
}
