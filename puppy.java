public class puppy extends dog{
 
  private int age;

  public puppy(String n, int l, int a){
  super(n,l);
  age = a;
  }
  
  public int getAge(){
    return age;
  }
  
  public toString(){
    return super.toString()+"its age is: "+age;
  }
}