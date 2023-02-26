package mx.edu.utez.gebit.services.computer;

import mx.edu.utez.gebit.models.computer.Computer;
import mx.edu.utez.gebit.models.computer.ComputerRepository;
import mx.edu.utez.gebit.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@Transactional
public class ComputerService {
    @Autowired
    private ComputerRepository repository;

    @Transactional(readOnly = true)
    public Response<List<Computer>> getAll(){
        return new Response<>(
                this.repository.findAll(),
                false,
                200,
                "OK"
        );
    }

    /*@Transactional(rollbackFor = {SQLException.class})
    public Response<Computer> insert(Computer computer){

    }*/
}
