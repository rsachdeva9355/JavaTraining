package day1.classes.inheritance;

public class Photographer {

    public static void main(String[] args) {
        Camera camera = new Camera();
        System.out.println(camera.capture());

        camera = new DSLR();
        System.out.println(camera.capture(true));
    }
}
