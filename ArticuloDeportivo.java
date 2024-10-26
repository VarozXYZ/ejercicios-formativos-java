public class ArticuloDeportivo {
    private String titulo;
    private String autor;
    private String keywords;
    private String nombre;
    private int yearPublicacion;
    private String resumen;

    public ArticuloDeportivo (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public ArticuloDeportivo (String titulo, String autor, String keywords, String nombre, int yearPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.keywords = keywords;
        this.nombre = nombre;
        this.yearPublicacion = yearPublicacion;
    }
    
    public ArticuloDeportivo (String titulo, String autor, String keywords, String nombre, int yearPublicacion, String resumen) {
        this.titulo = titulo;
        this.autor = autor;
        this.keywords = keywords;
        this.nombre = nombre;
        this.yearPublicacion = yearPublicacion;
        this.resumen = resumen;
    }

    public void getArticleData() {
        
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.keywords);
        System.out.println(this.nombre);
        System.out.println(this.yearPublicacion);
        System.out.println(this.resumen);
    }
        
        
    public static void main(String[] args) {
        ArticuloDeportivo articulo = new ArticuloDeportivo("La Temporada de la NBA 2024: Un Análisis Completo", "Juan Pérez",  "NBA, Temporada 2024, Análisis, Baloncesto",  "Revista de Deportes", 2024, "Un análisis profundo de la emocionante temporada de la NBA, destacando a los equipos y jugadores a seguir.");
        articulo.getArticleData();
    }
}
