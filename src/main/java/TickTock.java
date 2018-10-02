public class TickTock extends Kaiju implements IAttack, IMove{

    public TickTock(String name, int attackValue, int healthValue){
        super(name, attackValue, healthValue);
    }

    public int attack(){
        return getAttackValue();
    }

    public String move(){
        return "I will slap my tail!";
    }

}
