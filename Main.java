import java.util.Scanner;
import co.com.bancolombia.modelo.Rectangulo;
class Main {
  public static void main(String[] args) {
    System.out.println("Figuras Geometricas");
    System.out.println("Elije el tipo de figura");
    System.out.println("1- circulo");
    System.out.println("2- triangulo");
    System.out.println("3- rectangulo");
    System.out.println("4- cuadrado");
    Scanner entrada=new Scanner(System.in);

    String opcion=entrada.next();

    if(opcion.equals("1")){
       System.out.println("Escogio circulo");
    }else if(opcion.equals("2")){
      System.out.println("Escogio triangulo");
    }else if(opcion.equals("3")){
      System.out.println("ingrese la base");
      Scanner baseEscaner=new Scanner(System.in);
      int base=baseEscaner.nextInt();
      System.out.println("ingrese la Altura");
      Scanner alturaEscaner=new Scanner(System.in);
      int altura=alturaEscaner.nextInt();
      Rectangulo rectangulo=new Rectangulo(base,altura);
      System.out.println("El area del Rectangulo es: "+rectangulo.getArea());
      System.out.println("El Perimetro del Rectangulo es: "+rectangulo.getPerimetro());
    }else if(opcion.equals("4")){
      System.out.println("Escogio Cuadrado");
    }


  }
}