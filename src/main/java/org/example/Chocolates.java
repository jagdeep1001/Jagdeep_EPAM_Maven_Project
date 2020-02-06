package org.example;

public class Chocolates implements Sweets {
    private String name;
    private int price;
    final private int weight=40;
    private int choco;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }
    void add(String name,int price)
    {
        this.name=name;
        this.price=price;
    }
    int add(int total_weight)
    {
        total_weight=total_weight*1000;
        return (total_weight-weight);
    }
    public void print()
    {
        System.out.println("15 chocolates added");
    }
}
