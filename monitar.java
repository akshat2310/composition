public class monitar {
    private String model;
    private String manufachrur;
    private int size;
    private Resolution nativeResolution;


    public monitar(String model, String manufachrur, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufachrur = manufachrur;
        this.size = size;
        this.nativeResolution = nativeResolution;

    }
    private void drawpixel(int x, int y, String colour){
        System.out.println("Draw pixel at" +x +y "is colour" +colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufachrur() {
        return manufachrur;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
