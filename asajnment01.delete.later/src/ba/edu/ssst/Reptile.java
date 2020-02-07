package ba.edu.ssst;

public class Reptile extends Animal {
    private Boolean dangerous;

    public Reptile(String name,String sound,Boolean dangerous) {
        super(name, sound);
        this.dangerous = dangerous;
    }

    public Boolean isDangerous() {
        return dangerous;
    }
}
