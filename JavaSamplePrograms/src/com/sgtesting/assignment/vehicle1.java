package com.sgtesting.assignment;
class twowheeler
{
    String bname;
    String bcompany;
    int price;
    String bno;
    twowheeler()
    {
        bname="fz-s";
        bcompany="yamaha";
        price=200000;
        bno="ka03hq6854";
        System.out.println("bname  :"+bname);
        System.out.println("bcompany:"+bcompany);
        System.out.println("bno:"+bno);
        System.out.println("price:"+price);
        System.out.println("=========================");}
}
class fourwheeler
{
    String fname;
    int fqty;
    String fno;
    String fmodel;
    fourwheeler()
    {
        fname="kia sonet";
        fqty=1;
        fmodel ="2023";
        fno="ka03hq6889";
        System.out.println("fname:" +fname);
        System.out.println("fqty:"+fqty);
        System.out.println("fmodel:"+fmodel);
        System.out.println("fno:"+fno);
        System.out.println("++++++++++++++++++++++++");}
}
class heavyvehicles
{
    String hvname;
    int price;
    int hvqty;
    String hvno;
    heavyvehicles()
    {
        hvname="transporter1";
        hvno="ka32ht2485";
        price=5000000;
        hvqty=12;
        System.out.println("hv  name:"+hvname);
        System.out.println("hv no:"+hvno);
        System.out.println("hv price:"+price);
        System.out.println("hv qty:"+hvqty);
        System.out.println("========================");}
}
public class vehicle1{
    public static void main(String args[])
    {
        twowheeler obj= new twowheeler();

        fourwheeler obj1=new fourwheeler();

        heavyvehicles obj2=new heavyvehicles();


    }

}

