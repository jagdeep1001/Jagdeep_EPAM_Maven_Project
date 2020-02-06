package org.example;

public class Candies implements Sweets{
    private String name;
    private int price;
    private int cand;
    final   private int weight = 50;

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
    void add(int remain_weight)
    {
        cand = remain_weight/weight;
    }
    public void print()
    {
        System.out.println(cand + " no of candies added");
    }
}
