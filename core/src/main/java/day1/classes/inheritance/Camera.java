package day1.classes.inheritance;

public class Camera {

    protected String make;
    protected String model;
    protected String lensType;
    protected boolean flashOn;

    public String capture() {
        return "Click";
    }

    public String capture(boolean withFlash) {
        flashOn = true;
        System.out.println("Flash Switched On");
        return capture();
    }
}
