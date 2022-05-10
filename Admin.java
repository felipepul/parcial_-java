package co.edu.cesde;

public class Admin extends  persona {

    private  String Leader;
    private  String Parking;

    public String getLeader() {
        return Leader;
    }

    public void setLeader(String leader) {
        Leader = leader;
    }

    public String getParking() {
        return Parking;
    }

    public void setParking(String parking) {
        Parking = parking;
    }


    public String Admin(){

        return
                "My name is = " + this.getName() +"\n" +
                "My age  is = " + this.getAge() +"\n" +
                "My Identification is = " + this.getIdentification() + "\n" +
                "My leader is = " + this.getLeader() +"\n" +
                "My parking is = " + this.getParking();
    }



}
