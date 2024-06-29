package br.edu.ifnmg.poo.conversortemperaturainstancia;

/**
 *
 * @author analu
 */
public class Temperatura {

    private double temperatura;

    public Temperatura() {
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

    public double converteCelsiusParaFahrenheit() throws TemperaturaInvalidaException {
        if (temperatura < -273.15) {
            throw new TemperaturaInvalidaException("Valor da temperatura abaixo do zero absoluto");
        } else {
            return (temperatura * (9.0 / 5)) + 32;
        }
    }

    public double converteKelvinParaCelsius() throws TemperaturaInvalidaException {
        if (temperatura < 0) {
            throw new TemperaturaInvalidaException("Valor da temperatura abaixo do zero absoluto");
        } else {
            return temperatura - 273.15;
        }
    }

    public double converteKelvinParaFahrenheit() throws TemperaturaInvalidaException {
        if (temperatura < 0) {
            throw new TemperaturaInvalidaException("Valor da temperatura abaixo do zero absoluto");
        } else {
            return (temperatura * 9.0 / 5) - 459.67;
        }
    }

}
