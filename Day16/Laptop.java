public class Laptop {
    private int ram;
    private int harddisk;
    private String processor;
    private double screensize;
    public void initialize (int r, int h, String p, double ss) {
        ram = r;
        harddisk = h;
        processor = p;
        screensize =ss;
    }
    public void display(){
        System.out.println("RAM is " +ram);
        System.out.println("HardDisk is " +harddisk);
        System.out.println("processor is " +processor);
        System.out.println("screensize is " +screensize);
    }

}
