public class Dolphin extends Animal implements Swim {
    private String colorOfDolphin;
    private int swimmingSpeed;

    public Dolphin(){
        super("Dolphin");
    }

    public Dolphin(int swimmingSpeed, String colorOfDolphin) {
        super("Dolphin");
        this.swimmingSpeed = swimmingSpeed;
        this.colorOfDolphin = colorOfDolphin;
    }

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood(){
        System.out.println(this.getNameOfAnimal() + ": I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void swimming() {
        System.out.println(this.getNameOfAnimal()+": I am swimming at the speed of "+this.swimmingSpeed+" nautical miles per hour");
    }
}
