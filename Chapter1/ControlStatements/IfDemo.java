// Demonstrating the if statemnt

class IfDemo {

  public static void main(String args[]) {

    int a, b, c;

    a = 2;
    b = 3;

    if(a < b) System.out.println("a is less than b");
    if(a == b) System.out.println("you won't ever see this");

    System.out.println();

    c = a - b;

    System.out.println("c contains " + c);
    if(c >= 0) System.out.println("c is non-negative");
    if(c < 0) System.out.println("c is negative");

    System.out.println();

    c = b - a;

    System.out.println("c now contains " + c);
    if(c >= 0) System.out.println("c is non-negative");
    if(c < 0) System.out.println("c is negative");

  }

}
