package ph.mobile.training.encapsulation;

public class Person {
    private int age;
    private String name;
    private double salary;

    // getter
    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    //setter
    public void setAge(int age){
        this.age = age;

    }

    public void setName(String name){
        this.name = name;

    }

    public void setSalary(double salary){
        this.salary = salary;

    }

    //ToString here
    public String toString(){
        return "Hi! my name is "+name + " my age is " + age+ " and sadly my salary is "  + salary;
    }

}



