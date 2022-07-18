import java.util.Random;
import java.util.Scanner;

public class Transport {
    private int trans_Num;
    private int fuelStatus = 100;
    private int velocity = 0;
    private int chagedVelocity;
    private int maxPassengers;
    private int Fee;
    private String status = "";

    Scanner scanner = new Scanner(System.in);


    boolean  check_Q;

    // Getter,Setter 시작;

    public boolean check_Q() {

        return check_Q;
    }
    public int getTrans_Num() {
        Random setNum = new Random();
        trans_Num = setNum.nextInt(9999);
        return trans_Num;
    }

    public void setTrans_Num(int trans_Num) {
        this.trans_Num = trans_Num;
    }

    public int getFuelStatus() {
        return fuelStatus;
    }

    public void setFuelStatus(int fuelStatus) {
        this.fuelStatus = fuelStatus;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getChagedVelocity() {
        return chagedVelocity;
    }

    public void setChagedVelocity(int chagedVelocity) {
        this.chagedVelocity = chagedVelocity;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getFee() {
        return Fee;
    }

    public void setFee(int fee) {
        Fee = fee;
    }

    public String getStatus() {
        status = "정상 운행(일반)";
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getter,Setter 끝;

    // 메서드 시작.

    public void startTransport() {

        System.out.println("운행을 시작합니다.");

    }

    public int callMaxPassenger(){

        return maxPassengers;

    }

    public int changeVelocity(int change) {

        this.chagedVelocity = change;

        return this.chagedVelocity;

    }

    public String statusChange(String statusChange) {

        return this.status = statusChange;

    }

    public int addPassenger(int addPassenger) {

        return this.addPassenger(addPassenger);

    }

    public int leftPassenger(int deltePassenger) {

        return this.leftPassenger(deltePassenger);

    }

    public int countingBusFee(int nowPassengers){

        return this.Fee *= nowPassengers;

    }
    public int fuelChanged(int comsume){

        return this.fuelStatus -= comsume;
    }

    public void test111(int aaa){
        System.out.println("test111 실행은 됨");

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


            }else{
                System.out.println("숫자 1과 2중에 선택해 주세요.");

            }
        System.out.println("test111 안에 로직까지 실행됨");
        }





}
