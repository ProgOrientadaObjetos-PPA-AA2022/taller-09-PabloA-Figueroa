/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    protected String tipo;
    protected String marca;
    protected Persona garante;
    protected double valorA;
    protected double valorMensual;

    public PrestamoAutomovil(Persona b, int p, String c, String t, String m, double v) {
        super(b, p, c);
        tipo = t;
        marca = m;
        garante = b;
        valorA = v;
        setCiudad(c);
        calcularValorMensual();
    }

    @Override
    public void setCiudad(String ciud) {
        ciudad = ciud.toLowerCase();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Persona getGarante() {
        return garante;
    }

    public void setGarante(Persona garante) {
        this.garante = garante;
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void calcularValorMensual() {
        this.valorMensual = valorA / prestamoM;
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format("\n---Datos---\n%s\n", super.toString());
        cadenaFinal = String.format("%sTipo de Automovil: %s\n"
                + "Marca del Automovil: %s\n"
                + "Valor del Automovil: %.2f\n"
                + "Valor mensual de pago préstamo automóvil: %.2f\n",
                cadenaFinal,
                tipo,
                marca,
                valorA,
                valorMensual);

        return cadenaFinal;
    }

}
