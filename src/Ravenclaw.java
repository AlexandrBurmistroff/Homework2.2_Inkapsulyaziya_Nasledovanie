public class Ravenclaw extends Hogwarts{
    private int mind;            //ум
    private int wisdom;          //мудрость
    private int wit;             //остроумие
    private int fullCreativity;  //полон творчества

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int fullCreativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullCreativity = fullCreativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getFullCreativity() {
        return fullCreativity;
    }

    public void setFullCreativity(int fullCreativity) {
        this.fullCreativity = fullCreativity;
    }
}
