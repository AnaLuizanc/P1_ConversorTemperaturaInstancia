package br.edu.ifnmg.poo.conversortemperaturainstancia;

/**
 *
 * @author AnaLuizanc (alnc2@aluno.ifnmg.edu.br)
 */
public class Program {

    public static void main(String[] args) {
        Converte temperatura = new Converte();
        
        temperatura.setTemperatura(21.0);
        System.out.println(">> Resultado: " + temperatura.converteCelsiusParaKelvin());
        
        temperatura.setTemperatura(-280.0);
        System.out.println(">> Resultado: " + temperatura.converteCelsiusParaKelvin());
        
        
    }
}
