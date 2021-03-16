package stateMachine;

/**
* 订单状态
*/
public enum OrderStatus {

    //待支付，代发货，待收货，订单结束
    WAIT_PAYMENT,
    WAIT_DELIVER,
    WAIT_RECEIVE,
    FINISH;
}
