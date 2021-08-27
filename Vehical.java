package test1;

public class Vehical {

    public String Bname;
    public String type;
    public int wheels;
    public  String color;
    public int model;

    public void proparti(String Bname , String type , int wheels , String color , int model){
     this.Bname = Bname;
     this.type = type;
     this.wheels = wheels;
     this.color = color;
     this.model= model;
    }
    public void display ()
    {
        System.out.println(Bname + "Benz");
        System.out.println(type + "Auto");
        System.out.println(wheels + 4);
        System.out.println(color + "Black");
        System.out.println(model+ 2018);


    }

    public static void main(String[] args) {
        Vehical cl = new Vehical();
        cl.display();
    }
}
