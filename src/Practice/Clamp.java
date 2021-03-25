package Practice;

public abstract class Clamp extends Writer {

    Clamp() {
    }

    public void writerName() {
        System.out.print("作家名:");
        System.out.println("CLAMP");
    }


    public void working() {
        writerName();
        title();
        character();
        story();
    }

    public abstract void title();

    public abstract void character();

    public abstract void story();

}
