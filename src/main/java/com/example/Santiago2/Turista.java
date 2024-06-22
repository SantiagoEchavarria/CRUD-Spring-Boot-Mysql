package com.example.Santiago2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospedajes")
public class Turista {
    @Id
    int id;
    String cedula;
    String nombre;
    String fecha_ingreso;
    String fecha_salida;
    int dias_hospedaje;
    float valor_dia;
    float valor_total;
 // Constructor vacío

 public Turista() {
}

 // Constructor
 public Turista(int id, String cedula, String nombre, String fecha_ingreso, String fecha_salida, int dias_hospedaje, float valor_dia, float valor_total) {
    this.id = id;
    this.cedula = cedula;
    this.nombre = nombre;
    this.fecha_ingreso = fecha_ingreso;
    this.fecha_salida = fecha_salida;
    this.dias_hospedaje = dias_hospedaje;
    this.valor_dia = valor_dia;
    this.valor_total = valor_total;
}
// Getters y Setters
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getCedula() {
    return cedula;
}

public void setCedula(String cedula) {
    this.cedula = cedula;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getFecha_ingreso() {
    return fecha_ingreso;
}

public void setFecha_ingreso(String fecha_ingreso) {
    this.fecha_ingreso = fecha_ingreso;
}

public String getFecha_salida() {
    return fecha_salida;
}

public void setFecha_salida(String fecha_salida) {
    this.fecha_salida = fecha_salida;
}

public int getDias_hospedaje() {
    return dias_hospedaje;
}

public void setDias_hospedaje(int dias_hospedaje) {
    this.dias_hospedaje = dias_hospedaje;
}

public float getValor_dia() {
    return valor_dia;
}

public void setValor_dia(float valor_dia) {
    this.valor_dia = valor_dia;
}

public float getValor_total() {
    return valor_total;
}

public void setValor_total(float valor_total) {
    this.valor_total = valor_total;
}
@Override
	public String toString() {
		return "Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", fecha_ingreso=" + fecha_ingreso
				+ ", fecha_salida=" + fecha_salida + ", dias_hospedaje=" + dias_hospedaje + ", valor_dia=" + valor_dia + "]";
	}
}
