package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public String getEnseñanza() {
        return ensenanza;
    }
    public void setEnseñanza(String enseñanza) {
        this.ensenanza = enseñanza;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    
    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = enseñanza;
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int numero){
        return numero*this.getPaginas()*1;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public String toString(){
        String r = this.getOrigen()+"\n";
        r += this.getTitulo() + "\n";
        r += this.getAutor() + "\n"; 
        r += this.getPaginas()+ "\n";
        r += this.ensenanza+ "\n";
        r += this.interpretacion+ "\n";
        return r;
    }
}
