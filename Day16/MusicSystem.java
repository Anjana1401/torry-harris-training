public class MusicSystem {
    private int noOfSpeakers;
    private boolean subWoofers;
    private int lcdScreenSize;

    public MusicSystem(int noOfSpeakers, boolean subWoofers, int lcdScreenSize) {
        this.noOfSpeakers = noOfSpeakers;
        this.subWoofers = subWoofers;
        this.lcdScreenSize = lcdScreenSize;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public boolean isSubWoofers() {
        return subWoofers;
    }

    public void setSubWoofers(boolean subWoofers) {
        this.subWoofers = subWoofers;
    }

    public int getLcdScreenSize() {
        return lcdScreenSize;
    }

    public void setLcdScreenSize(int lcdScreenSize) {
        this.lcdScreenSize = lcdScreenSize;
    }
}
