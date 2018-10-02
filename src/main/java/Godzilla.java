import java.util.ArrayList;

public class Godzilla extends Kaiju implements IAttack, IMove{

    People people;
    private ArrayList<People> belly;

    public Godzilla(String name, int attackValue, int healthValue){
        super(name, attackValue, healthValue);
        this.belly = new ArrayList<>();
    }

    public int attack(){
        return getAttackValue() + 50;
    }

    public String move(){
        return "I will jump on you!";
    }

    public int bellySize(){
        return belly.size();
    }

    public void nomNomNom(People people){
        this.belly.add(people);
    }


}
