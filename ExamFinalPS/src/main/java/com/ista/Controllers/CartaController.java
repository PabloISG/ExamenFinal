package com.ista.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.Services.CartaService;
import com.ista.model.Carta;

@RestController
@RequestMapping("/api/carta")
public class CartaController {
	
	@Autowired
    CartaService cartaService;

    @GetMapping("/listarCarta")
    public ResponseEntity<List<Carta>> listarcarta() {
        return new ResponseEntity<>(cartaService.findByAll(), 
                HttpStatus.OK);
    }
    @PostMapping("/crearCarta")
    public ResponseEntity<Carta> crearCarta(
            @RequestBody Carta c) {
        return new ResponseEntity<>(cartaService.save(c), 
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizarcarta/{id}")
    public ResponseEntity<Carta> actualizarCarta(@PathVariable Long id, @RequestBody Carta c) {
     Carta cartaEncont = cartaService.findById(id);
        if (cartaEncont == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
            	cartaEncont.setNombre(c.getNombre());
            	cartaEncont.setCantidad(c.getCantidad());
            	cartaEncont.setCategoria(c.getCategoria());
                return new ResponseEntity<>(cartaService.save(c), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminarcarta/{id}")
    public ResponseEntity<Carta> eliminarCarta(@PathVariable Long id) {
        cartaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
