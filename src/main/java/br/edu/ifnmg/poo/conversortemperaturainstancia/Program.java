package br.edu.ifnmg.poo.conversortemperaturainstancia;

/**
 *
 * @author AnaLuizanc (alnc2@aluno.ifnmg.edu.br)
 */
public class Program {

    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();

        System.out.println("CELSIUS -> KELVIN");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Celsius para Kelvin">
        try {
            temperatura.setTemperatura(21.0);
            System.out.println(">> Resultado: " + temperatura.converteCelsiusParaKelvin() + " K");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-280.0);
            System.out.println(">> Resultado: " + temperatura.converteCelsiusParaKelvin() + " K");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(26.0);
            System.out.println(">> Resultado: " + temperatura.converteCelsiusParaKelvin() + " K");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

//</editor-fold>
        System.out.println("CELSIUS -> FAHRENHEIT ");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Celsius para Fahrenheit">
        try {
            temperatura.setTemperatura(22.0);
            System.out.println(">> Resultado: " + temperatura.converteCelsiusParaFahrenheit() + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-290.0);
            System.out.println(">> Resultado: " + temperatura.converteCelsiusParaFahrenheit() + " °F");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(32.7);
            System.out.println(">> Resultado: " + temperatura.converteCelsiusParaFahrenheit() + " °F");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

//</editor-fold>
        System.out.println("KELVIN -> CELSIUS");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Kelvin para Celsius">
        try {
            temperatura.setTemperatura(25.0);
            System.out.println(">> Resultado: " + temperatura.converteKelvinParaCelsius() + " °C");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-12.0);
            System.out.println(">> Resultado: " + temperatura.converteKelvinParaCelsius() + " °C");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(350.0);
            System.out.println(">> Resultado: " + temperatura.converteKelvinParaCelsius() + " °C");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

//</editor-fold>
        System.out.println("KELVIN -> FAHRENHEIT");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Kelvin para Fahrenheit">
        try {
            temperatura.setTemperatura(25.0);
            System.out.println(">> Resultado: " + temperatura.converteKelvinParaFahrenheit() + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(150.0);
            System.out.println(">> Resultado: " + temperatura.converteKelvinParaFahrenheit() + " °F");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-1.0);
            System.out.println(">> Resultado: " + temperatura.converteKelvinParaFahrenheit() + " °F");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
//</editor-fold>
    }
}
