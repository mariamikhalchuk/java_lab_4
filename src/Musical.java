public class Musical implements Movie, Object {

    private String instrument;
    private int songsCount;

    public Musical() {
        this.instrument = "Instrument 1";
        this.songsCount = 10;
    }

    public Musical(String instrument) {
        this.instrument = instrument;
        this.songsCount = 20;
    }

    public Musical(String instrument, int songsCount) {
        this.instrument = instrument;
        this.songsCount =  songsCount;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getSongsCount() {
        return songsCount;
    }

    public void setSongsCount(int songsCount) {
        this.songsCount = songsCount;
    }

    public String title() {
        return "Musical Movie Title";
    }

    public void print() {
        System.out.println("musicalMovie: Instrument: " + getInstrument() + " Song count: " + getSongsCount());
    }
}
