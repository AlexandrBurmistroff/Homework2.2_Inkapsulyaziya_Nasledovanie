public class Main {
    public static void main(String[] args) {

        Gryffindor gryffindorPotter = new Gryffindor("Garry Potter", 70, 76, 67, 84, 93);
        Gryffindor gryffindorGranger = new Gryffindor("Hermione Granger", 65, 70, 65, 82, 90);
        Gryffindor gryffindorWeasley = new Gryffindor("Ron Weasley", 60, 59, 68, 83, 92);

        Hufflepuff hufflepuffSmith = new Hufflepuff("Zacharias Smith", 69, 68, 54, 58, 77);
        Hufflepuff hufflepuffDiggory = new Hufflepuff("Cedric Diggory", 67, 66, 59, 47, 72);
        Hufflepuff hufflepuffFletchley = new Hufflepuff("JustinFinchFletchley", 65, 64, 55, 60, 70);

        Ravenclaw ravenclawChang = new Ravenclaw("Zhou Chang", 65, 66, 77, 58, 47, 58);
        Ravenclaw ravenclawPatil = new Ravenclaw("Padma Patil", 68, 69, 68, 74, 43, 68);
        Ravenclaw ravenclawBelby = new Ravenclaw("Marcus Belby", 64, 65, 72, 65, 56, 70);

        Slytherin slytherinMalfoy = new Slytherin("Draco Malfoy", 69, 60, 68, 81, 92, 87, 76);
        Slytherin slytherinMontagu = new Slytherin("Graham Montagu", 68, 66, 75, 84, 90, 89, 81);
        Slytherin slytherinGoyle = new Slytherin("Gregory Goyle", 67, 68, 74, 91, 89, 94, 75);


        PrintService printService = new PrintService();
        printService.print(gryffindorPotter);
        printService.print(gryffindorGranger);
        printService.print(gryffindorWeasley);
        System.out.println();

        printService.print(hufflepuffSmith);
        printService.print(hufflepuffDiggory);
        printService.print(hufflepuffFletchley);
        System.out.println();

        printService.print(ravenclawChang);
        printService.print(ravenclawPatil);
        printService.print(ravenclawBelby);
        System.out.println();

        printService.print(slytherinMalfoy);
        printService.print(slytherinMontagu);
        printService.print(slytherinGoyle);
        System.out.println();

        FacultyService facultyService = new FacultyService();
        facultyService.compareStudents(gryffindorPotter,gryffindorWeasley);
        facultyService.compareStudents(hufflepuffSmith, hufflepuffDiggory);
        facultyService.compareStudents(ravenclawChang, ravenclawPatil);
        facultyService.compareStudents(slytherinMalfoy, slytherinMontagu);
        System.out.println();

        facultyService.compareStudentsHogwarts(gryffindorPotter,slytherinMontagu);
    }
}
