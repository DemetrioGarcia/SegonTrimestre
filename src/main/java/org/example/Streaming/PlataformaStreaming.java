package org.example.Streaming;

public class PlataformaStreaming {
    public static void main(String[] args) {

        Suscripcion[] planes = {
                new PlanGratis("Plan Gratis", 0),
                new PlanBasico("Plan Básico", 10),
                new PlanPremium("Plan Premium", 15),
                new PlanFamiliar("Plan familiar", 17)
        };

        for (Suscripcion plan : planes){
            plan.mostrarInfo();
            plan.obtenerBeneficios();
            System.out.print("Periodo de prueba: ");
            plan.obtenerPeriodoPrueba();
        }
    }


}
