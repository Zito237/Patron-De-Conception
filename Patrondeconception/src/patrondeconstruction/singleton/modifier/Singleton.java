package patrondeconstruction.singleton.modifier;

public final class Singleton {
  private static Singleton instance = null;
  public int x;
  public int y ;

  private Singleton(){

  }
  private Singleton(int x, int y){
      this.x = x;
      this.y = y;
  }
  public static Singleton getInstance(){
      if(instance == null){
      instance = new Singleton();
      }
      return instance;
  }
  public static Singleton getInstance(int x, int y){
      if(instance == null){

          instance = new Singleton(x,y);
      }
      return instance;
  }

    public int somme(int x, int y){
        return x+y;
    }
  public float moyenne(int x, int y){
      return somme(x,y)/2;
  }

  public float produit(int x, int y){
      return x*y;
  }
    public float division(int x, int y){
        return x/y;
    }


}
