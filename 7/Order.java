
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Order.PickUp delivery;

    public static interface PickUp {
        public abstract void handle(Order o);
    }

    private List<OrderItem> items = new ArrayList<>();

    private PickUp pickUp;

    private static int orderCounter = 1;

    private int orderNo;

    public void addItem(OrderItem orderItem) {

        items.add(orderItem);
    }

    public void setPickUp(PickUp pickUp) {
        this.pickUp = pickUp;
    }

    public void completed() {
        orderCounter = orderCounter + 1;
        pickUp.handle(this);
    }

    @Override
    public String toString() {
        // order item toString 이 호출되는 수가 주문 횟수라 판단 가능함.
        orderNo += 1;
        return items.toString();
    }

    public int getCounter() {
        return orderNo;
    }

}