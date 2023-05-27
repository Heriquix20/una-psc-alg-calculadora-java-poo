public class Calculadora {
   private double numeroUm;
   private double numeroDois;
     
     public void setNumeroUm(double NovoValorNumeroUm) {
     numeroUm = NovoValorNumeroUm;
     }

     public double getNumeroUm(double NovoValorNumeroUm) {
        return numeroUm;
     }
     
     public void setNumeroDois(double NovoValorNumeroDois) {
     numeroDois = NovoValorNumeroDois;
     }

     public double getNumeroDois(double NovoValorNumeroDois) {
        return numeroDois;
     }

     public double somar() {
     return numeroUm + numeroDois;
     }

     public double subtrair() {
     return numeroUm - numeroDois;
     }
 
     public double multiplicar() {
     return numeroUm * numeroDois;
     }
 
     public double dividir() {
     return numeroUm / numeroDois;
    }
 
     public double potencia() {
     return Math.pow(numeroUm, numeroDois);
     }
    
 
     public double raizQuadrada() {
     return Math.sqrt(numeroUm);
     }
 }
    

