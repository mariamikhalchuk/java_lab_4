public class Historical implements Movie, Object {

    private String period;
    private int correspondToLevel;

    public Historical() {
        this.period = "Period 1";
        this.correspondToLevel = 1;
    }

    public Historical(String period) {
        this.period = period;
        this.correspondToLevel = 2;
    }

    public Historical(String period, int correspondToLevel) {
        this.period = period;
        this.correspondToLevel = correspondToLevel;
    }



    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getCorrespondToLevel() {
        return correspondToLevel;
    }

    public void setCorrespondToLevel(int correspondToLevel) {
        this.correspondToLevel = correspondToLevel;
    }

    public String title() {
        return "Historical Movie Title";
    }

    public void print() {
        System.out.println("historicalMovie: Period: " + getPeriod() + " Level: " + getCorrespondToLevel());
    }
}
