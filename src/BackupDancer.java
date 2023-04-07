public class BackupDancer extends Artist implements IBackup{
    // BackupDancer class is an extend of Artist. Dancers can dance and they backup the main artist by dancing
    public BackupDancer(String name) {
        super(name);
    }

    public void dance(){
        System.out.println("This is the method dance() in the class BackupDancer");
    }
    public void backup(){
        System.out.println("This is the method backup() in the class BackupDancer");
        dance();
    }
}
