import java.sql.Connection;
import java.sql.PreparedStatement;
public class PessoaDAO { //data access object
  
  public void cadastrar(Pessoa p) throws Exception{
    //cláusula catch or declare
    //1. Especificar o comando SQL
    var sql = "INSERT INTO tb_pessoa(nome, fone, email, idade) VALUES (?, ?, ?, ?)";
    //2. Estabelecer uma conexão com o banco
    Connection conexao = ConnectionFactory.getConnection();
    //3. Preparar o comando
    PreparedStatement ps = conexao.prepareStatement(sql);
    //4. Substituir os eventuais placeholders
    ps.setString(1, p.getNome());
    ps.setString(2, p.getFone());
    ps.setString(3, p.getEmail());
    ps.setInt(4, p.getIdade());
    //5. Executar o comando
    ps.execute();
    //. Fechar a conexão
    ps.close();
    conexao.close();
  }
}
