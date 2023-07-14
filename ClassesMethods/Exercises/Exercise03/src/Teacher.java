import java.util.Random;
public class Teacher {
    void grade(Student s){
        Random r = new Random();
        s.gradeAssignment1( r.nextDouble(11.0));
        s.gradeAssignment2(r.nextDouble(11.0));
        s.gradeFinalExam(r.nextDouble(11.0));

        System.out.println("Student--> "+s.name+" " +s.lastname+" Exercise1--> "+s.DegreeExercise1+" Exercise2--> "+s.DegreeExercise2+" Test--> "+s.DegreeTest+" Final Grade is-> "+s.finalGrade());
    }
}
