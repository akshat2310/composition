public class motherboard {

    private String model;
    private String manufachrur;
    private int ramslots;
    private int cardslots;
    private String bios;

    public motherboard(String model, String manufachrur, int ramslots, int cardslots, String bios) {
        this.model = model;
        this.manufachrur = manufachrur;
        this.ramslots = ramslots;
        this.cardslots = cardslots;
        this.bios = bios;
    }

    public void loadprogram(String programname){
        System.out.println("program" +programname "is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufachrur() {
        return manufachrur;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardslots() {
        return cardslots;
    }

    public String getBios() {
        return bios;
    }
}
