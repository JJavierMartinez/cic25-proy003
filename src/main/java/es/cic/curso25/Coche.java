package es.cic.curso25;

public class Coche {
    
    public static final double CONSUMO_INSTANTANEO = 4.3; 
    private Calculadora calculadora;

    private int velocidad;

    public Coche(){
        this.calculadora = new Calculadora();
    }

    public int getVelocidad(){
        return this.velocidad;
    }

    public double getConsumo(){
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.dividir(100);
        this.calculadora.multiplicar(CONSUMO_INSTANTANEO);

        return calculadora.getTotal();
    }

    public int acelerar(int incrementoDeVelocidad){
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(incrementoDeVelocidad);
        this.velocidad = (int) Math.round(calculadora.getTotal());
        return this.velocidad;
    }

    public int frenar(int decrementoDeVelocidad){
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.restar(decrementoDeVelocidad);
        this.velocidad = (int) Math.round(calculadora.getTotal());
        return this.velocidad;
    }
}
