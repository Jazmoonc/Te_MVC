package mx.unam.aragon.ico.te.librosmvc.servicios;

import mx.unam.aragon.ico.te.librosmvc.modelos.Libro;
import mx.unam.aragon.ico.te.librosmvc.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    public boolean guardarLibro(Libro libro) {
        Libro resultado = libroRepository.save(libro);
        return resultado != null;
    }

    public Libro getLibro(Integer id) {
        return libroRepository.getById(id);
    }
}
