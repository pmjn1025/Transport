public class Bus extends Transport {

    //요소
    private int nowPassengers;

    private int basic_distance = 1;

    private int basic_price = 3000;

    private int distancePer_price = 1000;

    private int amountPrice;
    // 12.출력 택시 c 누적요금계산용;

    // 아니면 메인문에 인트배열을 만들어서 저장하자.
    private int totalPrice;

    // 가이드에 버스 클래스에 현재 승객이 있어서 여기서도 상속받지 않고 사용함.
    private int nowPassengers;




   private int nowPassengers;

    public int getNowPassengers() {
        return nowPassengers;
    }

    public void setNowPassengers(int nowPassengers) {
        this.nowPassengers = nowPassengers;
    }

    @Override
    public int addPassenger(int addPassenger){

        return this.nowPassengers += addPassenger;

    }
    @Override
    public int leftPassenger(int nowPassengers){

       return super.callMaxPassenger() -nowPassengers;

    }









}
