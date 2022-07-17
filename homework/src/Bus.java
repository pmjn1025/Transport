public class Bus extends Transport {


    String busStatus = "";

    int nowPassengers;

    int busFee=1000;


    @Override
    public String statusChange(String statusChange){

        return this.busStatus = statusChange;

    }

    @Override
    public int addPassenger(int addPassenger){

        return this.nowPassengers += addPassenger;

    }
    @Override
    public int deletePassenger(int deltePassenger){

       return this.nowPassengers -= deltePassenger;

    }

    public int countingBusFee(){

        return super.Fee *= nowPassengers;

    }







}
