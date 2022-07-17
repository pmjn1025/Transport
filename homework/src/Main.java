import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        //    - 기본값
        //    - 최대 승객 수 = 30
        //    - 상태 = 운행
        //    - 요금 = 1000

        // -->버스 객체 생성 및  기본값 테스트 완료

        Bus bus = new Bus();
        System.out.println(bus.getFuelStatus());
        bus.statusChange("운행중");
        System.out.println(bus.getStatus());
        System.out.println(bus.getFuelStatus()+"입니다.");
        bus.setMaxPassengers(30);
        bus.setNowPassengers(2);
        bus.setFee(1000);
        int examp = bus.countingBusFee(bus.getNowPassengers());
        System.out.println(examp+"원");
        int leftPassenger =  bus.leftPassenger(bus.getNowPassengers());
        System.out.println(leftPassenger);


        System.out.println("===========================================");

        // 택시 테스트
        //- 기본값
        //    - 최대 승객 수 = 4
        //    - 기본 요금 = 3000
        //    - 거리당 요금 = 1000
        //    - 기본 거리 = 1
        //    - 주유량 = 100
        //    - 상태 = 일반
        //    - 속도 = 0

        // -->택시 객체 생성 및 기본값 테스트 완료 및 택시시나리오에 있는 몇몇 출력값 확인 완료

        Texi texi = new Texi();
        ArrayList<Integer> arrayList = new ArrayList<>();


        texi.setMaxPassengers(4);
        System.out.println(texi.getMaxPassengers());
        System.out.println(texi.getBasic_price());
        System.out.println(texi.getDistancePer_price());
        System.out.println(texi.getBasic_distance());
        System.out.println(texi.getFuelStatus());
        System.out.println(texi.getVelocity());
        texi.statusChange("일반");
        System.out.println(texi.getStatus());

        texi.setNowPassengers(2);
        int nowTextPassen = texi.getNowPassengers();
        System.out.println(texi.leftPassenger(nowTextPassen));

        int per_price0 = texi.addpricePerdistance(2);
        System.out.println(per_price0+"원입니다.");
        arrayList.add(per_price0);

        int per_price1 = texi.addpricePerdistance(12);
        System.out.println(per_price1+"원입니다.");
        arrayList.add(per_price1);

        System.out.println(arrayList);
        int sum = 0;
        for(int arr : arrayList){

            sum+=arr;

        }

        System.out.println("누적금액은 "+sum+" 원입니다.");































    }

}
