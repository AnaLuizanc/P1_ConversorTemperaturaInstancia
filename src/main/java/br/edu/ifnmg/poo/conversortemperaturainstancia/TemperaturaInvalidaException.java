package br.edu.ifnmg.poo.conversortemperaturainstancia;

/**
 * Classe de exceção.
 * @author AnaLuizanc
 */
public class TemperaturaInvalidaException extends Exception {
    
    public TemperaturaInvalidaException() {
        super("Valor da temperatura abaixo do zero absoluto");
    }
}
