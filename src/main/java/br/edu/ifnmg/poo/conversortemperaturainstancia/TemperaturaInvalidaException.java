package br.edu.ifnmg.poo.conversortemperaturainstancia;

/**
 * 
 * @author analu
 */
public class TemperaturaInvalidaException extends Exception {

   public TemperaturaInvalidaException(){
   }
    
    public TemperaturaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
