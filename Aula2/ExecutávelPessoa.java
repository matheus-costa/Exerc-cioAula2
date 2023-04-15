package Aula2;

public class ExecutávelPessoa {

public static void main(String[] args) {

Ex2Pessoa P1 = new Ex2Pessoa();


P1.nascer("carlinhos");
P1.trabalhar("Advogado");
P1.crescer();
P1.trabalhar("Advogado");
P1.crescer();
P1.trabalhar("Advogado");
P1.crescer();
P1.trabalhar("Advogado");
P1.crescer();
P1.trabalhar("Médico");
P1.crescer();


System.out.println("Nome é:"+" "+P1.getNome()+","+"Sua fase é:"+P1.getFase()
+" "+"Sua profissão é:"+P1.getProfissao()+","+"Você está vivo?"+P1.isVivo());


}

}