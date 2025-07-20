package com.microservices.order_service.dto;

public class OrderResponse {
    private String product;
    private Double price;
    private String username;
    private String email;

    public String getProduct() {
        return product; }
    public void setProduct(String product) {
        this.product = product; }

    public Double getPrice() {
        return price; }
    public void setPrice(Double price) {
        this.price = price; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
