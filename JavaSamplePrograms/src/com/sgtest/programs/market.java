package com.sgtest.programs;
class fruits
{
    String fruitname;
    int qty;
    int price;
    String address;
}
class flower
{
    String fname;
    int fqty;
    String faddress;
    String fplace;
}
class vegetables
{
    String vegname;
    int price;
    String place;
    int qty;
}
public class market{
    public static void main(String args[])
    {
        fruits obj= new fruits();
        obj.fruitname="mango";
        obj.qty=5;
        obj.price=200;
        obj.address="bambu bajar";
        System.out.println("fruitname  :"+obj.fruitname);
        System.out.println("qty:"+obj.qty);
        System.out.println("adresss:"+obj.address);
        System.out.println("price:"+obj.price);
        System.out.println("=========================");
        flower obj1=new flower();
        obj1.fname="rose";
        obj1.fqty=10;
        obj1.faddress="rr nagar";
        obj1.fplace="BLR";
        System.out.println("fname:" +obj1.fname);
        System.out.println("fqty:"+obj1.fqty);
        System.out.println("faddress:"+obj1.faddress);
        System.out.println("fplace:"+obj1.fplace);
        System.out.println("++++++++++++++++++++++++");
        vegetables obj2=new vegetables();
        obj2.vegname="mango";
        obj2.place="kr market";
        obj2.price=100;
        obj2.qty=12;
        System.out.println("veg  name:"+obj2.vegname);
        System.out.println("veg place:"+obj2.place);
        System.out.println("veg price:"+obj2.price);
        System.out.println("veg qty:"+obj2.place);
        System.out.println("========================");

    }

}
