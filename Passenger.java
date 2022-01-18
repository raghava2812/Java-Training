public class Passenger {
    String PassengerName;
    int age;
    String PackageType;
    int NoofPassengers;

    public String getPassengerName() {
        return PassengerName;
    }
    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPackageType() {
        return PackageType;
    }
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }
    public int getNoofPassengers() {
        return NoofPassengers;
    }
    public void setNoofPassengers(int NoofPassengers) {
        this.NoofPassengers = NoofPassengers;
    }

    public Boolean validatePassengerDetails(){
        return null;
    }
    public Passenger(String PassengerName, int age, String PackageType, int NoofPassengers) {
        this.PassengerName = PassengerName;
        this.age = age;
        this.PackageType = PackageType;
        this.NoofPassengers = NoofPassengers;
    }
    @Override
    public String toString() {
        return "Passenger [NoofPassengers=" + NoofPassengers + ", PackageType=" + PackageType + ", PassengerName="
                + PassengerName + ", age=" + age + "]";
    }

}
