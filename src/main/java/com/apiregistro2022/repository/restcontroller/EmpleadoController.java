
package com.apiregistro2022.repository.restcontroller;

import com.apiregistro2022.entity.Empleado;
import com.apiregistro2022.service.EmpleadoService;
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
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> findAll() {
        return empleadoService.findAll();
    }

    @GetMapping("/custom")
    public List<Empleado> findAllCustom() {
        return empleadoService.findAllCustom();
    }

    // el id permite mostrar o buscar la categoria atraves del codigo y se puede cambiar
    @GetMapping("/{id}")
    public Optional<Empleado> findById(@PathVariable Long id) {
        return empleadoService.findById(id);
    }

    //enviar valores
    @PostMapping
    public Empleado add(@RequestBody Empleado e) {
        return empleadoService.add(e);
    }

    //actualizar valores
    @PutMapping("/{id}")
    public Empleado update(@PathVariable Long id, @RequestBody Empleado e) {
        e.setCodigo(id);
        return empleadoService.update(e);
    }

    //eliminar valores
    @DeleteMapping("/{id}")
    public Empleado delete(@PathVariable Long id) {
        Empleado objEmpleado = new Empleado();
        objEmpleado.setCodigo(id);
        return empleadoService.delete(Empleado.builder().codigo(id).build());
    }
    
}
