public class PrintService {

    public void printHogwarts(Hogwarts student) {
            System.out.println("Имя: " + student.getName()
                    + ", сила магии: " + student.getPowerOfMagic()
                    + ", расстояние трансгрессии: " + student.getTransgressionDistance());
    }

    public void print(Gryffindor student) {
            System.out.println("Имя: " + student.getName()
                    + ", сила магии: " + student.getPowerOfMagic()
                    + ", расстояние трансгрессии: " + student.getTransgressionDistance()
                    + ", благородство: " + student.getNobility()
                    + ", честь: " + student.getHonor()
                    + ", храбрость: " + student.getBravery());
    }

    public void print(Hufflepuff student) {
            System.out.println("Имя: " + student.getName()
                    + ", сила магии: " + student.getPowerOfMagic()
                    + ", расстояние трансгрессии: " + student.getTransgressionDistance()
                    + ", трудолюбие: " + student.getIndustriousness()
                    + ", верность: " + student.getLoyalty()
                    + ", честность: " + student.getHonesty());
    }

    public void print(Ravenclaw student) {
            System.out.println("Имя: " + student.getName()
                    + ", сила магии: " + student.getPowerOfMagic()
                    + ", расстояние трансгрессии: " + student.getTransgressionDistance()
                    + ", ум: " + student.getMind()
                    + ", мудрость: " + student.getWisdom()
                    + ", остроумие: " + student.getWit()
                    + ", полон творчества: " + student.getFullCreativity());
    }

    public void print(Slytherin student) {
            System.out.println("Имя: " + student.getName()
                    + ", сила магии: " + student.getPowerOfMagic()
                    + ", расстояние трансгрессии: " + student.getTransgressionDistance()
                    + ", хитрость: " + student.getCunning()
                    + ", решительность: " + student.getDetermination()
                    + ", амбициозность: " + student.getAmbition()
                    + ", находчивость: " + student.getResourcefulness()
                    + ", жажда власти: " + student.getLustForPower());
    }
}
