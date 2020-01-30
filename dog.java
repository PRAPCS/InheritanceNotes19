public class dog extends pets{

  private int legs;

  public dog(String n, int l){
    super(n);
    legs = l;
  }

  public int getLegs(){
    return legs;
  }

  public String getName(){
    return super.getName()+" I am a child";
    
  }
  public void setName(String n){
   super.setName(n); 
   
  }
  public String toString(){
    return super.toString()+" it has "+legs+" legs";
  }
}