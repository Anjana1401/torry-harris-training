public class Car {
    private String name;
    private String fuelType;
    private int engineCapacity;
    private float power;
    private int noOfGears;
    private Tyre tyre;
    private MusicSystem music;


    public Car(String name, String fuelType, int engineCapacity, float power,
               int noOfGears, Tyre tyre) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.noOfGears = noOfGears;
        this.tyre=tyre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }
    public void accelerate(){
        System.out.println(name+ " car is accelerating...");
    }
    public void applyBrake(){
        System.out.println(name+ " car is slowing/stopping");
    }
    public void changeGear(int gears){
        if(gears<0 || gears>noOfGears)
        System.out.println( " wrong gear selected ");
        else
            System.out.println(name+"car is changing gear to "+gears);
    }
    public void steer(){
        System.out.println(name+ " car is changing direction");
    }
    public void tyre(){
        System.out.println(tyre.getTyreName());
        System.out.println(tyre.getSize());
    }

    public MusicSystem getMusic() {
        return music;
    }

    public void setMusic(MusicSystem music) {
        this.music = music;
    }

    public void features(){
        System.out.println("feratures of " +name +"car");
        System.out.println("-----------------------------");
        System.out.println("Engine capacity: " +engineCapacity+ " cc");
        System.out.println("Fuel type: "+fuelType);
        System.out.println("power: "+power+" BHP");
        System.out.println("no of gear: "+noOfGears);
        System.out.println("name of the tyre: " +tyre.getTyreName() );
        System.out.println("tyre size: " +tyre.getSize());
        System.out.println("LCD Screen Size: " +music.getLcdScreenSize());
        System.out.println("Are sub woofers present: " +music.isSubWoofers());
        System.out.println("no. of speakers: " +music.getNoOfSpeakers());
    }
}
