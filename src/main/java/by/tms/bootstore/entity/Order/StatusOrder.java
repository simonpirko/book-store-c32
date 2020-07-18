package by.tms.bootstore.entity.Order;

public enum StatusOrder {
    PROCESSED, // обрабатывается
    WAITING_FOR_PAYMENT, // ожидание оплаты
    ORDERED, // заказано
    DELIVERED, // доставляется
    DONE // доставлено
}
