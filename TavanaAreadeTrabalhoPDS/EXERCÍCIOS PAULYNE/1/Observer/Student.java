package Observer;

public class Student implements IObserver{
    @Override
    public void update(int newGrade) {
        System.out.println("êeeeeeeba tirei um " + newGrade);
    }
}
