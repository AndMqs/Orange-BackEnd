package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuariorRepository;

@RestController // O controller dá um direcionamento pra funcionalidade existente na aplicação
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuariorRepository repository;
    @GetMapping
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("{id}") //Precisamos de um cliente para executar esse comando, o Postman faz esse serviço
    public void deleteUser(Integer id){
        repository.deleteById(id);;
    }
    @PostMapping
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    @PutMapping
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

}
