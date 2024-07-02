package br.edu.ifnmg.poo.conversortemperaturainstancia;

import java.util.Locale;

/**
 *
 * @author AnaLuizanc
 */
public class Program {

    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();

        System.out.println("CELSIUS -> KELVIN");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Celsius para Kelvin">
        try {
            temperatura.setTemperatura(21.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterCelsiusParaKelvin()) + " K");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-280.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterCelsiusParaKelvin()) + " K");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(26.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterCelsiusParaKelvin()) + " K");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

//</editor-fold>
        System.out.println("CELSIUS -> FAHRENHEIT ");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Celsius para Fahrenheit">
        try {
            temperatura.setTemperatura(22.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterCelsiusParaFahrenheit()) + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-290.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterCelsiusParaFahrenheit()) + " °F");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(32.7);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterCelsiusParaFahrenheit()) + " °F");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

//</editor-fold>
        System.out.println("KELVIN -> CELSIUS");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Kelvin para Celsius">
        try {
            temperatura.setTemperatura(25.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterKelvinParaCelsius()) + " °C");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-12.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterKelvinParaCelsius()) + " °C");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(350.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterKelvinParaCelsius()) + " °C");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

//</editor-fold>
        System.out.println("KELVIN -> FAHRENHEIT");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Kelvin para Fahrenheit">
        try {
            temperatura.setTemperatura(25.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterKelvinParaFahrenheit()) + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(150.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterKelvinParaFahrenheit()) + " °F");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-1.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterKelvinParaFahrenheit()) + " °F");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
//</editor-fold>

        System.out.println("FAHRENHEIT -> CELSIUS");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Fahrenheit para Celsius">
        try {
            temperatura.setTemperatura(90.2);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterFahrenheitParaCelsius()) + " °C");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(150.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterFahrenheitParaCelsius()) + " °C");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-500.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterFahrenheitParaCelsius()) + " °C");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
//</editor-fold>

        System.out.println("FAHRENHEIT -> KELVIN");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Fahrenheit para Kelvin">
        try {
            temperatura.setTemperatura(90.2);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterFahrenheitParaKelvin()) + " K");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(150.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterFahrenheitParaKelvin()) + " K");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            temperatura.setTemperatura(-500.0);
            System.out.println(">> Resultado: " + String.format(Locale.US, "%.1f", temperatura.converterFahrenheitParaKelvin()) + " K");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
//</editor-fold>

    }
}
