package com.Adventure;

import org.w3c.dom.ls.LSOutput;

public class Main {
private static StockList stockList = new StockList();
    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 5);
        stockList.addStock(temp);

        temp = new StockItem("chair", 200, 20);
        stockList.addStock(temp);

        temp = new StockItem("chair", 500, 20);
        stockList.addStock(temp);

        temp = new StockItem("cup", 7, 2);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket tim = new Basket("Tim");
        sellItem(tim,"chair",2);
        System.out.println(tim);


    }

    public static int sellItem ( Basket basket, String item, int quantity){
        //retrieve item from stocklist
        StockItem stockItem = stockList.get(item);
        if(item==null){
            System.out.println("We dont sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity)!=0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
