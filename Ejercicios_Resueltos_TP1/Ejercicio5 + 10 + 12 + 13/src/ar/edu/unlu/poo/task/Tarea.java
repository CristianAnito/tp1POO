package ar.edu.unlu.poo.task;

import java.util.Date;

public class Tarea {
    private String descripcion;
    private Boolean estado;
    private int prioridad;
    private Date fechaVencimiento;
    private Date fechaRecordatorio;
    private Date fechaFinalizacion;
    private String[] colaboradores = new String[5];
    private String colaboradorFinalizo;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Date getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public void setFechaRecordatorio(Date fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public void setColaboradores(String[] colaboradores) {
        this.colaboradores = colaboradores;
    }

    public String[] getColaboradores() {
        return colaboradores;
    }

    public void setColaboradorFinalizo(String colaboradorFinalizo) {
        this.colaboradorFinalizo = colaboradorFinalizo;
    }

    public String getColaboradorFinalizo() {
        return colaboradorFinalizo;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
