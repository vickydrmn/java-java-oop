package modul4.ke2b;

public class  Vicky{
    private String look; //atribut

    private Character character;

    public Vicky(String look, Character character ){//kostruktor , look dan character adalah parameter
        this.look = look;
        this.character = character ;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public String getLook(){
        return look;
    }

    public Character getCharacter() {
        return character;
    }
}
//look dan character adalah parameter