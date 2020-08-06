package ph.mobile.training.inheritance.coffee;

public class CoffeeName extends Coffee{
    public void cappuccino(){
        coffee = 40;
        milk = 40;
        sugar = 20;

        System.out.println("One Cappuccino coming up!");
    }

    public void latte(){
        coffee = 30;
        milk = 50;
        sugar = 20;

        System.out.println("One Latte coming up!");
    }

    public void espresso(){
        coffee = 70;
        milk = 0;
        sugar = 20;

        System.out.println("One Espresso coming up!");
    }

    public int getCoffee(){
        return coffee;
    }
    public int getMilk(){
        return milk;
    }
    public int getSugar(){
        return sugar;
    }

    public void setCoffee(int coffee, int milk, int sugar){
        this.coffee = coffee;
        this.milk = milk;
        this.sugar = sugar;
    }
}
