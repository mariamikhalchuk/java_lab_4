public class PuppetAnimation extends Animation {

    public PuppetAnimation(String artist, String style) {
        super.setArtist(artist);
        super.setStyle(style);
    }

    public String title() {
        return "Puppet Animation Title";
    }

    public void print() {
        System.out.println("Puppet Animation: Artist: " + super.getArtist() + " Style: " + super.getStyle());
    }
}
