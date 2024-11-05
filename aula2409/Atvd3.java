import java.util.Scanner;

public class Atvd3 {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);

        System.out.println("Olá, Sou o Pitagoras, mas pode me chamar de Pit, serei seu ajudante nesse interessante mundo que é a Educação financeira.");
        System.out.println("Qual seu nome?");
        String nome = sss.nextLine();

        System.out.println("Certo, " + nome + ", darei uma breve introdução sobre o que é educação financeira e por que é tão importante.");
        System.out.println("É na educação financeira que aprendemos a gerir os nossos recursos financeiros de forma saudável e inteligente.");
        System.out.println("Se gastarmos mais do que temos, podemos acabar ficando com dívidas. Então, é sempre bom, em qualquer idade, aprender sobre o assunto.\n");

        System.out.println(nome + ", agora vamos começar a organizar nossas finanças, qual sua renda mensal?");
        double rendaMensal = sss.nextDouble();

        System.out.println("Pronto, antes vamos fazer os cálculos dos seus gastos mensais:");

        System.out.print("Gastos com a casa: ");
        double casa = sss.nextDouble();

        System.out.print("Gastos com a alimentação: ");
        double alimentacao = sss.nextDouble();

        System.out.print("Gastos com a saúde: ");
        double saude = sss.nextDouble();

        System.out.print("Gastos com a educação: ");
        double educacao = sss.nextDouble();

        System.out.print("Gastos com o carro: ");
        double carro = sss.nextDouble();

        System.out.print("Gastos com lazer: ");
        double lazer = sss.nextDouble();

        System.out.print("Gastos com outras coisas (fora do que já foi mostrado): ");
        double outros = sss.nextDouble();

        double gastos = casa + alimentacao + saude + educacao + carro + lazer + outros;
        System.out.println(nome + ", seus gastos mensais são: " + gastos + "\n");

        double total = rendaMensal - gastos;
        System.out.println("No fim do mês isso é o valor que resta: " + total + "\n");

        if (total >= 500) {
            System.out.println(nome + ", você está indo bem! Essa quantia é um bom começo. Guarde esse dinheiro para emergências e uma pequena parte para começarmos nosso fundo de investimentos.");
        } else if (total == 0) {
            System.out.println("Poxa " + nome + ", sem nada restando no fim do mês fica difícil ter uma reserva para investir ou para emergências. Vou te ensinar algumas dicas para reduzir custos.");
            System.out.println("Dicas para organizar suas finanças:");
            System.out.println("1. Faça um orçamento: Liste todos os seus gastos e categorize-os para entender onde você pode economizar. \n");
            System.out.println("2. Priorize suas despesas: Separe gastos essenciais de não essenciais e foque no que realmente importa. \n");
            System.out.println("3. Estabeleça metas de economia: Defina um valor a ser economizado todo mês e trate isso como uma despesa fixa. \n");
        } else {
            System.out.println(nome + ", isso é preocupante, seu valor está negativo. Vamos dar um jeito nisso.");
            System.out.println("Dicas para organizar suas finanças:");
            System.out.println("1. Faça um orçamento: Liste todos os seus gastos e categorize-os para entender onde você pode economizar. \n");
            System.out.println("2. Priorize suas despesas: Separe gastos essenciais de não essenciais e foque no que realmente importa. \n");
            System.out.println("3. Estabeleça metas de economia: Defina um valor a ser economizado todo mês e trate isso como uma despesa fixa. \n");
        }

        System.out.println("Bom, agora vamos falar sobre investimentos. Existem três conceitos fundamentais do mundo do investimento: \n");
        System.out.println("1- Liquidez: refere-se à facilidade e rapidez com que um investimento pode ser convertido em dinheiro (sem perder muito valor).");
        System.out.println("2- Riscos: está relacionado à incerteza quanto ao retorno do investimento. Quanto maior o risco, maior a chance de perder parte ou todo o dinheiro investido.");
        System.out.println("3- Rentabilidade: refere-se ao retorno financeiro que o investimento gera, ou seja, quanto dinheiro ele vai render ao longo do tempo.\n");

        System.out.println(nome + ", agora que já sabe os 3 fundamentos dos investimentos, vamos falar sobre os tipos de investimentos. Digite sua escolha em letra maiúscula: A, B, C, D ou E \n");
        System.out.println("A- Ação");
        System.out.println("B- Fundo de investimento");
        System.out.println("C- ETFs");
        System.out.println("D- Criptomoedas");
        System.out.println("E- Fundo imobiliários");

        String escolha = sss.next();

        switch (escolha) {
        case "A":
            System.out.println("Ações representam uma fração do capital de uma empresa.\n");
            System.out.println("Riscos: Alta volatilidade pode causar perdas.\n");
            System.out.println("Liquidez: Alta, podendo ser negociadas rapidamente na bolsa.\n");
            System.out.println("Requisitos: Ter uma conta em uma corretora e conhecer o mercado.\n");
            break;
        case "B":
            System.out.println("Fundos de investimento são uma forma de juntar dinheiro com outras pessoas.\n");
            System.out.println("Riscos: Variável, dependendo dos ativos do fundo.\n");
            System.out.println("Liquidez: Pode variar, dependendo do tipo de fundo.\n");
            System.out.println("Requisitos: Conhecimento básico sobre o fundo escolhido.\n");
            break;
        case "C":
            System.out.println("ETFs (Exchange Traded Funds) são fundos que são negociados na bolsa.\n");
            System.out.println("Riscos: Variável, dependendo dos ativos que compõem o ETF.\n");
            System.out.println("Liquidez: Alta, sendo negociados como ações.\n");
            System.out.println("Requisitos: Ter uma conta em uma corretora.\n");
            break;
        case "D":
            System.out.println("Criptomoedas são moedas digitais que utilizam a tecnologia blockchain.\n");
            System.out.println("Riscos: Alta volatilidade e risco de perda total.\n");
            System.out.println("Liquidez: Alta, mas pode variar entre diferentes criptomoedas.\n");
            System.out.println("Requisitos: Criar uma conta em uma corretora de criptomoedas.\n");
            break;
        case "E":
            System.out.println("Fundos imobiliários permitem investir em imóveis através de cotas.\n");
            System.out.println("Riscos: Relacionados ao mercado imobiliário e gestão do fundo.\n");
            System.out.println("Liquidez: Média, pois é negociado na bolsa, mas pode haver períodos de baixa.\n");
            System.out.println("Requisitos: Ter uma conta em uma corretora.\n");
            break;
        default:
            System.out.println("Opção inválida! Por favor, escolha A, B, C, D ou E.");
            break;
    }


        System.out.printf("Espero ter ajudado a entender um pouco mais sobre educação financeira. Imagino que agora esteja animado(a) para aprender mais e colocar em prática.\n");
        System.out.println("Antes de nos despedirmos, aqui estão alguns canais para ajudá-lo a aprender mais sobre investimentos e finanças: \n");
        System.out.println("O Primo Rico: https://www.youtube.com/@primorico \n");
        System.out.println("Me Poupe!: https://www.youtube.com/@MePoupe \n");
        System.out.println("BitNada (criptomoedas): https://www.youtube.com/@BitNada \n");
        System.out.println("Bom, é aqui que nos despedimos. Foi um prazer lhe ensinar, até mais! :)");
    }
}