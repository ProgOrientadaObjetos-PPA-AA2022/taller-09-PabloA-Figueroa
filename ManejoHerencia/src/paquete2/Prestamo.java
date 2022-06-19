/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int prestamoM;
    protected String ciudad;

    public Prestamo(Persona b, int p, String c) {
        beneficiario = b;
        prestamoM = p;
        ciudad = c;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getPrestamoM() {
        return prestamoM;
    }

    public void setPrestamoM(int prestamoM) {
        this.prestamoM = prestamoM;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n"
                + "Edad: %s\n"
                + "Ciudad: %s\n"
                + "Timepo de Prestamo en Meses: %d",
                beneficiario.getNombre(),
                beneficiario.getApellido(),
                beneficiario.getUsername(),
                prestamoM,
                ciudad,
                prestamoM);
        return cadena;
    }

}
