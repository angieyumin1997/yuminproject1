package vttp2022.project1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp2022.project1.models.Order;
import vttp2022.project1.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    public Integer addNewOrder(Order order) {
        Integer order_id = orderRepo.insertOrder(order);
        return order_id;
    }

    public void updateOrderCartItem(Integer cartId,Integer orderId) {
        orderRepo.updateOrderCartItem(orderId,cartId);
    }

    public void updateOrderPayment(Order order) {
        orderRepo.updateOrderPayment(order);
    }

    public List<Order> selectAllUserPaidOrders(String username){
        return orderRepo.selectAllUserPaidOrders(username);
    }

    public List<Order> selectAllPaidOrders(){
        return orderRepo.selectAllPaidOrders();
    }

}
