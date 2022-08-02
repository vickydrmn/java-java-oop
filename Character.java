package modul4.ke2b;

public class Character {
    private String color;//atribut
    private String age;
    private String height;

    public Character(String color, String age, String height) {
        this.color = color;
        this.age = age;
        this.height = height;
    }

    public String getColor(){
        return color;
    }
    public String getAge(){
        return age;
    }
    public String getHeight(){
        return height;
    }
}
