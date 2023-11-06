public class Mute implements ISound {
    public Mute() {
    }


    @Override
    public void makeSound() {
        System.out.print( "<< mute >>" );
    }

    @Override
    public String toString() {
        return "Mute{}";
    }
}
