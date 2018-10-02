public abstract class Kaiju {

    private String name;
    private int attackValue;
    private int healthValue;

    public Kaiju(String name, int attackValue, int healthValue){
        this.name = name;
        this.attackValue = attackValue;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public String roar(){
        return "Roar I am a monster :D";
    }
}
