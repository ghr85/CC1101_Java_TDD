public class WaterBottle {
    private int level;

    public WaterBottle(){
        this.level = 100;
    }
    public int getLevel(){
        return this.level;
    }
    public void drink(){
        this.level -= 10;
    }

    public void empty(){
        this.level = 0;
    }
    public void fill(){
        this.level = 100;
    }
}
