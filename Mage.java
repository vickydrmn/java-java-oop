package modul4.ke3;

public class Mage extends Hero implements MagicDamage{
    @Override
    public void spawnIntro(){
        System.out.println("Magic is Strongest");
    }
    public Mage(int level){
        this.setHealthPoint(2500+(85*level));
        this.setDefense(200+(10*level));
        this.setAttackDamage(700+(700*magicDamage)+(35*level));
        this.setLevel(level);
    }
}