package by.tms.bootstore.service;

import by.tms.bootstore.entity.order.OrderBook;
import by.tms.bootstore.entity.order.OrderStatus;
import by.tms.bootstore.entity.order.OrderUser;
import by.tms.bootstore.entity.order.Store;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class OrderService {

    public void createBookInOrder() {
    }

    public void updateCountOrderBookById(long id, OrderBook orderBook){
    }

    public void createOrderBook() {
    }

    public void updateOrderBook() {
    }

    public void connectOrderUser(long id) {
    }

    public Store getStoreByAddress(String address) {
        return new Store();
    }

    public Store getStoreById(long id) {
        return new Store();
    }

    public List<Store> getStoreList() {
        return new ArrayList<Store>();
    }

    public void connectStoreWithOrderUser() {
    }

    public OrderStatus getOrderStatusById(long id){
        return OrderStatus.DELIVERED;
    }

    public OrderUser getOrderInformation(){
        return new OrderUser();
    }


}
