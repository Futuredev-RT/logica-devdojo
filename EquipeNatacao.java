public class EquipeNatacaoExercise {
    public static void main(String[] args) {
        String nome = "";
        int idade = 25;
        if (idade <= 10) {
            nome = "Nicolas";
            System.out.println(nome + " Participará do torneio na categoria Infantil");
        } else if (idade >=11 && idade <= 15) {
            nome = "Jordan";
            System.out.println(nome + " Participará do torneio na categoria Juvenil");
        } else if (idade >= 16 && idade <=19) {
            nome = "Kadu";
            System.out.println(nome + " Participará da categoria Pré Adulto");
        } else  {
            nome = "Ana";
            System.out.println(nome + " Participará da categoria adulto");
        }
    }
}

/*
Exercício inspirado em uma situação real de organização de torneio de natação.
Classifica os participantes por idade nas categorias:
- Infantil
- Juvenil
- Pré-adulto
- Adulto
*/




Adiciona exercício de classificação de nadadores por idade
