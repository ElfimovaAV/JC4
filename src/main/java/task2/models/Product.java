package task2.models;

import task2.ecxeptions.SaleRestrictionException;
import task2.models.Discount;

import java.util.Random;

/**
 * Класс, представляющий товар.
 */
public class Product {

    private String name;
    private double price;


    /**
     * Конструктор класса Product.
     *
     * @param name     Название товара.
     * @param price    Цена товара.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }
    // Геттеры и сеттеры для свойств товара

    /**
     * Получить название товара.
     *
     * @return Название товара.
     */
    public String getName() {
        return name;
    }

    /**
     * Установить название товара.
     *
     * @param name Название товара.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получить цену товара.
     *
     * @return Цена товара.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Установить цену товара.
     *
     * @param price Цена товара.
     */
    public void setPrice(double price) {
        this.price = price;
    }



    /**
     * Метод для установки случайной скидки на товар
     */
    public void setRandomDiscount() throws SaleRestrictionException {
        Discount[] discounts = Discount.values();
        Random random = new Random();
        Discount discount = discounts[random.nextInt(discounts.length)];
        if (discount.getValue() > 20) {
            throw new SaleRestrictionException("Скидка на товар не может быть более " + discount.getValue() + "%");
        }
        double newPrice = price - (price * discount.getValue() / 100.0);
        price = newPrice;
    }

}
