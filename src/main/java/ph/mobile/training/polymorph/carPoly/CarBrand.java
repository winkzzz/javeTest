package ph.mobile.training.polymorph.carPoly;

public class CarBrand extends Car{


    public CarBrand(int num, String model, double price, String brand) {
        super(num, model, price);
        setBrand(brand);
    }

    private String brand;

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    @Override
    public void displayCar(){
        System.out.println("Unit: "+ getNum());
        System.out.println("Name: "+getBrand());
        System.out.println("Model: "+getModel());
        System.out.println("Price: "+getPrice());
    }
}
