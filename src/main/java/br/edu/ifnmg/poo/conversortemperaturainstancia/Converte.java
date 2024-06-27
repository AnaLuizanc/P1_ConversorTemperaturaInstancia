package br.edu.ifnmg.poo.conversortemperaturainstancia;

/**
 *
 * @author analu
 */
public class Converte {

    private double temperatura;

    public Converte() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

//</editor-fold>
    public double converteCelsiusParaKelvin() {
        if (temperatura < -273.15) {

            //dispara excecao "Valor da temperatura abaixo do zero absoluto"
            System.err.println("Valor da temperatura abaixo do zero absoluto");
        } else {
            double resultado = temperatura + 273.15;
            if (resultado < -273.15) {
                // dispara excecao "Valor convertido para abaixo do zero absoluto"
                System.err.println("Valor convertido para abaixo do zero absoluto");
            } else {
                return resultado;
            }
        }
        return 0;
    }
    
}
