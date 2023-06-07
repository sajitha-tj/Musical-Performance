public class MusicTrack {
    // Track is stored in this class
    // Each MusicTrack has a name and a duration

    private String name;
    private int duration;

    public MusicTrack(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        String str = "song= " + name + ' ';
        return str;
    }
}
