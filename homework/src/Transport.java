public class Transport {

    private int trans_Num;
    private int fuelStatus = 100;
    private int velocity = 0;
    private int chagedVelocity;
    private int maxPassengers;
    private int Fee;

    // 상태
    private String status = "";

    // ===================Getter,Setter 시작;=================================

    public int getTrans_Num() {
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
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // ===================Getter,Setter 끝;=================================

    // 메서드 시작.
    // 운행시작 출력 메서드
    public void startTransport() {

        System.out.println("운행을 시작합니다.");

    }
    
    // 최대 가용인원 설정
    public int callMaxPassenger(){

        return maxPassengers;

    }

    // 속도 변경 메서드
    public int changeVelocity(int change) {

        this.chagedVelocity = change;

        return this.chagedVelocity;

    }

    // 상태변경 메서드(변화값)
    public String statusChange(String statusChange) {

        return this.status = statusChange;

    }
    // 승객수 설정 메서드(승객수)
    public int addPassenger(int addPassenger) {

        return this.addPassenger(addPassenger);

    }
    // 현재인원 계산해서 받아오는 메서드
    public int leftPassenger(int deltePassenger) {

        return this.leftPassenger(deltePassenger);

    }
    // 버스요금 계산해서 받아오는 메서드
    public int countingBusFee(int nowPassengers){

        return this.Fee = (nowPassengers*1000);

    }
    // 현재 연료량 : 현재 연료량 - 사용 연료량
    public int fuelChanged(int comsume){

        return this.fuelStatus -= comsume;
    }
    //추가된 현재 연료량 : 현재 연료량 + 추가된 현재 연료량
    public int AddFuelChange(int input){

        return this.fuelStatus += input;

    }





}
