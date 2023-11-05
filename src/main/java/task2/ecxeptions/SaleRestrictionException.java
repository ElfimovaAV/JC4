package task2.ecxeptions;
/**
 * Исключение, выбрасываемое при назначении слишком большой скидки на товар премиум-категории.
 */
public class SaleRestrictionException extends RuntimeException {
    /**
     * Конструктор класса TooMuchSaleException.
     *
     * @param message сообщение об ошибке
     */
    public SaleRestrictionException(String message) {
        super(message);
    }
}