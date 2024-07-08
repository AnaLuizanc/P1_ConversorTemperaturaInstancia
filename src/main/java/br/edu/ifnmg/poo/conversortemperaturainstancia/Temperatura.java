package br.edu.ifnmg.poo.conversortemperaturainstancia;

/**
 *
 * @author AnaLuizanc
 */
public class Temperatura {

    private double temperatura;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

//</editor-fold>
    
    public double converterCelsiusParaKelvin() throws TemperaturaInvalidaException {
        if (temperatura < -273.15) {
            throw new TemperaturaInvalidaException();
        } else {
            return temperatura + 273.15;
        }
    }

    public double converterCelsiusParaFahrenheit() throws TemperaturaInvalidaException {
        if (temperatura < -273.15) {
            throw new TemperaturaInvalidaException();
        } else {
            return (temperatura * (9.0 / 5)) + 32;
        }
    }

    public double converterKelvinParaCelsius() throws TemperaturaInvalidaException {
        if (temperatura < 0) {
            throw new TemperaturaInvalidaException();
        } else {
            return temperatura - 273.15;
        }
    }

    public double converterKelvinParaFahrenheit() throws TemperaturaInvalidaException {
        if (temperatura < 0) {
            throw new TemperaturaInvalidaException();
        } else {
            return (temperatura * 9.0 / 5) - 459.67;
        }
    }

    public double converterFahrenheitParaCelsius() throws TemperaturaInvalidaException {
        if (temperatura < -459.67) {
            throw new TemperaturaInvalidaException();
        } else {
            return (5 * temperatura - 160) / 9.0;
        }
    }

    public double converterFahrenheitParaKelvin() throws TemperaturaInvalidaException {
        if (temperatura < -459.67) {
            throw new TemperaturaInvalidaException();
        } else {
            return 5.0 / 9 * (temperatura + 459.67);
        }
    }
}
