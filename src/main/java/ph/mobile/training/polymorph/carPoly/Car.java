package ph.mobile.training.polymorph.carPoly;

public class Car {
    private int num;
    private String model;
    private double price;

    public Car (int num, String model, double price){
        this.num = num;
        this.model = model;
        this.price = price;
    }
    //getter
    public int getNum(){
        return this.num;
    }

    public String getModel(){
        return this.model;
    }

    public double getPrice(){
        return this.price;
    }

    //setter

    public void setNum(int num){
        this.num = num;

    }
    public void setModel(String model){
        this.model = model;

    }
    public void setPrice(double price){
        this.price = price;

    }

    public void displayCar(){
        System.out.println("Unit: "+ getNum());
        System.out.println("Model: "+getModel());
        System.out.println("Price: "+getPrice());
    }
}
