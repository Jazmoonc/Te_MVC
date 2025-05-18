package mx.unam.aragon.ico.te.librosmvc.controladores;

import org.springframework.ui.Model;
import mx.unam.aragon.ico.te.librosmvc.modelos.Libro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libreria")
public class LibrosController {

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
}
