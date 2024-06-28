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
    public double converteCelsiusParaKelvin() throws TemperaturaInvalidaException {
        if (temperatura < -273.15) {
            throw new TemperaturaInvalidaException("Valor da temperatura abaixo do zero absoluto");
        } else {
            return temperatura + 273.15;
        }
    }

}
