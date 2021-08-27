package test1;

public class Car  extends Bike implements parchaseable  {
    @Override
    public void color(){
        System.out.println("Car has white color");
    }
    @Override
    public void year(){
        System.out.println("Car Year product 2020 ");
    }
    public void Bname(){
        System.out.println("Benz , BMW , COROLLA");
    }

    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.year();
        obj1.color();
        obj1.Bname();
    }
    @Override
    public void setSalePrice() {
        System.out.println(" car price 20000$");
    }
    @Override
    public void getSalePrice() {
        System.out.println(" car sold price 18000$");
    }
}
