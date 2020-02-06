package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Chocolates chocolates = new Chocolates();
        Candies candies = new Candies();
        System.out.println("Weight of the gift");
        int weight = sc.nextInt();
        int remaining_weight;
        System.out.println("Chocolates want to add");
        String name1 = sc.next();
        System.out.println("Price you want for the chocolate");
        int price = sc.nextInt();
        chocolates.add(name1,price);
        remaining_weight=chocolates.add(weight);
        candies.add(remaining_weight);
        chocolates.print();
        candies.print();


    }
}
