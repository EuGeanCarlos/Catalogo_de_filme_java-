public class Main{

    public static  void main(String [] args){

        System.out.println("Esse é o screen Match");
       System.out.println("Filme: Dragon ball z: batalha dos Deuses");

       int anoDoLancamento = 2017;
       System.out.println("Ano de lançamento: " + anoDoLancamento);
       boolean incluidoNoPlano = true;
       double notaDoFile = 8.5;
       System.out.println("Nota do filme " + notaDoFile);

       // criando media
       double media = (10 + 8.0  + 7.5) / 3 ;
       System.out.println("Nota média de avaliação " + media);
        // usando texto

        String sinopse;
        sinopse = """ 
                    Filme DBZ
                    Animação de ação baseado no anime Dragon ball z que apresenta o deus da destruição billus.
                    ano de lançamento:
                """ + anoDoLancamento;
        System.out.println(sinopse);
        // conversao com cast
        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao + " Estrelas");

    }


}