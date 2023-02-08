public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil hyundai = new Automovil("Hyundai", "Elantra");
        hyundai.setCilindrada(2.0);
        hyundai.setColor(Color.BLANCO);
        hyundai.setTipo(TipoAutomovil.SEDAN);

        Automovil mazda = new Automovil("Mazda","BT-50");
        mazda.setColor(Color.GRIS);
        mazda.setCilindrada(3.0);
        mazda.setTipo(TipoAutomovil.COOPER);

        TipoAutomovil tipo = hyundai.getTipo();
        System.out.println("Tipo hyundai: "+ tipo.getNombre());
        System.out.println("Descr. hyundai: "+ tipo.getDescription());

        tipo = mazda.getTipo();
        System.out.println("Tipo Mazda: "+ tipo.getNombre());
        System.out.println("Descr. Mazda: "+ tipo.getDescription());

        //Switch
        switch (tipo) {
            case CONVERTIBLE ->
                    System.out.println("El automovil es deportivo y descapotable de 2 puertas");
            case COOPER ->
                    System.out.println("El automovil es pequeño de 2 puestas y típicamente deportivo");
            case FURGON ->
                    System.out.println("Es un automovil utilitario de empresas");
            case CAMIONETA ->
                    System.out.println("Es un automovil mediano compacto");
            case SEDAN ->
                    System.out.println("Es un automovil común de 4 puertas");
        }

        //Foreach
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil tA: tipos) {
            System.out.println(tA.name()+ " -> "+
                    tA.getNombre()+ ", "+ tA.getDescription()+
                    ", "+ tA.getNumeroPuerta()+" puertas.");
            System.out.println();
        }
    }
}