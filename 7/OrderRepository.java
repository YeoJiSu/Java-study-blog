
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class OrderRepository implements Iterable<Order> {
    private List<Order> orders = new ArrayList<>();

    private int index = 1;

    void add(Order order) {
        orders.add(order);
    }

    @Override
    public Iterator<Order> iterator() {
        return orders.iterator();
    }

    @Override
    public void forEach(Consumer<? super Order> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Order> spliterator() {
        return Iterable.super.spliterator();
    }

    public boolean hasNext() {
        return orders.size() > 0;
    }

    public Order next() {
        index++;
        return orders.remove(0);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("--- 주문 관리자 화면 ---");
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append("현재 주문수는 ").append(orders.size()).append(" 입니다.");
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append("< 주문 내역 >");
        builder.append(System.getProperty("line.separator"));
        for (int i = 0; i < orders.size(); i++) {
            builder.append("주문번호: ")
                    .append(i + index)
                    .append(" - ")
                    .append(orders.get(i).toString());
            builder.append(System.getProperty("line.separator"));
        }
        builder.append(System.getProperty("line.separator"));

        return builder.toString();
    }
}
