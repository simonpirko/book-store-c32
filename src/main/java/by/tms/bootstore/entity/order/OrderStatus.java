package by.tms.bootstore.entity.order;

public enum OrderStatus {
    PROCESSED, // обрабатывается
    WAITING_FOR_PAYMENT, // ожидание оплаты
    ORDERED, // заказано
    DELIVERED, // доставляется
    DONE // доставлено
}
