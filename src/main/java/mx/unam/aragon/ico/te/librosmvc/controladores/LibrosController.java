package mx.unam.aragon.ico.te.librosmvc.controladores;

import mx.unam.aragon.ico.te.librosmvc.repositorios.LibroRepository;
import mx.unam.aragon.ico.te.librosmvc.servicios.LibroService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import mx.unam.aragon.ico.te.librosmvc.modelos.Libro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/libreria")
public class LibrosController {
    @Autowired
    private LibroService libroService;

    @Autowired
    private LibroRepository libroRepository;

    @GetMapping("/lista")
    public String verLibros(Model model) {
        List<Libro> libros = libroRepository.findAll();  // Obtenemos todos los libros
        model.addAttribute("libros", libros);            // Enviamos a la vista
        return "listaLibros";                            // Mostramos la vista "listaLibros.html"
    }

    @GetMapping("/principal/")
    public String principal() {
        return "principal";
    }

    @GetMapping("/libro/")
    public String libro(Model model) {
        Libro libro = new Libro("Boulevard", "Flor M. Salvador","Wattpad","https://is1-ssl.mzstatic.com/image/thumb/Publication126/v4/35/a5/0e/35a50e2e-db0e-3de9-130a-3f934ce8f3fa/9788419169884.jpg/1200x1200wz.jpg",309);
        model.addAttribute("libro",libro);
        return "libro";
    }

    @GetMapping("/formulario")
    public String nuevo(Model model) {
        model.addAttribute("libro", new Libro("Todo lo que fuimos","Alberto Villarreal","Planeta","img",213));
        return "formLibro";
    }

    @PostMapping("/guardar")
    public String guardar(
            @ModelAttribute Libro libro
    ) {
        //Falta terminar vitacora
        LoggerFactory.getLogger(getClass()).info("Guardando libro + " + libro);
        libroService.guardarLibro(libro);
        return "redirect:/libreria/formulario?exito";
    }

    @GetMapping("/libro/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("libro",libroService.getLibro(id));
        return "libro";
    }

}
