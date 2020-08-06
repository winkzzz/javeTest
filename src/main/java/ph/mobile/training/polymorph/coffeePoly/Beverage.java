package ph.mobile.training.polymorph.coffeePoly;

public class Beverage {
    private int milk;
    private int sugar;

    public Beverage(int milk, int sugar){
        this.milk = milk;
        this.sugar = sugar;
    }

    public int getMilk(){
        return this.milk;
    }
    public int getSugar(){
        return this.sugar;
    }
    public void setBeverage(int sugar, int milk){
        this.sugar = sugar;
        this.milk = milk;
    }

    public void displayBeverage(){
        System.out.println("Sugar: "+getSugar()+ "%");
        System.out.println("Milk: "+getMilk()+ "%");
    }
}
