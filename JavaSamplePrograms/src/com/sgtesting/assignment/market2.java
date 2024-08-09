package com.sgtesting.assignment;
class fruits
{
    String fruitname;
    int qty;
    int price;
    String address;
    fruits()
    {
        fruitname="mango";
        qty=5;
        price=200;
        address="bambu bajar";
        System.out.println("fruitname  :"+fruitname);
        System.out.println("qty:"+qty);
        System.out.println("adresss:"+address);
        System.out.println("price:"+price);
        System.out.println("=========================");}
}
class flower
{
    String fname;
    int fqty;
    String faddress;
    String fplace;
    flower()
    {
        fname="rose";
        fqty=10;
        faddress="rr nagar";
        fplace="BLR";
        System.out.println("fname:" +fname);
        System.out.println("fqty:"+fqty);
        System.out.println("faddress:"+faddress);
        System.out.println("fplace:"+fplace);
        System.out.println("++++++++++++++++++++++++");}
}
class vegetables
{
    String vegname;
    int price;
    String place;
    int qty;
    vegetables()
    {
        vegname="mango";
        place="kr market";
        price=100;
        qty=12;
        System.out.println("veg  name:"+vegname);
        System.out.println("veg place:"+place);
        System.out.println("veg price:"+price);
        System.out.println("veg qty:"+place);
        System.out.println("========================");
    }
}
public class market2{
    public static void main(String args[])
    {
        fruits obj= new fruits();

        flower obj1=new flower();

        vegetables obj2=new vegetables();

    }

}

