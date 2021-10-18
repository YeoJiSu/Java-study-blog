
public class PickUpFactory {
    class Delivery implements Order.PickUp {
        private String address;

        public Delivery(String address) {
            this.address = address;
        }

        @Override
        public void handle(Order o) {
            StringBuilder builder = new StringBuilder();
            builder.append("--- 배달 관리 화면 ---");
            builder.append(System.getProperty("line.separator"));
            builder.append(System.getProperty("line.separator"));
            builder.append("배달통으로 주문을 전달합니다!");
            builder.append(System.getProperty("line.separator"));
            builder.append("배송주소: ").append(address);
            builder.append(System.getProperty("line.separator"));
            builder.append(System.getProperty("line.separator"));
            System.out.println(builder);

        }
    }

    class DriveThru implements Order.PickUp {
        private String vehicleNumber;

        public DriveThru(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
        }

        @Override
        public void handle(Order o) {
            StringBuilder builder = new StringBuilder();
            builder.append("--- 드라이브 쓰루 화면 ---");
            builder.append(System.getProperty("line.separator"));
            builder.append(System.getProperty("line.separator"));
            builder.append("차량번호: ").append(vehicleNumber);
            builder.append(System.getProperty("line.separator"));
            builder.append("주문하신 음료가 준비 되었습니다!");
            builder.append(System.getProperty("line.separator"));
            builder.append(System.getProperty("line.separator"));
            System.out.println(builder);
        }
    }

    class TakeOut implements Order.PickUp {

        @Override
        public void handle(Order o) {
            StringBuilder builder = new StringBuilder();
            builder.append("--- 테이크 아웃 화면 ---");
            builder.append(System.getProperty("line.separator"));
            builder.append(System.getProperty("line.separator"));
            builder.append("주문번호: ");
            builder.append(o.getCounter());
            builder.append(System.getProperty("line.separator"));
            builder.append("주문하신 음료가 준비 되었습니다!");
            builder.append(System.getProperty("line.separator"));
            builder.append(System.getProperty("line.separator"));
            System.out.println(builder);
        }
    }

    public Order.PickUp makeTakeOut() {
        return new TakeOut();
    }

    public Order.PickUp makeDriveThru(String vehicleNumber) {
        return new DriveThru(vehicleNumber);
    }

    public Order.PickUp makeDelivery(String address) {
        return new Delivery(address);
    }

}