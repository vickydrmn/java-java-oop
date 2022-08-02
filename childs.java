package modul3.k2.child;

import modul3.k2.perents.parentss;

public class childs extends parentss {
    public String name = " darmawan";

    public childs(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("saya adalah "+ super.name);
    }
}