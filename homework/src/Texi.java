public class Texi extends Transport{

    // 출발지
    private String departure;
    // 출발지 거리
    private int departureDistance;
    // 출발지 당 최소 거리
    private int departureMindistance;
    // 택시 기본 설정 거리 == 1;
    private int basicDistance = 1;
    // 택시 기본 요금 ==3000원
    private int basicPrice = 3000;

    // 택시 속도 == 0;
    private int speed = 0;

    private int basicMaxprice = 10000;

    private int distancePerPrice = 1000;

    private int amountPrice;
    // 12.출력 택시 c 누적요금계산용;
    // 아니면 메인문에 인트배열을 만들어서 저장하자.
    private int totalPrice;

    private int total;

    // 가이드에 버스 클래스에 현재 승객이 있어서 여기서도 상속받지 않고 사용함.
    private int nowPassengers;

    // ====================================text getter setter 시작=======================================

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }   


    public String getDeparture() {

        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public int getDepartureDistance() {
        return departureDistance;
    }


    public int getDepartureMindistance() {
        return departureMindistance;
    }



    public void setDepartureDistance(int departureDistance) {
        this.departureDistance = departureDistance;
    }


    public int getBasicDistance() {
        return basicDistance;
    }

    public void setBasicDistance(int basicDistance) {
        this.basicDistance = basicDistance;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public int getBasicMaxprice() {
        return basicMaxprice;
    }



    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    public int getDistancePerPrice() {
        return distancePerPrice;
    }

    public void setDistancePerPrice(int distancePerPrice) {
        this.distancePerPrice = distancePerPrice;
    }

    public int getAmountPrice() {
        return amountPrice;
    }

    public void setAmountPrice(int amountPrice) {
        this.amountPrice = amountPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;

    }

    public int getNowPassengers() {
        return nowPassengers;
    }

    public void setNowPassengers(int nowPassengers) {
        this.nowPassengers = nowPassengers;
    }


    // ====================================text getter setter 종료=======================================

    // 요금 추가 == 총금액?????
    public int addpricePerdistance(int distance) {

        return this.amountPrice = basicPrice +(distancePerPrice * basicDistance * distance);

    }
    // 요금 지불 메서드
    public void payPrice() {

        System.out.println(amountPrice + "원을 지불했습니다.");

    }

    // 여기 메서드도 마찬가지이다.
    // 승객 추가 메서드 (오버라이딩)
    @Override
    public int addPassenger(int addPassenger){

        return this.nowPassengers += addPassenger;

    }
    // 잔여 승객 수 계산 메서드 (오버라이딩)
    @Override
    public int leftPassenger(int nowPassengers){

        return super.callMaxPassenger() -nowPassengers;

    }



}
