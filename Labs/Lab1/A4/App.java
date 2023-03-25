package Labs.Lab1.A4;

public class App{

    public static void main(String[]args){
      Product[]  products ={new Product(6745, 5.50, "Penne Pasta"),
      new Product(8853, 6.50, "Spaghetti Pasta"),
      new Product(2106, 4.50, "Linguine Pasta")};
      for(Product p: products){
        System.out.println(p.toString());
      }
    }
  }