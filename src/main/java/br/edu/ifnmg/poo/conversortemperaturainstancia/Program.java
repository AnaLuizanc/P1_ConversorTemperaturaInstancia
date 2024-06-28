package br.edu.ifnmg.poo.conversortemperaturainstancia;

/**
 *
 * @author AnaLuizanc (alnc2@aluno.ifnmg.edu.br)
 */
public class Program {

    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();

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

    }
}
