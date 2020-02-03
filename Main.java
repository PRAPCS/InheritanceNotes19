class Main {
  public static void main(String[] args) {
    
    pets p = new pets("Bruno");
    System.out.println(p);

    dog d = new dog("Pluto",4);
    System.out.println(d);
    d.setName("Spike");
    System.out.println(d);
    System.out.println(d.getName());

    snake s = new snake("Ka",20);
    System.out.println(s.getName());
    System.out.println(s);

    puppy pu = new puppy("Airbud", 4, 5 );
    System.out.println(pu);
    System.out.println(pu.getName());

   


  }
}