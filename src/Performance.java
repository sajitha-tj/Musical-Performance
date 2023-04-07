public class Performance {
    // Each performance has a name, year, venue, main artist, track list, backup dancers and backup singers
    // when the performance is initialized, a welcome msg is displayed and main artist starts singing. Backup singers and dancers will back him/her up

    private String name;
    private int year;
    private String venue;
    private MusicTrack[] trackList;
    private Singer mainArtist;
    private BackupDancer[] backupDancers;
    private BackupSinger[] backupSingers;

    public Performance(String name, int year, String venue, MusicTrack[] trackList, Singer mainArtist, BackupDancer[] backupDancers, BackupSinger[] backupSingers) {
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
        int n = this.trackList.length+1;
        MusicTrack[] newList = new MusicTrack[n];
        for(int i = 0; i < n-1; i++){
            newList[i] = this.trackList[i];
        }
        newList[n] = newTrack;
        this.trackList = newList;

        System.out.println("This is the method addNewTrack() in the class Performance");
    }

    public int getYear() {
        System.out.println("This is the method getYear() in the class Performance");
        return year;

    }

    public String getVenue() {
        System.out.println("This is the method getVenue() in the class Performance");
        return venue;

    }
}
