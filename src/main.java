public class main {
    // This is the main class where the app is running.
    // First user have to initialize some variables given below such as performance name and etc.

    public static void main(String[] args){
        String performanceName, venue;
        int year, numOfBackupSingers, numOfBackupDancers, numberOfTracks;
        Singer mainArtist;
        MusicTrack[] TrackList;
        BackupSinger[] backupSingersList;
        BackupDancer[] backupDancersList;

        // given performance data are used below
        mainArtist = new Singer("Taylor Swift");
        performanceName = "Eras Tour";
        year = 2023;
        venue = "Glendale";

        // some random numbers are assigned below
        numberOfTracks = 3;
        numOfBackupSingers = 3;
        numOfBackupDancers = 5;

        // creating the track list. A loops is used to randomly add some new tracks
        TrackList = new MusicTrack[numberOfTracks];
        for (int i = 0; i < numberOfTracks; i++) {
            TrackList[i] = new MusicTrack("track-"+i,3);
        }

        // creating the backup singers list. A loops is used to randomly add some new singers
        backupSingersList = new BackupSinger[numOfBackupSingers];
        for (int i = 0; i < numOfBackupSingers; i++) {
            backupSingersList[i] = new BackupSinger("singer-"+i);
        }

        // creating the backup dancers list. A loops is used to randomly add some new dancers
        backupDancersList = new BackupDancer[numOfBackupDancers];
        for (int i = 0; i < numOfBackupDancers; i++) {
            backupDancersList[i] = new BackupDancer("dancer-"+i);
        }

        //initializing the performance
        Performance myPerformance = new LivePerformance(performanceName,year,venue,TrackList,mainArtist,backupDancersList,backupSingersList);
    }
}
