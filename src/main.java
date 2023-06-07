import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static Performance createPerformance(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of Main Artist: ");
        String mainArtistName = scanner.nextLine();
        Singer mainArtist = new Singer(mainArtistName);
        System.out.println("Name of performance: ");
        String performanceName = scanner.nextLine();
        System.out.println("Name of year: ");
        int year = scanner.nextInt();
        System.out.println("Name of venue: ");
        String venue = scanner.next();
        System.out.println("Enter track list");
        ArrayList<MusicTrack> TrackList = new ArrayList<>();
        String[] trackList = scanner.next().split(",");
        for (String t:trackList) {
            TrackList.add(new MusicTrack(t,2));
        }
        ArrayList<BackupDancer> backupDancersList = new ArrayList<>();
        ArrayList<BackupSinger> backupSingersList = new ArrayList<>();

        System.out.println("Live(l) or Studio(s)?");

        boolean isLive = true;
        if(scanner.next().toLowerCase().equals("s")){
            isLive = false;
        }

        if(isLive){
            return new LivePerformance(performanceName,year,venue,TrackList,mainArtist,backupDancersList,backupSingersList);
        }
        return new StudioPerformance(performanceName,year,venue,TrackList,mainArtist,backupDancersList,backupSingersList);
    }

    public static void viewPerformance(ArrayList<Performance> performances){
        String cm = """
                1 - search by main artist
                2 - search by venue
                3 - search by year
                4 - search by performance name
                5 - search by performance type
                """; // cm = command menu
        System.out.println(cm);
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        switch (command){
            case 1:
                System.out.println("Enter main artist name: ");
                String mainArtistName = scanner.next();
                for (Performance p: performances) {
                    if(p.getMainArtist().getName().equals(mainArtistName)){
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                System.out.println("Enter venue: ");
                String venue = scanner.nextLine();
                for (Performance p: performances) {
                    if(p.getVenue().equals(venue)){
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                System.out.println("Enter year: ");
                int year = scanner.nextInt();
                for (Performance p: performances) {
                    if(p.getYear() == year){
                        System.out.println(p);
                    }
                }
                break;
            case 4:
                System.out.println("Enter performance name: ");
                String performanceName = scanner.nextLine();
                for (Performance p: performances) {
                    if(p.getName().equals(performanceName)){
                        System.out.println(p);
                    }
                }
                break;
        }
    }

    public static void main(String[] args){
//        String performanceName, venue;
//        int year, numOfBackupSingers, numOfBackupDancers, numberOfTracks;
//        Singer mainArtist;
//        MusicTrack[] TrackList;
//        BackupSinger[] backupSingersList;
//        BackupDancer[] backupDancersList;
//
//        // given performance data are used below
//
//        mainArtist = new Singer("Taylor Swift");
//        performanceName = "Eras Tour";
//        year = 2023;
//        venue = "Glendale";
//
//        // some random numbers are assigned below
//        numberOfTracks = 3;
//        numOfBackupSingers = 3;
//        numOfBackupDancers = 5;
//
//        // creating the track list. A loop is used to randomly add some new tracks
//        TrackList = new MusicTrack[numberOfTracks];
//        for (int i = 0; i < numberOfTracks; i++) {
//            TrackList[i] = new MusicTrack("track-"+i,3);
//        }
//
//        // creating the backup singers list. A loop is used to randomly add some new singers
//        backupSingersList = new BackupSinger[numOfBackupSingers];
//        for (int i = 0; i < numOfBackupSingers; i++) {
//            backupSingersList[i] = new BackupSinger("singer-"+i);
//        }
//
//        // creating the backup dancers list. A loop is used to randomly add some new dancers
//        backupDancersList = new BackupDancer[numOfBackupDancers];
//        for (int i = 0; i < numOfBackupDancers; i++) {
//            backupDancersList[i] = new BackupDancer("dancer-"+i);
//        }
//
//        //initializing the performance
//        Performance myPerformance = new LivePerformance(performanceName,year,venue,TrackList,mainArtist,backupDancersList,backupSingersList);
        ArrayList<Performance> performances = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String commandsString = """
                 1 - create a new musical performance
                 2 - view performance
                 3 - edit performance
                -1 - exit.
                """;
        
        // uses a while loop to keep the program running
        boolean isRunning = true;
        while (isRunning){
            System.out.println(commandsString);
            // takes an input command
            int command = scanner.nextInt();

            // exit the program if command is -1
            if(command == -1){
                isRunning = false;
                System.out.println("Program exited.");
            }

            switch (command){
                // create new musical performance
                case 1:
                    Performance performance = createPerformance();
                    performances.add(performance);
                    System.out.println("Performance created. performance id: "+performances.size());
                    break;
                case 2:
                    viewPerformance(performances);
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }

        }
    }
}
