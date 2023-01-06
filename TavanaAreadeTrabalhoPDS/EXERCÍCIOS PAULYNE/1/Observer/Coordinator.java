package Observer;

public class Coordinator implements IObserver{
    @Override
    public void update(int newGrade) {
        System.out.println("AH NÃO os alunos se deram bem!" + newGrade);
    }
}
