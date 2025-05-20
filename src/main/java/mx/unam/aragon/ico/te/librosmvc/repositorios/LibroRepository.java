package mx.unam.aragon.ico.te.librosmvc.repositorios;

import mx.unam.aragon.ico.te.librosmvc.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}

