public class snake extends pets{

  private int length;

  public snake(String n, int l){
    super(n);
    length = l;
  }

  public int getLength(){
    return length;
  }

  public String toString(){
    return super.toString()+" the length is: "+length;
  }

}