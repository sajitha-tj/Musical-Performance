import java.util.ArrayList;

public class Performance {
    // Each performance has a name, year, venue, main artist, track list, backup dancers and backup singers
    // when the performance is initialized, a welcome msg is displayed and main artist starts singing. Backup singers and dancers will back him/her up

    private String name;
    private int year;
    private String venue;
    private ArrayList<MusicTrack> trackList;
    private Singer mainArtist;
    private ArrayList<BackupDancer> backupDancers;
    private ArrayList<BackupSinger> backupSingers;

    public Performance(String name, int year, String venue, ArrayList<MusicTrack> trackList, Singer mainArtist, ArrayList<BackupDancer> backupDancers, ArrayList<BackupSinger> backupSingers) {
        this.name = name;
        this.year = year;
        this.venue = venue;
        this.trackList = trackList;
        this.mainArtist = mainArtist;
        this.backupDancers = backupDancers;
        this.backupSingers = backupSingers;

        //performance is begining
        System.out.println("Welcome to the Performance "+this.name+" by "+this.mainArtist.getName()+"!");

        //main Artist performing
        System.out.println("Main Artist sings..!");
        mainArtist.sing();

        // backup dancers dancing
        System.out.println("Backup dancers dance..");
        for (BackupDancer dancer:backupDancers) {
            dancer.dance();
        }

        //backup singers singing
        System.out.println("Backup singers sing..");
        for (BackupSinger singer:backupSingers) {
            singer.sing();
        }
    }

    public String getName() {
        System.out.println("This is the method getName() in the class Performance");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("This is the method setName() in the class Performance");
    }

    public void addNewTrack(MusicTrack newTrack) {
        this.trackList.add(newTrack);
    }

    public int getYear() {
        System.out.println("This is the method getYear() in the class Performance");
        return year;

    }

    public String getVenue() {
        System.out.println("This is the method getVenue() in the class Performance");
        return venue;

    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public ArrayList<MusicTrack> getTrackList() {
        return trackList;
    }

    public void setTrackList(ArrayList<MusicTrack> trackList) {
        this.trackList = trackList;
    }

    public Singer getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(Singer mainArtist) {
        this.mainArtist = mainArtist;
    }

    public ArrayList<BackupDancer> getBackupDancers() {
        return backupDancers;
    }

    public void setBackupDancers(ArrayList<BackupDancer> backupDancers) {
        this.backupDancers = backupDancers;
    }

    public ArrayList<BackupSinger> getBackupSingers() {
        return backupSingers;
    }

    public void setBackupSingers(ArrayList<BackupSinger> backupSingers) {
        this.backupSingers = backupSingers;
    }

    @Override
    public String toString() {
        String str = "Performance: " +
                "mainArtist=" + mainArtist.getName() +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", venue='" + venue + '\'' +
                ", trackList=" + trackList.toString() +
                ", backupDancers=" + backupDancers +
                ", backupSingers=" + backupSingers;
        return str;
    }
}
