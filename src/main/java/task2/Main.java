package task2;

import task2.ecxeptions.AmountException;
import task2.ecxeptions.CustomerException;
import task2.ecxeptions.ProductException;
import task2.ecxeptions.SaleRestrictionException;
import task2.models.Customer;
import task2.models.Discount;
import task2.models.Order;
import task2.models.Product;

import java.util.Random;

public class Main {
    private static Customer[] customers = new Customer[3];
    private static Product[] products = new Product[5];

    public static void main(String[] args) {

    //массив покупателей
        customers[0] = new Customer("Kozlov", "Oleg", 60, "5553331212");
        customers[1] = new Customer("Makarov", "Aleksey", 42, "333451245");
        customers[2] = new Customer("Popova", "Irina", 18, "444585896");
    //массив товаров
        products[0] = new Product("BottleOfWater", 50.0);
        products[1] = new Product("HotDog", 180.0);
        products[2] = new Product("Pizza", 490.0);
        products[3] = new Product("Hamburger", 250.0);
        products[4] = new Product("CocaCola", 90.0);


        double oldPrice = products[3].getPrice();
        try {
            products[3].setRandomDiscount();
            System.out.println("На " + products[3].getName() + " действует скидка: " +
                    products[3].getPrice() + ", его старая цена за штуку " + oldPrice);
            System.out.println();
        } catch (SaleRestrictionException e) {
            System.out.println(e.getMessage());
        }


        // Создаем массив заказов
        Random random = new Random();
        int orderCount = random.nextInt(10) + 1; // Генерация случайного числа от 1 до 10
        Order[] orders = new Order[orderCount];

        for (int i = 0; i < orders.length; i++) {
            Customer Customer = customers[random.nextInt(customers.length)];
            Product Product = products[random.nextInt(products.length)];


            int Quantity = random.nextInt(5) - 1;

            // Вызываем метод совершения покупки для заполнения массива заказов
            try {
                orders[i] = makePurchase(Customer.getLastName(), Product.getName(), Quantity);
                // Выводим информацию о заказах
                System.out.println("Заказ: " + orders[i].getProduct().getName() + ", количество: "
                        + orders[i].getQuantity() + ", стоимость: " + orders[i].getCost());
            } catch (CustomerException e) {
                System.out.println(e.getMessage() + " (" + Customer.getLastName() + ")");
            } catch (ProductException e) {
                System.out.println(e.getMessage() + " (" + Product.getName() + ")");
            } catch (AmountException e) {
                System.out.println(e.getMessage() + " (" + Quantity + ")");
            }
        }


        /**
         * Метод для подсчета общего количества совершенных покупок.
         *
         * @param orders массив заказов
         * @return общее количество покупок
         */
        int count = 0;
        for (Order order : orders) {
            if (order != null) {
                count++;
            }
        }


        // Выводим информацию о совершенных покупках
        System.out.println("Количество совершенных покупок: " + count);
    }

    /**
     * Метод для совершения покупки
     *
     * @param lastName    фамилия покупателя
     * @param productName название товара
     * @param quantity    количество товара
     * @return объект заказа
     * @throws CustomerException если передан несуществующий покупатель
     * @throws ProductException  если передан несуществующий товар
     * @throws AmountException   если передано неверное количество товара
     */
    public static <customer> Order makePurchase(String lastName, String productName, int quantity)
            throws CustomerException, ProductException, AmountException {
        Customer customer = null;
        for (Customer c : customers) {
            if (c.getLastName().equals(lastName)) {
                customer = c;
                break;
            }
        }

        if (customer == null) {
            throw new CustomerException("Такой покупатель не зарегистрирован: " + lastName);
        }

        Product product = null;
        for (Product p : products) {
            if (p.getName().equals(productName)) {
                product = p;
                break;
            }
        }

        if (product == null) {
            throw new ProductException("Такого товара нет в продаже: " + productName);
        }

        if (quantity <= 0 || quantity > 49) {
            throw new AmountException("Неверное количество товара в заказе: " + " " + lastName + " " + productName);
        }

        return new Order(customer, product, quantity);
    }
}
