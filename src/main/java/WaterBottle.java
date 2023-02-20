public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean checkVolumeIs100() {
        if(this.volume == 100){
            return true;
        } else {
            return false;
        }
    }

    public int drinkWater() {
        return this.volume -= 10;
    }

    public int drinkAllWater() {
        return this.volume = 0;
    }

    public int fillUpTheBottleTo100() {
        return this.volume = 100;
    }
}
