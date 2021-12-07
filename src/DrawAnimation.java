public class DrawAnimation extends Animation {

    public DrawAnimation(String artist, String style) {
        super.setArtist(artist);
        super.setStyle(style);
    }

    public String title() {
        return "Draw Animation Title";
    }

    public void print() {
        System.out.println("Puppet Animation: Artist: " + super.getArtist() + " Style: " + super.getStyle());
    }
}
