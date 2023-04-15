package Aula2;

public class Ex2Pessoa {
private String fase;
private String nome;
private String profissao;
private boolean vivo;

public void nascer(String nome ) {

this.nome = nome;
this.fase = "bebê";
this.profissao = "Não tem";
this.vivo = true;



}
public void crescer() {
if(vivo) {
if (fase == "bebê")
fase = "criança";
else if(fase == "criança")
fase = "adolescente ";
else if(fase == "adolescente")
fase = "adulto";
else
fase = "idoso";
}
else System.out.println("Pessoas falecidas não crescem");
}

public void trabalhar (String profissao) {
if(vivo && (fase.equals("adulto")) || (fase.equals("idoso"))) {//EQUALS UTILIZADO PARA COMPARAR STRING SEM DAR ERROS
this.profissao =  profissao;
}
else
System.out.println("Não pode trabalhar");
    }

public void morrer () {
if(vivo)
vivo = false;
else
System.out.println("Você já esta morto");
}


public String getFase() {
return fase;
}
public String getNome() {
return nome;
}
public String getProfissao() {
return profissao;
}
public boolean isVivo() { // pode ter um IS ou HASH é
return vivo;
}


}