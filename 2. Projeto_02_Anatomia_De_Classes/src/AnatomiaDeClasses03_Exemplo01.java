public class AnatomiaDeClasses03_Exemplo01 {

    public static void main (String [] args) {
    //Variáveis declaradas que serão utilizadas para criação do método de concatenação de nomes;
        String primeiroNome = "Guilherme";
        String segundoNome = "Feliciano";
        String terceiroNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);
        System.out.println(nomeCompleto);
    }
    
    //Método que faz a concatenação do nome para impressão da informação ao usuário;
    public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);
    }
}
