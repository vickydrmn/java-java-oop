package modul4.ke3;

public abstract class Hero {
    private double healthPoint;
    private double attackDamage;
    private double defense;
    private int level;
    private boolean lifeStatus = true;

     public void setHealthPoint(double healthPoint){
        this.healthPoint = healthPoint;
    }

    public void setAttackDamage(double attackDamage){
        this.attackDamage = attackDamage;
    }

    public void setDefense(double defense){
        this.defense = defense;
    }

    public void setLevel(int level){
         this.level = level;
    }

    public double getHealthPoint(){
        return healthPoint;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public double getDefense() {
        return defense;
    }
    public boolean getLifeStatus(){
         return lifeStatus;
    }

    public void attack(Hero target){
         this.spawnIntro();
         target.reviewDamage(attackDamage);
        System.out.println("HP hero: " + this.getHealthPoint());
    }

    public void reviewDamage(double attackDamage){
         double realDamage = attackDamage - defense;
         healthPoint -= realDamage;
         if (healthPoint <= 0){
             lifeStatus = false;
         }
    }

    public void checkStatus(){
        System.out.println("Level : "+this.level);
        System.out.println("Attack damage \t: "+this.attackDamage+"\tLife Status \t: "+this.lifeStatus);
        System.out.println("Health poin \t: "+this.healthPoint+"\tDefense \t: "+this.defense);
    }
    abstract public void spawnIntro();

}