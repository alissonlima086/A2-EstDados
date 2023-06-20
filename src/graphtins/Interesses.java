package graphtins;

public enum Interesses {
    FUTEBOL("Futebol"),
    FILMES("Filmes"),
    LIVROS("Livros"),
    TECNOLOGIA("Tecnologia"),
    GAMES("Games");


    private String label;

    Interesses(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
