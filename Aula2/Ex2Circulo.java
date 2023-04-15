package Aula2;

public class Ex2Circulo {

private float areaDisco;
private float circunferencia = 10;
private float superficieEsfera;
private float volumeEsfera;
private float raio = 20;
private double  PI = 3.14159265359;


public float calcularAreaDisco() {
return this.areaDisco = (float) (PI * (raio * raio));
}

public float calcularCircunferencia() {
return this.circunferencia = (float) (2 * PI * raio);
}

public float  calcularSuperficie() {

return this.superficieEsfera = (float) (4 * PI * (raio*raio));
}

public float calcularVolume() {
return this.volumeEsfera = (float) ( PI *( raio*raio)*circunferencia);
}

public float getareaDisco() {
return areaDisco;
}
public void setareaDisco(float areaDisco) {
this.areaDisco = areaDisco;
}
public float getAreaDisco() {
return areaDisco;
}
public void setAreaDisco(float areaDisco) {
this.areaDisco = areaDisco;
}
public float getCircunferencia() {
return circunferencia;
}
public void setCircunferencia(float circunferencia) {
this.circunferencia = circunferencia;
}
public float getSuperficieEspera() {
return superficieEsfera;
}
public void setSuperficieEspera(float superficieEspera) {
this.superficieEsfera = superficieEspera;
}
public float getVolumeEsfera() {
return volumeEsfera;
}
public void setVolumeEsfera(float volumeEsfera) {
this.volumeEsfera = volumeEsfera;
}

public float getSuperficieEsfera() {
return superficieEsfera;
}
public void setSuperficieEsfera(float superficieEsfera) {
this.superficieEsfera = superficieEsfera;
}
public float getRaio() {
return raio;
}
public void setRaio(float raio) {
this.raio = raio;
}
}