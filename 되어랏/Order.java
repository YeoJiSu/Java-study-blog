import java.util.ArrayList;
import java.util.List;
//구현하기
public class Order {
    private List<OrderItem> items = new ArrayList<>();


    private static int orderCounter = 1; // 총 주문 수?
    private int orderNo ;

    //개발 셋째날, 고객 주문한 주문 내용 저장
    //여기 밑에 함수 구현한게 맞는지 모르겠음 ....
    public void completed() {
        orderCounter=0;
    }
    public void setPickUp(PickUp pickUp) {
        // 여기도 어떻게 구현할지 막막....
        pickUp.handle(this);
    }
    public void addItem(OrderItem order) {
        orderCounter++;
        items.add(order);
    }
    public String toString(){
        return items.toString();
    }


    //개발 넷째날, 고객 음료 픽업
    private Order.PickUp delivery;

    public static interface PickUp {
        public abstract void handle(Order o);
    }

    //구현
    class Delivery implements Order.PickUp {
        @Override
        public void handle(Order o){
        }
    }

    class DriveThru implements Order.PickUp {
        @Override
        public void handle(Order o) {

        }
    }

    class TakeOut implements Order.PickUp {
        @Override
        public void handle(Order o) {

        }
    }

}
