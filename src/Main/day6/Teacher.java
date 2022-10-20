package Main.day6;

import java.util.Random;

public class Teacher {
    private final String name;
    private final String course;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public void evaluate(Student student, int grade) {
        Random rand = new Random();
        if (grade < 0) {
            grade = rand.nextInt(2, 6);
        }
        String gradeStr = "";
        switch (grade) {
            case 5 -> gradeStr = "отлично";
            case 4 -> gradeStr = "хорошо";
            case 3 -> gradeStr = "удовлетворительно";
            case 2, 1 -> gradeStr = "неудовлетворительно";
        }
        if (grade > 0 && grade < 6) {
            System.out.println("Преподаватель " + this.name + " оценил студента с именем " +
                    student.getName() + " по предмету " + this.course + " на оценку " + gradeStr + ".");
        } else {
            System.out.println("Неправильная оценка");
        }
    }
}
