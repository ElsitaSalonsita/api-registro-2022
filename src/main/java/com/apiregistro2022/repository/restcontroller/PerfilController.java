
package com.apiregistro2022.repository.restcontroller;

import com.apiregistro2022.entity.Perfil;
import com.apiregistro2022.service.PerfilService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//agregamos el nombre con el cuañ se va a buscar el controlador de rest
@RequestMapping("/perfil")


public class PerfilController {
    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public List<Perfil> findAll() {
        return perfilService.findAll();
    }

    @GetMapping("/custom")
    public List<Perfil> findAllCustom() {
        return perfilService.findAllCustom();
    }

    // el id permite mostrar o buscar la categoria atraves del codigo y se puede cambiar
    @GetMapping("/{id}")
    public Optional<Perfil> findById(@PathVariable Long id) {
        return perfilService.findById(id);
    }

    //enviar valores
    @PostMapping
    public Perfil add(@RequestBody Perfil p) {
        return perfilService.add(p);
    }

    //actualizar valores
    @PutMapping("/{id}")
    public Perfil update(@PathVariable Long id, @RequestBody Perfil p) {
        p.setCodigo(id);
        return perfilService.update(p);
    }

    //eliminar valores
    @DeleteMapping("/{id}")
    public Perfil delete(@PathVariable Long id) {
        Perfil objPerfil = new Perfil();
        objPerfil.setCodigo(id);
        return perfilService.delete(Perfil.builder().codigo(id).build());
    }
    
}
