public class Penguin extends Animal implements Walk,Swim{
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin(){
        super("Penguin");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingCompleted() {

    }

    @Override
    public void swimming() {

    }

    @Override
    public void walking() {

    }
}
