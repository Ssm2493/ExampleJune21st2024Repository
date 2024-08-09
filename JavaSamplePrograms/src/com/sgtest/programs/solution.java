package com.sgtest.programs;
class customer
{
    String cname;
    String caddress;
    int cno;
    String creq;
}
class project
{
    String pname;
    String ptitle;
    String phead;
    int pduration;
}
class task
{
    String tname;
    String thead;
    String tduration;
    int tprice;
}
public class solution {
    public static void main(String args[]) {
        customer obj = new customer();
        obj.cname = "zentech";
        obj.caddress = "marthalli";
        obj.cno = 12;
        obj.creq = "bankingerp";
        System.out.println("cname  :" + obj.cname);
        System.out.println("caddress:" + obj.caddress);
        System.out.println("cno:" + obj.cno);
        System.out.println("creq:" + obj.creq);
        System.out.println("=========================");
        project obj1 = new project();
        obj1.pname = "mastar plan";
        obj1.ptitle = "urban planning";
        obj1.phead = "aruana salimath";
        obj1.pduration = 7;
        System.out.println("phead:" + obj1.phead);
        System.out.println("pname" + obj1.pname);
        System.out.println("ptitle:" + obj1.ptitle);
        System.out.println("pduration:" + obj1.pduration);
        System.out.println("++++++++++++++++++++++++");
        task obj2 = new task();
        obj2.tname = "build one";
        obj2.thead = "priyanka kharge";
        obj2.tprice = 2000;
        obj2.tduration = "45days";
        System.out.println("task name:" + obj2.tname);
        System.out.println("task head:" + obj2.thead);
        System.out.println("task duration:" + obj2.tduration);
        System.out.println("task price:" + obj2.tprice);
        System.out.println("========================");

    }
}