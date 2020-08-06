package ph.mobile.training.encapsulation;


public class Car {

    private int num;
    private String name;
    private String model;
    private double price;

    //getter
    public int getNum(){
        return this.num;
    }

    public String getName(){
        return this.name;
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

    public void setName(String name){
        this.name = name;

    }

    public void setModel(String model){
        this.model = model;

    }

    public void setPrice(double price){
        this.price = price;

    }

}


