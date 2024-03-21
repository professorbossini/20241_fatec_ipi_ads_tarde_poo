public class Personagem{
  //variáveis de instância(objeto)
  String nome;
  int energia = 10;
  int fome = 0;
  int sono = 0;

  void cacar(){
    if(energia >= 2){
      System.out.printf("%s esta cacando...\n", nome);
      energia -= 2; // energia = energia - 2;
    }
    else{
      System.out.printf("%s sem energia para cacar...\n", nome);
    }
    fome = Math.min(fome + 1, 10);
    //resolver com o ternário
    sono = sono < 10 ? sono + 1 : sono;
  }

  void comer() {
    //se tiver fome
      //comer e reduzir o valor de fome de 1
      //aumentar o valor de energia de 1
    //caso contrario
      //so vai avisar que esta sem fome
      switch(fome){
        case 0:
          System.out.printf("%s sem fome....\n", nome);
          break;
        default:
          System.out.printf("%s comendo...\n", nome);
          --fome;
          energia = (energia == 10 ? energia : energia + 1);
      }
  }

  void dormir(){
    if(sono >= 1){
      System.out.printf("%s esta dormindo...\n", nome);
      sono -= 1;
      energia = Math.min(energia + 1, 10);
    }
    else{
      System.out.printf("%s sem sono...\n", nome);
    }
  }

  public String toString(){
    return String.format(
      "%s: (e:%d, f:%d, s:%d)",
      nome, energia, fome, sono
    );
  }
}