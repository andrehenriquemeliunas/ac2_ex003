import java.util.Scanner;
public class ac2_ex003{
    public static void main( String[] args){
        double ac1, ac2, ag, af, media;//Declara as variáveis

        Scanner s = new Scanner( System.in);
        System.out.print("Nota AC1: ");//Recebe a nota da AC1 do aluno
        ac1 = s.nextDouble();//Salva a resposta do usuário

        System.out.print("Nota AC2: ");//Recebe a nota da AC2 do aluno
        ac2 = s.nextDouble();//Salva a resposta do usuário

        System.out.print("Nota AG: ");//Recebe a nota da AG do aluno
        ag = s.nextDouble();//Salva a resposta do usuário

        System.out.print("Nota AF: ");//Recebe a nota da AF do aluno
        af = s.nextDouble();//Salva a resposta do usuário

        double valorAc1 = (ac1 * 0.15);//Multiplica nota AC1 pelo respectivo peso
        double valorAc2 = (ac2 * 0.30);//Multiplica nota AC2 pelo respectivo peso
        double valorAg = (ag * 0.1);//Multiplica nota AG pelo respectivo peso
        double valorAf = (af * 0.45);//Multiplica nota AF pelo respectivo peso

        media = (valorAc1 + valorAc2 + valorAf + valorAg);//Faz o cáculo da média

        if(media < 5){
            System.out.printf("Média final: %.2f %n", (media));//Exibe a média para o usuário se for menor que 5
            System.out.print("Você foi REPROVADO!");// Fala que foi reprovado
        }else{
            System.out.printf("Média final: %.2f %n", (media));//Exibe a média para o usuário se for maior que 5
            System.out.print("Você foi APROVADO!");//Fala que foi aprovado
        }

        s.close();
    }
}