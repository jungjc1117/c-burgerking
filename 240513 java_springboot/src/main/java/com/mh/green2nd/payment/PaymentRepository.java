//package com.mh.green2nd.payment;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.Optional;
//
//public interface PaymentRepository extends JpaRepository<Payment, Long> {
//    Optional<Payment> findByCart_CartId(Long cartId);
//}