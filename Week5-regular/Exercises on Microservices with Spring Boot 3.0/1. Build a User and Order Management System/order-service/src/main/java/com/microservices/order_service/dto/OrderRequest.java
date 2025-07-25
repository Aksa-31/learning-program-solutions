package com.microservices.order_service.dto;

public class OrderRequest {
    private Long userId;
    private String product;
    private Double price;

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
