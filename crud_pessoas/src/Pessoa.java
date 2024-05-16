import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
  private int codigo;
  private String nome;
  private String fone;
  private String email;
  private int idade;
  public Pessoa(int codigo){
    this.codigo = codigo;
  }

  //faça o toString usando o String.format
  public String toString(){
    return String.format(
      "código: %d, nome: %s, fone: %s, email: %s, idade: %d",
      codigo, nome, fone, email, idade
    );
  }
}
