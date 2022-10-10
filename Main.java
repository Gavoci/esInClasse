class Main {
  public static void main(String[] args) {
   
    Ruota c=new Ruota("bergamo ",200);
    Ruota c1=new Ruota("milano ",300);
    Ruota c2=new Ruota("napoli ",400);


    c.start();
    c1.start();
    c2.start();
  }
}