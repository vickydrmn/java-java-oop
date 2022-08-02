package modul4.ke3;

public class Main {
    public static void main(String[] args) {
        Assassin a = new Assassin(5);
        Tank b = new Tank(1);
        Mage c = new Mage(1);

        System.out.println("===Player 1===");
        a.checkStatus();
        System.out.println("===Player 2===");
        b.checkStatus();
        System.out.println("----FIGHT BEGIN----");

        int i = 1;
        while (a.getLifeStatus() && b.getLifeStatus()) {
            System.out.println("---ROUND " + i + "---");
            System.out.println("===Player 1===");
            a.attack(b);
            System.out.println("===Player 2===");
            b.attack(a);
            i++;
            if (a.getHealthPoint() <= 0) {
                System.out.println("Assassin dead");
            }
            {
                if (a.getHealthPoint() > 0) {
                    System.out.println("Assassin win");
                }
                if (b.getHealthPoint() <= 0) {
                    System.out.println("Tank dead");
                }
                if (b.getHealthPoint() > 0) {
                    System.out.println("Tank win");
                }
                /*if (c.getHealthPoint() <= 0) {
                    System.out.println("Mage dead");
                }
                if (c.getHealthPoint() > 0) {
                    System.out.println("Mage win");
                }*/
            }
        }
    }
}
