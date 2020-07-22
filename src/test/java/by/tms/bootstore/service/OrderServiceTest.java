package by.tms.bootstore.service;

import by.tms.bootstore.entity.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    OrderService orderService = new OrderService();

    @Test
    void getStoreById() {
        User user = new User();
        user.setLogin("Test");
        User user2 = new User();
        user2.setLogin("Test");
        assertEquals(user, user2);
    }

    @Test
    void getStoreList() {
        int sum = orderService.sum(2, 2);
//        assertEquals(4, sum);
        assertEquals("0", sum);
    }

    @Test
    void connectStoreWithOrderUser() {
    }

    @Test
    void getOrderStatusById() {
    }

    @Test
    void getOrderInformation() {
    }
}