package idiot;

public class lion extends monster {
    private String speka;
    //@Override 重写方法
    public void print() {
        System.out.println("狮子捕猎："+this.getArrest()+"狮子说话："+this.speka);
    }
    public lion(String arrest,String speka){
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
