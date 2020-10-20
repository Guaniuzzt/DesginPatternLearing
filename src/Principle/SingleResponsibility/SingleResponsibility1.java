package Principle.SingleResponsibility;

public class SingleResponsibility1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();


    }


}

//交通工具类
class Vehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
}
