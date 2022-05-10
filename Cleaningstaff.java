package co.edu.cesde;

public class Cleaningstaff extends  persona {

    private  String dayoff;

    public String getDayoff() {
        return dayoff;
    }

    public void setDayoff(String dayoff) {
        this.dayoff = dayoff;
    }
      public  String Cleaningstaff(){

        return
                " My name is = " + this.getName() +"\n" +
                " My age  is = " + this.getAge() +"\n" +
                " My  Identification  is= " + this.getIdentification() + "\n" +
                " My dayoff is = " + this.getDayoff();
      }


}
