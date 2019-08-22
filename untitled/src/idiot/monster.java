package idiot;

public abstract class monster {
    private String arrest;

    public String getArrest() {
        return arrest;
    }

    public void setArrest(String arrest) {
        this.arrest = arrest;
    }

    public abstract void print();

    public monster(String arrest) {
        this.arrest = arrest;
    }
}
