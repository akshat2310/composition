public class pc {
    private Case thecase;
    private monitar Moniter;
    private motherboard Motherboard;

    public pc(Case thecase, monitar moniter, motherboard motherboard) {
        this.thecase = thecase;
        Moniter = moniter;
        Motherboard = motherboard;
    }

    public Case getThecase() {
        return thecase;
    }

    public monitar getMoniter() {
        return Moniter;
    }

    public motherboard getMotherboard() {
        return Motherboard;
    }
}

