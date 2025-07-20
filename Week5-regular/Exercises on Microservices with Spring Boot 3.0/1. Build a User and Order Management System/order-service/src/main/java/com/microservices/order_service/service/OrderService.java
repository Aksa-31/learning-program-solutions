package com.microservices.order_service.service;

import com.microservices.order_service.dto.OrderRequest;
import com.microservices.order_service.dto.OrderResponse;
import com.microservices.order_service.dto.UserDTO;
import com.microservices.order_service.model.Order;
import com.microservices.order_service.repository.OrderRepository;
import com.microservices.order_service.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserClient userClient;

    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setUserId(orderRequest.getUserId());
        order.setProduct(orderRequest.getProduct());
        order.setPrice(orderRequest.getPrice());

        Order savedOrder = orderRepository.save(order);

        UserDTO user = userClient.getUserById(orderRequest.getUserId());

        OrderResponse response = new OrderResponse();
        response.setProduct(savedOrder.getProduct());
        response.setPrice(savedOrder.getPrice());
        response.setUsername(user.getName());
        response.setEmail(user.getEmail());

        return response;
    }
}
