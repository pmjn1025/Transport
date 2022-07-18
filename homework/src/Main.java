import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        
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


        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Q1. 어떤 교통수단을 이용하시겠습니까? \n" +
                "1. 버스류장에서 버스를 기다린다\n" +
                "2. 택시승강장에서 택시를 탄다");

        Scanner scanner = new Scanner(System.in);


        while(true){
            int q1 = scanner.nextInt();

            if(q1 == 1){
                // 버스 로직으로 이어짐.
            }
            else if (q1 == 2){
                Texi texi = new Texi();
                Texi texi2 = new Texi();


                System.out.println("Q2. 카카오 택시가 잡혔습니다. 항해99 서울역 지점에 팀원을 한명을 데려다 줘야합니다. 어디로 가시겠습니까?\n" +
                        "1. 선택지 서울역 지점\n" +
                        "2. 선택지 용산역 지점");
                System.out.println(texi.getStatus());
                System.out.println("현재 연료량" + texi.getFuelStatus());


                while (true){
                    int q2 = scanner.nextInt();
                    if(q2==1){
                        System.out.println("탑승 승객 수" + texi.getNowPassengers());
                        System.out.println("잔여 승객 수" +(texi.getMaxPassengers()-texi.getNowPassengers()));
                        System.out.println(texi.getBasic_price());
                        System.out.println(texi.getDeparture());
                        System.out.println(texi.getDeparture_distance());
                        System.out.println(texi.getDistancePer_price());
                        System.out.println(texi.getStatus());
                        System.out.println(texi.getFuelStatus());
                    }
                    else if(q2==2){
                        System.out.println("가려고 하는 목적지가 아닙니다.");
                        //만약 택시 2로 진행한다면 여기서 택시2로 진행될 수도 있음.
                    }else{
                        System.out.println("너는 갇혀있다1");
//                        texi.test111();
                        break;
                    }
                    texi.test111(q1);

                    continue;
                }
                texi.test111(q1);
                System.out.println("너는 갇혀있다2");

            }else{
                System.out.println("숫자 1과 2중에 선택해 주세요.");

            }
        }









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































    }

}
