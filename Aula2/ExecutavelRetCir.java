package Aula2;

public class ExecutavelRetCir {
public static void main(String[] args) {

Ex2Retangulo R1 = new Ex2Retangulo();
Ex2Circulo C1 = new Ex2Circulo();




System.out.println("Área do retângulo:"+" "+R1.calcularArea(10, 2));
         System.out.println("-----------");
         System.out.println("Perímetro do Retângulo:"+" "+R1.calcularPerimetro(10, 3));
         System.out.println("----------");
         System.out.println("Área do Disco:"+" "+C1.calcularAreaDisco());
         System.out.println("Circunferência do circulo:"+" "+C1.calcularCircunferencia());
         System.out.println("Superfície do circulo:"+" "+C1.calcularSuperficie());
         System.out.println("Volume do circulo:"+" "+C1.calcularVolume());
}

}