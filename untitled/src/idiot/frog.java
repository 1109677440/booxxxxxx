package idiot;

public class frog extends monster {
    private String speka;
    //@Override 重写方法
    public void print() {
        System.out.println("青蛙捕猎："+this.getArrest()+"青蛙说话："+this.speka);
    }
    public frog(String arrest,String speka){
        super(arrest);
        this.speka=speka;
    }

    public String getSpeka() {
        return speka;
    }

    public void setSpeka(String speka) {
        this.speka = speka;
    }
}
