package co.edu.cesde;

public class Watchman extends persona {

    private  String Weapon;
    private  String Workday;

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public String getWorkday() {
        return Workday;
    }

    public void setWorkday(String workday) {
        Workday = workday;
    }
    public String Watchman(){

        return
                "My name is= " + this.getName() +"\n" +
                "My age is = " + this.getAge() +"\n" +
                "My Identification is = " + this.getIdentification() + "\n" +
                "My Weapon is= " + this.getWeapon() + "\n" +
                "My Workday is = " + this.getWorkday() ;
    }
}

