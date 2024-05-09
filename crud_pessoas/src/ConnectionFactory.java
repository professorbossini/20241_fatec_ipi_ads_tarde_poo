import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;
public class ConnectionFactory {
  private static String host = "localhost";
  private static String port = "5432";
  private static String db = "20241_fatec_ipi_poo_pessoas";
  private static String user = "postgres";
  private static String password = "123456";
  //https://google.com:80/search
  //string de conexão
  //jdbc:postgresql://localhost:5432/20241_fatec_ipi_poo_pessoas
  public static Connection getConnection() 
                              throws Exception{
    //cláusula catch or declare
      var s = String.format(
        "jdbc:postgresql://%s:%s/%s",
        host, port, db
      );
      Connection conexao = DriverManager.getConnection(s, user, password);
      return conexao;
  }
}
