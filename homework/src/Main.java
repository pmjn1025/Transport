import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


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

//        Texi texi = new Texi();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//
//        texi.setMaxPassengers(4);
//        System.out.println(texi.getMaxPassengers());
//        System.out.println(texi.getBasic_price());
//        System.out.println(texi.getDistancePer_price());
//        System.out.println(texi.getBasic_distance());
//        System.out.println(texi.getFuelStatus());
//        System.out.println(texi.getVelocity());
//        texi.statusChange("일반");
//        System.out.println(texi.getStatus());
//
//        texi.setNowPassengers(2);
//        int nowTextPassen = texi.getNowPassengers();
//        System.out.println(texi.leftPassenger(nowTextPassen));
//
//        int per_price0 = texi.addpricePerdistance(2);
//        System.out.println(per_price0+"원입니다.");
//        arrayList.add(per_price0);
//
//        int per_price1 = texi.addpricePerdistance(12);
//        System.out.println(per_price1+"원입니다.");
//        arrayList.add(per_price1);
//
//        System.out.println(arrayList);
//        int sum = 0;
//        for(int arr : arrayList){
//
//            sum+=arr;
//
//        }
//
//        System.out.println("누적금액은 "+sum+" 원입니다.");


        System.out.println("===========================================");

        //    - 기본값
        //    - 최대 승객 수 = 30
        //    - 상태 = 운행
        //    - 요금 = 1000

        // -->버스 객체 생성 및  기본값 테스트 완료

//        Bus bus = new Bus();
//        System.out.println(bus.getFuelStatus());
//        bus.statusChange("운행중");
//        System.out.println(bus.getStatus());
//        System.out.println(bus.getFuelStatus()+"입니다.");
//        bus.setMaxPassengers(30);
//        bus.setNowPassengers(2);
//        bus.setFee(1000);
//        int examp = bus.countingBusFee(bus.getNowPassengers());
//        System.out.println(examp+"원");
//        int leftPassenger =  bus.leftPassenger(bus.getNowPassengers());
//        System.out.println(leftPassenger);

        // 스캐너 입력받는 함수.
        Scanner scanner = new Scanner(System.in);


        System.out.println("르탄이가 항해 99에 출근하고 있습니다. 어떤 교통수단을 이용하시겠습니까? \n" +
                "1. 버스 정류장에서 버스를 기다린다. \n" +
                "2. 택시 승강장에서 택시를 기다린다.");


        while (true) {

            int q1 = scanner.nextInt();

            if (q1 == 1) {
                // 버스 1 객체 생성
                Bus bus = new Bus();
                // 버스 1 번호를 99번으로 설정함
                bus.setTrans_Num(99);
                // 버스 1 번호를 99번으로 설정한 것을 가져옴
                int bus_num = bus.getTrans_Num();
                // 버스 2 객체 생성
                Bus bus1 = new Bus();
                // 버스 1 번호를 100번으로 설정함
                bus1.setTrans_Num(100);
                int bus_num1 = bus1.getTrans_Num();

                System.out.println("버스가 다가 오고 있습니다. 앞에는 항해99로 가는 (" + bus_num + ")번 버스이고 \n" +
                        "뒤에는 항훼99로 가는 (" + bus_num1 + ")번 버스입니다 \n" +
                        "어떤 버스를 타시겠습니까?\n" +
                        "1. 항해 99로 가는 버스 \n" +
                        "2. 항훼 99로 가는 버스");

                while (true) {
                    int q2 = scanner.nextInt();

                    if (q2 == 1) {



                    }else if(q2 == 2){

                        System.out.println("항훼로가는 버스였습니다. 르탄이는 결국 행방불명되었습니다.");
                        // 자바 메서드 완전종료하는 메서드
                        System.exit(0);

                    }else{

                        System.out.println("1,2번 중에 선택해주세요");

                    }

                }




            } else if (q1 == 2) {


            } else {

                System.out.println("1,2번중에 선택해주세요");


            }

        }


    }

}
