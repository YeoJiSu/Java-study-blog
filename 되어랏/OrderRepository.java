import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//구현하기
public class OrderRepository implements Iterator<Order> {
    List<Order> orders = new ArrayList<>();
    private int index=0;

    public void add(Order makeOrderForSome) {
        orders.add(makeOrderForSome);
    }

    @Override
    public boolean hasNext() {
        if (index < orders.size()){
            return true;
        }
        else return false;
    }

    @Override
    public Order next() {
        Order order = orders.get(index);
        index++;
        return order;
    }


    public String toString(){
        //어거지로 한느낌이 있긴한데... 사실 잘 몰겠음
        String out=String.format("--- 주문 관리자 화면 ---\n현재 주문수는 총 %d 입니다.\n",orders.size()-index);
        out+="\n< 주문 내역 >\n";

        for (int i = index; i<3;i++ ) {
            out += String.format("주문번호: %d - %s\n", i+1, orders.get(i));
        }

        return out;

    }
}
