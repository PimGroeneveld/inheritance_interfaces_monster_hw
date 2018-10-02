public abstract class Vehicle {

    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int shoot(int damage){
        return damage;
    }

    public int granade(){
        return 50;
    }
}
