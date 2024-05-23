public class Aluno extends Pessoa {
  private int ra;
  public Aluno(String nome, int idade, int ra){
    super(nome, idade);
    this.ra = ra;
  }

  public String toString(){
    var sb = new StringBuilder("");
    sb.append(super.toString());
    sb.append(", RA:").append(ra);
    return sb.toString();
  }
}
