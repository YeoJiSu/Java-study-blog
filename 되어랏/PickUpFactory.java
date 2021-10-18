public class PickUpFactory {
    class Delivery implements Order.PickUp {
        private String address;

        public Delivery(String address) {
            this.address = address;
        }

        @Override
        public void handle(Order o) {
            System.out.println("--- 배달 괸리 화면 --- ");
            System.out.println("배달통으로 주문을 전달합니다!");
            System.out.printf("배송주소 : %s", this.address);
            System.out.println("\n");
        }
    }

    // handle 함수를 어떻게 작성해야할지 모르겠어
    class DriveThru implements Order.PickUp {
        private String vehicleNumber;

        public DriveThru(String vehicleNumber) {

            this.vehicleNumber = vehicleNumber;
        }

        @Override
        public void handle(Order o) {
            System.out.println("--- 드라이브 쓰루 화면 --- \n");
            System.out.printf("차량번호 : %s", this.vehicleNumber);
            System.out.println("\n주문하신 음료가 준비 되었습니다!\n");
        }
    }

    class TakeOut implements Order.PickUp {
        @Override
        public void handle(Order o) {
            System.out.println("--- 테이크 아웃 화면 --- \n");
            System.out.printf("주문번호: 3");
            System.out.println("\n주문하신 음료가 준비 되었습니다!\n");
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
