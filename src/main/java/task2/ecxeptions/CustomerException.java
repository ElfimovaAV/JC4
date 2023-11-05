package task2.ecxeptions;

public class CustomerException extends Exception {

    /**
     * Конструктор класса CustomerException.
     *
     * @param message сообщение об ошибке
     */
    public CustomerException(String message) {
        super(message);
    }

}