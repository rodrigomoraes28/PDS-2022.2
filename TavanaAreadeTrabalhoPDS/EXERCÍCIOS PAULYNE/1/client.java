import Observable.Grades;
import Observer.Coordinator;
import Observer.Student;

public class client {
    public static void main(String[] args) {

        Grades grade = new Grades();
        grade.addObserver(new Student());
        grade.addObserver(new Coordinator());

        grade.updateGrade(10);

        grade.updateGrade(20);
    }
}
