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
public class Trapecio extends Figura{
    
    double B;
    double b;
    double altura;
    
 public Trapecio( double a, double b,double altura){
     this.B = B;
     this.b = b;
     this.altura = altura; 
     
     }
    @Override
 public double getArea(){
     return ((B + b) * altura)/2;
 }
            
           
}
