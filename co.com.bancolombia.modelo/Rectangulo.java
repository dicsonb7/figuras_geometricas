package co.com.bancolombia.modelo;

public class Rectangulo extends Figuras{
  private int base=0;
  private int altura=0;

public Rectangulo(int base, int altura){
  this.base=base;
  this.altura=altura; 
}
//un comentario
public int getBase(){
  return base;
}
public void setBase(int base){
  this.base=base;
}

public int getArea(){
  return base*altura;
}
public int getPerimetro(){
  return (2*base)+(2*altura);
}

}