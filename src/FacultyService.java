public class FacultyService {

    public void compareStudentsHogwarts(Hogwarts student1, Hogwarts student2) {
        int comparison1 = student1.getPowerOfMagic() + student1.getTransgressionDistance();
        int comparison2 = student2.getPowerOfMagic() + student2.getTransgressionDistance();

        if (comparison1 > comparison2) {
            System.out.println(student1.getName() + " лучший студент Hogwarts, чем студент " + student2.getName());
        } else if (comparison1 == comparison2) {
            System.out.println(student1.getName() + " равен студенту Hogwarts " + student2.getName());
        } else
            System.out.println(student2.getName() + " лучший студент Hogwarts, чем студент " + student2.getName());
    }

    public void compareStudents(Gryffindor student1, Gryffindor student2) {
        int comparison1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int comparison2 = student2.getNobility() + student2.getHonor() + student2.getBravery();

        if (comparison1 > comparison2) {
            System.out.println(student1.getName() + " лучший студент Gryffindor, чем студент " + student2.getName());
        } else if (comparison1 == comparison2) {
            System.out.println(student1.getName() + " равен студенту Gryffindor " + student2.getName());
        } else
            System.out.println(student2.getName() + " лучший студент Gryffindor, чем студент " + student1.getName());
    }

    public void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int comparison1 = student1.getIndustriousness() + student1.getLoyalty() + student1.getHonesty();
        int comparison2 = student2.getIndustriousness() + student2.getLoyalty() + student2.getHonesty();

        if (comparison1 > comparison2) {
            System.out.println(student1.getName() + " лучший студент Hufflepuff, чем студент " + student2.getName());
        } else if (comparison1 == comparison2) {
            System.out.println(student1.getName() + " равен студенту Hufflepuff " + student2.getName());
        } else
            System.out.println(student2.getName() + " лучший студент Hufflepuff, чем студент " + student1.getName());
    }

    public void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int comparison1 = student1.getMind() + student1.getWisdom() + student1.getWit();
        int comparison2 = student2.getMind() + student2.getWisdom() + student2.getWit();

        if (comparison1 > comparison2) {
            System.out.println(student1.getName() + " лучший студент Ravenclaw, чем студент " + student2.getName());
        } else if (comparison1 == comparison2) {
            System.out.println(student1.getName() + " равен студенту Ravenclaw " + student2.getName());
        } else
            System.out.println(student2.getName() + " лучший студент Ravenclaw, чем студент " + student1.getName());
    }
    public void compareStudents(Slytherin student1, Slytherin student2) {
        int comparison1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition()
                + student1.getResourcefulness() + student1.getLustForPower();
        int comparison2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition()
                + student2.getResourcefulness() + student2.getLustForPower();

        if (comparison1 > comparison2) {
            System.out.println(student1.getName() + " лучший студент Slytherin, чем студент " + student2.getName());
        } else if (comparison1 == comparison2) {
            System.out.println(student1.getName() + " равен студенту Slytherin " + student2.getName());
        } else
            System.out.println(student2.getName() + " лучший студент Slytherin, чем студент " + student1.getName());
    }
}
