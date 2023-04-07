public class BackupSinger extends Singer implements IBackup{
    //BackupSinger class is an extend of Artist. Backup singers can sing and they backup the main artist by singing
    public BackupSinger(String name) {
        super(name);
    }

    public void backup(){
        System.out.println("This is the method backup() in the class BackupSinger");
        sing();
    }


}
