package com.mh.green2nd.orders;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mh.green2nd.orders.orderitem.OrderMenu;
import com.mh.green2nd.store.Store;
import com.mh.green2nd.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @OneToMany(mappedBy = "order",
            fetch = FetchType.LAZY, // select
            cascade = CascadeType.ALL // item저장
            , orphanRemoval = true// 고아객체제거
    )
    private List<OrderMenu> orderItems = new ArrayList<>();
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "total_order_price")
    private double totalOrderPrice;
    public void addToTotalCartPrice(double price) {
        this.totalOrderPrice += price;
    }

    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(double totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "store_id")
    @JsonManagedReference
    private Store store;

    @Enumerated(EnumType.STRING)
    private OrderState state;

    public String getOrderItemsSummary() {
        if (orderItems.isEmpty()) {
            return "No items ordered";
        }

        OrderMenu firstItem = orderItems.get(0);
        if (orderItems.size() == 1) {
            return firstItem.getMenu().getName();
        }

        return firstItem.getMenu().getName() + " 외 " + (orderItems.size() - 1) + "건";
    }


}
