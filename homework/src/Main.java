import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("===========================================");


        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Q1. 어떤 교통수단을 이용하시겠습니까? \n" +
                "1. 버스 정류장에서 버스를 기다린다\n" +
                "2. 택시승강장에서 택시를 탄다");

        Scanner scanner = new Scanner(System.in);

        while(true){
            int q1 = scanner.nextInt();

            if(q1 == 1) {
                // 버스 로직으로 이어짐.
                Bus bus = new Bus();
                System.out.println("Q4. 버스가 항해 2달차 정류장 에 정차하였습니다. 번화가라서 많은 사람이 몰려듭니다.\n" +
                        "내리시겠습니까?\n" +
                        "1. 내린다\n" +
                        "2. 내리지 않는다");
                System.out.println("----------\n");
                System.out.println(bus.getStatus());
                System.out.println("탑승 승객수" + (bus.addPassenger(47)));
                System.out.println("잔여 숭객수" + bus.leftPassenger(0));
                System.out.println("연료량" + bus.getFuelStatus());
                System.out.println("최대 승객 수 초과!!!");

//**************************************************************************
//**************************************************************************
//*********************************Q7***************************************
                while (true) {
                    int q4 = scanner.nextInt();
                    if (q4 == 1) {
                        System.out.println("아직 내리실 때가 아닙니다!조금만 더 파이팅!");

                    } else if (q4 == 2) {
                        System.out.println("다음 정류장으로 이동합니다.");
                        System.out.println("탑승 승객 수" + bus.getNowPassengers());
                        System.out.println("잔여 승객 수" + (bus.leftPassenger(25)));
                        bus.setFee(5000);
                        System.out.println("요금" + (bus.getFee()));
                        System.out.println("=========================================================");

                        System.out.println("Q5. 버스가 항해 3달차 정류장 에 정차하였습니다. 번화가라서 많은 사람이 내립니다.\n" +
                                "내리시겠습니까?\n" +
                                "1. 내린다\n" +
                                "2. 내리지 않는다");
                        System.out.println("----------\n");
                        System.out.println(bus.getStatus());
                        System.out.println("탑승 승객수" + bus.getNowPassengers());
                        System.out.println("잔여 숭객수" + bus.leftPassenger(28));
                        bus.setFuelStatus(60);
                        System.out.println(bus.getAlert_bus());
                        System.out.println("연료량" + bus.getFuelStatus());
                        System.out.println("요금" + bus.getFee());



                        while (true){
                            int q5 = scanner.nextInt();
                            if(q5==1){
                                System.out.println("조금만 더 가면 목적지에요!");

                            }
                            else if(q5==2){
                                System.out.println("----------\n");
                                System.out.println("다음 정류장으로 이동합니다.");
                                System.out.println("탑승 승객 수" + bus.getNowPassengers());
                                System.out.println("잔여 승객 수" +(bus.leftPassenger(28)));
                                System.out.println("요금"+(bus.getFee()));
                                System.out.println("연료량" + bus.getFuelStatus());
                                System.out.println("=========================================================");


//*********************************Q8***************************************
//*********************************Q8***************************************

                                System.out.println("Q8. 항해99버스가 드디어 목적지에 도착하였습니다.\n" +
                                        "이 버스는 당신의 열정을 연료로 굴러갔습니다!" +
                                        "앞으로도 당신의 앞날에 무한한 영광이 함께하길!\n");
                                System.out.println("----------\n");
                                System.out.println("Congratulation!");
                                bus.statusChange("차고지 행");
                                System.out.println(bus.getStatus());
                                System.out.println("잔여 승객 수" + (bus.leftPassenger(0)));
                                System.out.println("연료량" + bus.getFuelStatus());
                                bus.busFuelAlert(5);
                                System.out.println(bus.getAlert_bus());


                            }else{
                                break;
                            }
                            continue;
                        }
                    } else {
                        break;
                    }
                    continue;
                }
            } //이거랑
        }  //이거 이제 테스트
//**************************************************************************
    }

}
