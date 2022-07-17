public class Bus extends Transport {

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
