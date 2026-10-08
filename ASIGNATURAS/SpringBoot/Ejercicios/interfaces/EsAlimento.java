package ASIGNATURAS.SpringBoot.Ejercicios.interfaces;

// Archivo: EsAlimento.java
import java.time.LocalDate;

public interface EsAlimento {
    public void setCaducidad(LocalDate fc);

    public LocalDate getCaducidad();

    public int getCalorias();
}
