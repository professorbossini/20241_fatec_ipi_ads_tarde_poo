import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
      var menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n5-Ver idade média no Java\n6-Ver idade média no banco\n0-Sair";
      int op = 0;
      do{
        try{
          op = Integer.parseInt(
            JOptionPane.showInputDialog(menu)
          );
          switch(op){
            case 1:{
              var nome = 
                JOptionPane.showInputDialog("Nome?");
              var fone = 
                JOptionPane.showInputDialog("Fone?");
              var email = 
                JOptionPane.showInputDialog("Email?");
              var idade = Integer.parseInt(
                JOptionPane.showInputDialog(
                  "Idade?"
                )
              );
              var p = new Pessoa(
                0, nome, fone, email, idade
              );
              var dao = new PessoaDAO();
              dao.cadastrar(p);
              JOptionPane.showMessageDialog(
                  null, "Cadastro OK!"
              );
              break;
            }
            case 2:{
              //1. Pegar os dados junto ao usuário
              var nome = JOptionPane.showInputDialog("Nome?");
              var fone = JOptionPane.showInputDialog("Fone?");
              var email = JOptionPane.showInputDialog("Email?");
              var idade = Integer.parseInt(
                JOptionPane.showInputDialog("Idade?")
              );
              var codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Código?")
              );
              //2. construir um objeto Pessoa
              var p = new Pessoa(
                codigo, nome, fone, email, idade
              );
              //3. construir um objeto dao
              var dao = new PessoaDAO();
              //4. atualizar usando o dao
              dao.atualizar(p);
              //5. Confirmar a atualização
              JOptionPane.showMessageDialog(
                null, "Atualização OK!"
              );
              break;
            }
            case 3:{
              var codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Código?")
              );
              var p = new Pessoa(codigo);
              var dao = new PessoaDAO();
              dao.deletar(p);
              JOptionPane.showMessageDialog(
                null, 
                "Remoção OK!"
              );
              break;
            }
            case 4:{
              var pessoas = new PessoaDAO().listar();
              var sb = new StringBuilder("");
              for (var p : pessoas){
                sb.append(p).append("\n");
              }
              JOptionPane.showMessageDialog(null, sb);
              break;
            }
            case 5:{
              //mostrar a média da idade calculando no Java
              break;
            }
            case 6:{
              // mostrar a média da idade calculando no banco
              break;
            }
            // fazer case 0 e default
            case 0: {
              JOptionPane.showMessageDialog(null, "Até!");
              break;
            }
            default:{
              JOptionPane.showMessageDialog(null, "Opção inválida");
            }
          }
        }
        catch(Exception e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(
            null, "Coisas ruins aconteceram..."
          );
        }

      }while(op != 0);   
    }
    
}
