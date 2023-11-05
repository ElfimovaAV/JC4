package task2.models;

public class Customer {

    private String lastName;
    private String firstName;
    private int age;
    private String phone;

    /**
     * Конструктор класса Customer.
     *
     * @param lastName  Фамилия покупателя.
     * @param firstName Имя покупателя.
     * @param age       Возраст покупателя.
     * @param phone     Телефон покупателя.
     */
    public Customer(String lastName, String firstName, int age, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phone = phone;
    }

    // Геттеры и сеттеры для всех полей
    /**
     * Получить фамилию покупателя.
     * @return Фамилия покупателя.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Установить фамилию покупателя.
     * @param lastName Фамилия покупателя.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Получить имя покупателя.
     * @return Имя покупателя.
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Установить имя покупателя.
     * @param firstName Имя покупателя.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Получить возраст покупателя.
     * @return Возраст покупателя.
     */
    public int getAge() {
        return age;
    }
    /**
     * Установить возраст покупателя.
     * @param age Возраст покупателя.
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Получить телефон покупателя.
     * @return Телефон покупателя.
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Установить телефон покупателя.
     * @param phone Телефон покупателя.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}