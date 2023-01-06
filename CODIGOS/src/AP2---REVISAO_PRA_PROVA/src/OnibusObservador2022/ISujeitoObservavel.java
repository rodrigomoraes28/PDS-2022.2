//aq eh o subjetc

//ele que troca de estado
//e é sobre ele que nos queremos saber

//no nosso exemplo ele é onibus que sai da ufc e os bgl td ---> sujeito observavel
//quem quer obsevar ele eh os alunos e a prefeitura
public interface ISujeitoObservavel {


  public void adicionaObservador(IObservador observador); //enquanto for util adicona
  public void removeObservador(IObservador observador); //senao remove
  public void notifique();
  
}
