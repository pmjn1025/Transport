public class Bus extends Transport {


    String busStatus = "";



    @Override
    public String statusChange(String statusChange){

        return this.busStatus = statusChange;

    }

}
