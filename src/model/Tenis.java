package model;

public class Tenis {

    public String marca;
    public Integer tamanho;
    public String modelo;
    
    
    public Tenis(String marca, Integer tamanho, String modelo) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.modelo = modelo;
    }


    public Tenis(String marca, Integer tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.modelo = "Modelo não defindo";
    }

    @Override
    public String toString() {
        return "Tenis [marca=" + marca + ", tamanho=" + tamanho + ", modelo=" + modelo + "]";
    }


    

    
    
    
}
