package herencia;

public class Medico extends Profesion{
    private String nombreHospital;
    private String tarjetaProfesional;

    //constructor                                                  // lo del papa (herencia)
    public Medico(String nombreHospital, String tarjetaProfesional, String nombre, int sueldoBase) {
        // tengo que invocar al constructor del papa
        super(nombre, sueldoBase);
        this.nombreHospital = nombreHospital;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }
}
