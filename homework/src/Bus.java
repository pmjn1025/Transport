public class Bus extends Transport {

<<<<<<< HEAD
    //요소 르탄이가 타기 전의 버스 승객이 있어야 할 것 같아서 추가
    private int setPassengers;

    //요소 르탄이가 탑승한 이후 추가인원이 탑승할 경우 몇명 탑승했는지를 담는 변수 추가
    private int addPassengers;

    private int nowPassengers;


    //기능 - 버스는 승객이 탑승하면 택시처럼 뭐 거라 당 요금할증 이런 게 없어서 일단 비워놈

    public int getSetPassengers() {
        setPassengers = 0;
        return setPassengers;
    }

    public int getAddPassengers() {
        return addPassengers;
    }

    public int getNowPassengers() {
        nowPassengers = setPassengers + addPassengers;
        return nowPassengers;
    }

=======
   private int nowPassengers;

    public int getNowPassengers() {
        return nowPassengers;
    }

>>>>>>> 30528a0973b4a37dd97bde808bd89355966437cc
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
