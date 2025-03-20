package controllers.com.inversionesjp.pruebaejercicio;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.models.User;

@RestController
@RequestMapping("/api/pruebaejercicio")
public class UserController {

    @GetMapping("/getAll")
    public List<User>getAll(){
        return null;
    }
}
