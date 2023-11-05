package task2.models;

import java.util.Random;

/**
 * Перечисление, представляющее размер скидки.
 */
public enum Discount {
    FIVE(5),
    TEN(10),
    FIFTEEN(15),
    TWENTY(20),
    TWENTY_FIVE (25);

    private final int value;

    /**
     * Конструктор перечисления DiscountSize.
     *
     * @param value Процент скидки.
     */
    Discount(int value) {
        this.value =  value;
    }

    public int getValue() {
        return value;
    }
}