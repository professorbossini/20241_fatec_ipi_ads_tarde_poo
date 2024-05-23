public class AnimalOld{
  private String nome;
  //1: Gato
  //2: Cachorro
  //3: Pato
  private int tipo;

  public void falar(){
    //esse código viola o princípio aberto/fechado
    if(getTipo() == 1)
      System.out.println("miau");
    else if (getTipo() == 2)
      System.out.println("au");
    else if(getTipo() == 3)
      System.out.println("quack");
  }

  public int getTipo() {
    return tipo;
    
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
    
  }
}