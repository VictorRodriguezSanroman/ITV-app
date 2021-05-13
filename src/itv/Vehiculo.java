
package itv;



public class Vehiculo {
    
    //Atributos
    private String matricula;
    private String marca;
    private String modelo;
    private String fecha;
    private int cilindrada;
    private int potencia;
    private int hora;
    private int minuto;
    //Para que el numero introducido siempre ocupe 2 posiciones
    private String formatoMinuto = String.format("%02d", minuto);

    
    //métodos getter y setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    

    

    @Override
    public String toString() {
        
        return " Matrícula: " + matricula + " - Marca: " + marca + " - Modelo: " + modelo + " - Fecha: " + fecha + " - Cilindrada: " + cilindrada + " - Potencia: " + potencia + " - Hora de llegada: " + hora +":"+ formatoMinuto;
    }


    
    
    
    
}
