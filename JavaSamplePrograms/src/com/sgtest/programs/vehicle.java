package com.sgtest.programs;
class twowheeler
{
    String bname;
    String bcompany;
    int price;
    String bno;
}
class fourwheeler
{
    String fname;
    int fqty;
    String fno;
    String fmodel;
}
class heavyvehicles
{
    String hvname;
    int price;
    int hvqty;
    String hvno;
}
public class vehicle{
    public static void main(String args[])
    {
        twowheeler obj= new twowheeler();
        obj.bname="fz-s";
        obj.bcompany="yamaha";
        obj.price=200000;
        obj.bno="ka03hq6854";
        System.out.println("bname  :"+obj.bname);
        System.out.println("bcompany:"+obj.bcompany);
        System.out.println("bno:"+obj.bno);
        System.out.println("price:"+obj.price);
        System.out.println("=========================");
        fourwheeler obj1=new fourwheeler();
        obj1.fname="kia sonet";
        obj1.fqty=1;
        obj1.fmodel ="2023";
        obj1.fno="ka03hq6889";
        System.out.println("fname:" +obj1.fname);
        System.out.println("fqty:"+obj1.fqty);
        System.out.println("fmodel:"+obj1.fmodel);
        System.out.println("fno:"+obj1.fno);
        System.out.println("++++++++++++++++++++++++");
        heavyvehicles obj2=new heavyvehicles();
        obj2.hvname="transporter1";
        obj2.hvno="ka32ht2485";
        obj2.price=5000000;
        obj2.hvqty=12;
        System.out.println("hv  name:"+obj2.hvname);
        System.out.println("hv no:"+obj2.hvno);
        System.out.println("hv price:"+obj2.price);
        System.out.println("hv qty:"+obj2.hvqty);
        System.out.println("========================");

    }

}
