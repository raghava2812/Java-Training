public class Computer {
    String BrandName;
    String ModelName;
    int Price;
    String RAM;
    boolean SSD;
    String Capacity;
    String Processor;

    public Computer(String BrandName, String ModelName, int Price, String RAM, boolean SSD, String Capacity, String Processor) {
        this.BrandName = BrandName;
        this.ModelName = ModelName;
        this.Price = Price;
        this.RAM = RAM;
        this.SSD = SSD;
        this.Capacity = Capacity;
        this.Processor = Processor;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public boolean isSSD() {
        return SSD;
    }

    public void setSSD(boolean SSD) {
        this.SSD = SSD;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String Capacity) {
        this.Capacity = Capacity;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    @Override
    public String toString() {
        return "Computer [BrandName=" + BrandName + ", Capacity=" + Capacity + ", ModelName=" + ModelName + ", Price="
                + Price + ", Processor=" + Processor + ", RAM=" + RAM + ", SSD=" + SSD + "]";
    }

}
