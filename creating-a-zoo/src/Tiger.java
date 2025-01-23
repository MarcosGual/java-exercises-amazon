public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public Tiger() {
        super("Tiger");
    }

    public Tiger(int numberOfStripes, int speed, int soundLevelOfRoar) {
        super("Tiger");
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println(this.getNameOfAnimal() + ": I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println(this.getNameOfAnimal()+": I am walking at the speed + "+this.speed+" mph");
    }
}
