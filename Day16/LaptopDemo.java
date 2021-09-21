public class LaptopDemo {
    public static void main(String[] args) {
        Laptop hp=new Laptop();
        Laptop del=new Laptop();
        hp.initialize(8,500,"Intell",15.7);
        del.initialize(8,600,"AMD",17.2);
        hp.display();
        del.display();
    }
}
