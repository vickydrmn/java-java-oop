package modul4.ke2b;

public class Main {
    public static void main(String[] args){
        Character a = new Character("coklat", "19", "167");
        Vicky b = new Vicky("handsome",a );
        System.out.println("look : "+b.getLook());
        System.out.println("color : "+b.getCharacter().getColor());
        System.out.println("age : "+b.getCharacter().getAge());
        System.out.println("height : "+b.getCharacter().getHeight());
    }
}
