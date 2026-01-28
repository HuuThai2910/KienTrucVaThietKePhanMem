/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
class Stock implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String symbol;
    private double price;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        // Bất cứ khi nào giá thay đổi, tự động thông báo
        notifyObservers();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update("STOCK ALERT: Mã " + symbol + " vừa thay đổi giá thành: $" + price);
        }
    }
}