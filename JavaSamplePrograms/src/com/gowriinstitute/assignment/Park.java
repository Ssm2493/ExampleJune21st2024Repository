package com.gowriinstitute.assignment;
class nationalpark
{
    String parkname;
    String parkarea;
    String parkcity;
    int entryamount;
    nationalpark()
    {
        parkname="nalini park";
        parkarea="chandralayout";
        parkcity="BLR";
        entryamount=20;
        System.out.println("parkname  :"+parkname);
        System.out.println("parkarea:"+parkarea);
        System.out.println("parkcity:"+parkcity);
        System.out.println("entryamount:"+entryamount);
        System.out.println("!@#$%^&*!@#$%^&*!@#$%^&*");
    }
}
class wonderla
{
    String cusname;
    String cusage;
    long cusno;
    int amount;
    wonderla()
    {
        cusname="raju";
        cusage="above 18";
        cusno=8910698709l;
        amount=990;
        System.out.println("cusname  :"+cusname);
        System.out.println("cusage:"+cusage);
        System.out.println("cusno:"+cusno);
        System.out.println("amount:"+amount);
        System.out.println("!@#$%^&*!@#$%^&*!@#$%^&*");


    }
}
public class Park {
    public static void main(String args[]) {
        nationalpark obj = new nationalpark();
        wonderla obj1 = new wonderla();
    }
}
