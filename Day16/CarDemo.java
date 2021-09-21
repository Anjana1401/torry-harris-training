public class CarDemo {
    public static void main(String[] args) {
        Tyre mrf=new Tyre("mrf",17);
        Tyre apollo=new Tyre("apollo",17);

        Car Nexon=new Car("nexon","petrol",1500,93.4f,6,mrf);
        Car Rollceroyce=new Car("Rollceroyce","Petrol",1800,93.4f,6,apollo);
        MusicSystem jbl=new MusicSystem(2,true,12);
        Nexon.setMusic(jbl);
        Nexon.accelerate();
        Nexon.changeGear(10);
        Nexon.steer();
        Nexon.applyBrake();
        Nexon.tyre();
        Nexon.features();
        Rollceroyce.setMusic(jbl);
        Rollceroyce.accelerate();
        Rollceroyce.changeGear(5);
        Rollceroyce.steer();
        Rollceroyce.applyBrake();
        Rollceroyce.tyre();
        Rollceroyce.features();

    }
}
