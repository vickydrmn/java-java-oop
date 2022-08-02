package modul4.ke3;

public class Tank extends Hero {

    @Override
    public void spawnIntro(){
        System.out.println("Kill me if u can !!");
    }
    public Tank(int level){
        this.setHealthPoint(7000+200*level);
        this.setDefense(500+15*level);
        this.setAttackDamage(500+20*level);
        this.setLevel(level);
    }
}