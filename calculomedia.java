public class calculomedia{
    public static void main (string [] args){
        system.out.println("---Sistema de notas---");
        double nota1 = 8.0;
        double nota2 = 6.5;
        double nota3 = 7.5;
        double media = (nota1+nota2+nota3)/3;
        system.out.println("A média do aluno é:" +média);

        if(média >=7){
            system.out.println("Aprovado");
        }
        else{
            system.out.println("Reprovado:");
        }
    }
}