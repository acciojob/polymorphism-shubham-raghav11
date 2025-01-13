public class Main {

  public static void main(String [] args){
    Product p = new Product(); // Creating object p of Product
    System.out.println(p.product(5, 4));     // Calls the non-static method for 2 parameters
    System.out.println(p.product(5, 4, 2));  // Calls the non-static method for 3 parameters
    System.out.println(p.product(5.0, 4.0)); // Calls the non-static method for double parameters
  }
  
  class Product {  // Product class inside Main class
    public int product(int x, int y) {  // Method with 2 int parameters
      return x * y;
    }

    public int product(int x, int y, int z) {  // Overloaded method with 3 int parameters
      return x * y * z;
    }

    public double product(double x, double y) {  // Overloaded method with 2 double parameters
      return x * y;
    }
  }
}
