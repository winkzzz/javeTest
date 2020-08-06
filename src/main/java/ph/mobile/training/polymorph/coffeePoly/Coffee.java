package ph.mobile.training.polymorph.coffeePoly;

public class Coffee extends Beverage {
    private int coffee;


    public Coffee(int coffee ,int milk, int sugar) {
        super(milk, sugar);
        setCoffee(coffee);
    }

    public int getCoffee(){
        return this.coffee;
    }

    public void setCoffee(int coffee){
        this.coffee = coffee;
    }

    @Override
    public void displayBeverage(){
        System.out.println("Coffee: "+getCoffee()+ "%");
        System.out.println("Milk: "+getMilk()+ "%");
        System.out.println("Sugar: "+getSugar()+ "%");

    }
}
