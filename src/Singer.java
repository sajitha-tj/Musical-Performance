public class Singer extends Artist{
    // Singer class is an extend of Artist. Singers can sing.
    public Singer(String name) {
        super(name);
    }

    public void sing(){
        System.out.println("This is the method sing() in the class Singer");
    }
}
