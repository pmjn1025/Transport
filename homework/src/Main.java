public class Main {

    public static void main(String[] args) {

        Bus bus = new Bus();
        System.out.println(bus.busStatus);

        bus.statusChange("운행중");
        System.out.println(bus.busStatus);

        System.out.println(bus.fuelStatus+"입니다.");






    }

}
