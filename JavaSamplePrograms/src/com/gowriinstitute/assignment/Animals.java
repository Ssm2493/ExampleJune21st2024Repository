package com.gowriinstitute.assignment;
class animal
{
    String animalname;
    String animaltype;
    String animalfood;
    int count;
    animal()
    {
        animalname="lion";
        animaltype="wild animal";
        animalfood="NON VEG";
        count=10;
        System.out.println("animalname  :"+animalname);
        System.out.println("animaltype:"+animaltype);
        System.out.println("animalfood:"+animalfood);
        System.out.println("count:"+count);
        System.out.println("!@#$%^&*!@#$%^&*!@#$%^&*");
    }
}
class aquaticanimal
{
    String aquaanimalname;
    String aquaanimalspan;
    int weight ;
    String color;
    aquaticanimal()
    {
        aquaanimalname="shark";
        aquaanimalspan="10 years";
        weight=200;
        color="blue";
        System.out.println("aqua naimal name  :"+aquaanimalname);
        System.out.println("aqua animal span:"+aquaanimalspan);
        System.out.println("weight of the animal:"+weight);
        System.out.println("color of the animal:"+color);
        System.out.println("!@#$%^&*!@#$%^&*!@#$%^&*");


    }
}
public class Animals {
    public static void main(String args[]) {
        animal obj = new animal();
        aquaticanimal obj1 = new aquaticanimal();
    }
}
