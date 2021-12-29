import java.util.HashMap;
import java.util.Map;

public class mapsmew {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("First Name","Muni");
        map.put("Middle Name", "Raghava");
        map.put("Last Name", "Pallamala");

        System.out.println("Full Name : " + map.get("First Name") + " " + map.get("Middle Name") + " " + map.get("Last Name"));

        map.forEach((a, b) -> System.out.println(a+ " : " +b));
    }
}
