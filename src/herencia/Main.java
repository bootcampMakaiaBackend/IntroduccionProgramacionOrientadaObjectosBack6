package herencia;

public class Main {
    public static void main(String[] args) {
        //Crear medico
        Medico medicoAna = new Medico("San vicente", "12312312", "Medico", 100000);
        //Crear un ingeniero
        Ingeniero ingenieroJuan = new Ingeniero("Parques del rio", "Medellin", "Ingeniero", 2000);
        double aportePensionAna = medicoAna.calcularAportePension();
        double aportePensionJuan = ingenieroJuan.calcularAportePension();
        System.out.println(aportePensionAna);
        System.out.println(aportePensionJuan);
    }
}
