package by.tms.bootstore.entity.order;

import by.tms.bootstore.entity.user.User;

import java.util.List;

public class OrderBook {

    private long id;
    private List <BookInOrder> bookInOrder;
    private User user;
}
