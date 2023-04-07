public class LivePerformance extends Performance{
    // LivePerformance is an extend of Performance where main artist can interact with audience and can record the performance
    public LivePerformance(String name, int year, String venue, MusicTrack[] trackList, Singer mainArtist, BackupDancer[] backupDancers, BackupSinger[] backupSingers) {
        super(name, year, venue, trackList, mainArtist, backupDancers, backupSingers);
    }

    public void artistInteraction(){
        System.out.println("This is the method artistInteraction() in the class LivePerformance");
    }

    public void record(){
        System.out.println("This is the method record() in the class LivePerformance");
    }
}
