abstract public class Ship {
    Passenger passanger;
    static int counter = 1000;
    double billAmount;
    String bookingId;

    public Ship(Passenger passanger) {
        this.passanger = passanger;
        // this.bookingId = bookingId;
        // this.billAmount = billAmount;
    }

    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        Ship.counter = counter;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public String getBookingId() {
        return bookingId;
    }
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    public Passenger getPassanger() {
        return passanger;
    }
    public void setPassanger(Passenger passanger) {
        this.passanger = passanger;
    }

    @Override
    public String toString() {
        return "Ship [billAmount=" + billAmount + ", bookingId=" + bookingId + ", passanger=" + passanger + "]";
    }

    public Integer identifyDiscountPercentage(double cost) {
        if(cost >= 50000 && cost <= 80000){
            return 10;
        }else if(cost >80000) {
            return 15;
        } else{
            return 0;
        }
    }

    public void generateBookingId(){
        bookingId = Package.class.getName().charAt(0) + "" + (++counter);
    }

    public abstract void calculateBill(String cuisine);
}
