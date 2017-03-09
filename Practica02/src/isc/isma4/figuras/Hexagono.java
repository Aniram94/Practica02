/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

/**
 *
 * @author marina
 */
public class Hexagono extends Figura {
    double perimetro;
    double apotema; 
    
  public Hexagono (double perimetro, double apotema){
      this.perimetro = perimetro;
      this.apotema = apotema; 
 }
    
    @Override
    public double getArea(){
        return (perimetro*apotema)/2;
    }
    
}
