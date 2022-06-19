/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    protected String nivelEstudio;
    protected InstitucionEducativa centroEducativo;
    protected double valorCarrera;
    protected double valorMensualCarrera;

    public PrestamoEducativo(Persona b, int p, String c, String t, InstitucionEducativa m, double v) {
        super(b, p, c);
        nivelEstudio = t;
        centroEducativo = m;
        valorCarrera = v;
        setCiudad(c);
        setValorMensualCarrera();
    }

    @Override
    public void setCiudad(String ciud) {
        ciudad = ciud.toUpperCase();
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double getValorMensualCarrera() {
        return valorMensualCarrera;
    }

    public void setValorMensualCarrera() {
        this.valorMensualCarrera = (valorCarrera / prestamoM) - (((valorCarrera / prestamoM) * 5) / 100);
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format("\n---Datos---\n%s\n", super.toString());
        cadenaFinal = String.format("%sNombre de la Unidad Educativa: %s\n"
                + "Iniciales de la Unidad Educativa: %s\n"
                + "Nivel de Estudios: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual del pago del préstamo del valor de la carrera: %.2f\n",
                cadenaFinal,
                centroEducativo.getNombre(),
                centroEducativo.getSiglas(),
                nivelEstudio,
                valorCarrera,
                valorMensualCarrera);

        return cadenaFinal;
    }
}
