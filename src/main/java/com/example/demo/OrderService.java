package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void checkAmount(String orderId, String amount) {
        // 해당 주문번호의 최종 결제 금액이 정말 amount와 일치하는지 확인하는 로직이 들어간다.
        boolean matched = true;
        // 만약 일치하지 않는다면, 예외를 발생시킵니다.
        if(!matched) throw new RuntimeException("결제 금액이 일치하지 않습니다.");

    }
    public void SetPaymentComplete(String orderId){

    }

    public void setPaymentComplete(String orderId) {
    }
    // 결제 완료 상태로 바꿔서 배송 준비를 시키는 로직을 주면 된다
}
