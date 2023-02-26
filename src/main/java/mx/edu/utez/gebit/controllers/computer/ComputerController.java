package mx.edu.utez.gebit.controllers.computer;


import mx.edu.utez.gebit.services.computer.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-gebit/computer")
@CrossOrigin(origins = {"*"})
public class ComputerController {
    @Autowired
    private ComputerService service;
}
