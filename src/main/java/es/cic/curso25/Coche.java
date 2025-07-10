package es.cic.curso25;

public class Coche {
    
    public static final double CONSUMO_INSTANTANEO = 4.3; 

    private int velocidad;

    public int getVelocidad(){
        return this.velocidad;
    }

    public double getConsumo(){
        return this.velocidad / 100d * CONSUMO_INSTANTANEO;
    }

    public int acelerar(int incrementoDeVelocidad){
        this.velocidad += incrementoDeVelocidad;
        return this.velocidad;
    }

    public int frenar(int decrementoDeVelocidad){
        this.velocidad -= decrementoDeVelocidad;
        return this.velocidad;
    }
}
