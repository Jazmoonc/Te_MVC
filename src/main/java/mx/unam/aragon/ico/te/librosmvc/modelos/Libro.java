package mx.unam.aragon.ico.te.librosmvc.modelos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String autor;
    private String editorial;
    private String imagen;
    private Integer paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, String editorial, String imagen, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.imagen = imagen;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return paginas == libro.paginas && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(editorial, libro.editorial) && Objects.equals(imagen, libro.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, editorial, imagen, paginas);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", imagen='" + imagen + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
