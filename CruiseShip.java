public class CruiseShip extends Ship {
    static String[] availablePackageArr = {"Srilanka", "Chennai", "Goa"};
    static int[] priceArr = {65000, 25000, 30000};
    boolean adventureActivity;

    public CruiseShip(Passenger passenger, boolean adventureActivity){
        super(passanger);
        this.adventureActivity = adventureActivity;
    }

    @Override
    public void calculateBill(){
        boolean value = super.getPassanger().validatePassengerDetails();

        if(value == false) {
            this.setBookingId("NA");
            this.setBillAmount(-1.0);
        } else {
            for (int i = 0; i< availablePackageArr.length; i++) {
                if(availablePackageArr[i] == super.getPassanger().getPackageType()){
                }
            }
        }
    }

    @Override
    public void calculateBill(String cuisine) {
    }
}