public class Persona {
    private String nome;
    private String cognome;

    Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        // this.setNome(nome);
        // this.setCognome(cognome);
    }
    public String toString(){
        String stringa = this.nome + "\n" + this.cognome;
        return stringa;
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void copy(Persona persona) {
        this.setNome(persona.getNome());
        this.setCognome(persona.getCognome());
    }
    //oppure
    // Persona(Persona persona){
    //      this,copy(persona);
    // }
}