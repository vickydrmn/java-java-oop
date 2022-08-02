package modul4.ke3;

public class Assassin extends Hero implements CriticalDamage{
    @Override
    public void spawnIntro(){
        System.out.println("I Kill You");
    }
    public Assassin(int level){
        this.setHealthPoint(3000+(90*level));
        this.setDefense(300+(15*level));
        this.setAttackDamage(800+(800*bonusDamage)+(30*level));
        this.setLevel(level);
    }
}