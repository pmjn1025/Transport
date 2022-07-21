public class Bus extends Transport{

    // 버스 현재 승객수.
    private int nowPassengers;
    // 버스 얼럿시 사용할 문자 초기화.
    private String alertBus ="";

    //     ====================getter setter  start=================================
    public int getNowPassengers() {
        return nowPassengers;
    }

    public void setNowPassengers(int nowPassengers) {
        this.nowPassengers = nowPassengers;
    }

    public String getAlertBus() {
        return alertBus;
    }

    public void setAlertBus(String alertBus) {
        this.alertBus = alertBus;
    }


    //     ====================getter setter end =================================
    // 현재 승객 수 추가
    @Override
    public int addPassenger(int addPassenger) {

        return this.nowPassengers += addPassenger;

    }
    // 잔여 승객수 : 최대승객인원  - 현재 탑승한 승객수
    // 만약 0이하라면 최소값으로 0을 반환.
    @Override
    public int leftPassenger(int nowPassengers) {
        int pass_sum = super.callMaxPassenger() - nowPassengers;

        if(pass_sum <= 0 ){

            return 0;

        }else {

            return super.callMaxPassenger() - nowPassengers;
        }
    }
    // 버스 얼럿    
    // somePass가 메인에서 계산한 nowpassenger를 받고 
    // 조건문에 따라 해당 부분 출력
    public void busPassAlert(int somePass) {
        int max_pass = super.getMaxPassengers();

        if(somePass > max_pass){

            this.alertBus = "최대 승객 수 초과";

        }else {

            this.alertBus = "없음";

        }
    }
    // 메인에서 계산된 fuel를 매개변수로 받아서 출력
    // 얼럿을 띄우는 동시에 상태를 차고지행으로 --> 마지막 로직.
    public void busFuelAlert(int somefuel) {

        if(somefuel < 10){

            super.setStatus("차고지행");

            this.alertBus ="주유 필요";

        }

    }


}
