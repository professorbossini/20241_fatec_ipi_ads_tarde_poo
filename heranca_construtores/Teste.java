public class Teste {
  public static void main(String[] args) {
    //"Ana", 20
    var p = new Pessoa("Ana", 20);
    var a = new Aluno("Pedro", 22, 123456);
    //usando String.format
    //nome: Ana, Idade: 20
    System.out.println(p);
    //usando StringBuilder
    //nome: Pedro, Idade: 22, RA: 1234567
    //detalhe: reutilize a funcionalidade já definidade na SUPERclasse
    System.out.println(a);
  }
}
