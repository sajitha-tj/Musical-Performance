import java.util.ArrayList;

public class StudioPerformance extends Performance{
    // StudioPerformance is an extend of Performance where audio processing can be done and can record the performance
    
    public StudioPerformance(String name, int year, String venue, ArrayList<MusicTrack> trackList, Singer mainArtist, ArrayList<BackupDancer> backupDancers, ArrayList<BackupSinger> backupSingers) {
        super(name, year, venue, trackList, mainArtist, backupDancers, backupSingers);
    }

    public void audioProcessing(){
        System.out.println("This is the method audioProcessing() in the class StudioPerformance");
    }

    public void record(){
        System.out.println("This is the method record() in the class StudioPerformance");
    }
}
