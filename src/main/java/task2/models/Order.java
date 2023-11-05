package task2.models;

/**
 * Класс, представляющий заказ.
 */
public class Order {
    private Customer customer;
    private Product product;
    private int quantity;
    private double cost;

    /**
     * Конструктор класса Order.
     *
     * @param customer покупатель
     * @param product  товар
     * @param quantity количество товара
     */
    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.cost = product.getPrice() * quantity;
    }

    /**
     * Получить покупателя.
     *
     * @return покупатель
     */
    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    /**
     * Геттер для объекта товар
     *
     * @return объект товар
     */
    public Product getProduct() {
        return product;
    }
    /**
     * Сеттер для объекта товар
     *
     * @param product новый объект товар
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Получить количество товара.
     *
     * @return количество товара
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * Сеттер для количества товара
     *
     * @param quantity новое количество товара
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /**
     * Геттер для стоимости заказа
     *
     * @return стоимость заказа
     */
    public double getCost() {
        return cost;
    }
    /**
     * Сеттер для стоимости заказа
     *
     * @param cost новая стоимость заказа
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
}
