public class ComputersCore{
    Computer cmptr;

    public ComputersCore(Computer cmptr) {
        this.cmptr = cmptr;
    }

    public void ShowComputer(){
        System.out.println(cmptr);
    }

    public static void main(String[] args) {
        new ComputersCore(new Computer("DELL", "Inspiron", 75000, "8GB", true, "1TB", "Intel Core i5")).ShowComputer();
        new ComputersCore(new Computer("ASUS", "Vivobook", 50000, "8GB", true, "512GB", "Ryzen 5")).ShowComputer();
    }
}