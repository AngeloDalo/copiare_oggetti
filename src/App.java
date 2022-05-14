public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Luca", "Rossi");
        Persona persona2 = new Persona("Marco", "Neri");

        //NO persona2 = persona1
        //funziona ma ci sono problemi di memoria
        //se cambio nome a 1 cambia nome a tutti e due
        persona2.copy(persona1);
        persona1.setNome("Orazio");
        //oppure
        //Persona persona2 = new Persona(persona1);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println();
        System.out.println();
        System.out.println(persona1.getNome());
        System.out.println(persona1.getCognome());
        System.out.println();
        System.out.println();
        System.out.println(persona2.getNome());
        System.out.println(persona2.getCognome());
    }
}
