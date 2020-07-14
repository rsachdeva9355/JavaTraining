package day1.classes.inheritance;

public class DSLR extends Camera {

    public String capture() {
        return super.capture() + " by DSLR";
    }
}
