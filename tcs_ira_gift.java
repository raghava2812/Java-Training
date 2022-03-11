import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class tcs_ira_gift {
    class Gift{
        private int giftId;
        private String giftName;
        private int price;
        private String brand;
        public int getGiftId() {
            return giftId;
        }
        public void setGiftId(int giftId) {
            this.giftId = giftId;
        }
        public String getGiftName() {
            return giftName;
        }
        public void setGiftName(String giftName) {
            this.giftName = giftName;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public Gift(int giftId, String giftName, int price, String brand) {
            this.giftId = giftId;
            this.giftName = giftName;
            this.price = price;
            this.brand = brand;
        }
    }
    public static void getlowestPricedGiftByBrand() {
        Scanner sc = new Scanner(System.in);
        // int id = s.nextInt();
        // Scanner s1 = new Scanner(System.in);
        // String name = s1.nextLine();
        // Scanner s2 = new Scanner(System.in);
        // int priz = s2.nextInt();
        // String brnd = s1.nextLine();
        // List<Gift> list = new ArrayList<Gift>();
        Gift[] ta=new Gift[3];
       for(int i=0;i<ta.length;i++)
         {
            int giftId=sc.nextInt();
            sc.nextLine();
            String giftName=sc.nextLine();
            String brand=sc.nextLine();
            int price=sc.nextInt();
            ta[i]=new Gift(giftId,giftName,price,brand);
          }
    }

    public static void getThirdHighestPricedGift() {
        
    }

    public static void main(String[] args) {
        getlowestPricedGiftByBrand();
    }
}
