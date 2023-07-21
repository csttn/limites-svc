package com.coffeeandit.limitessvc.api;


import com.coffeeandit.limitessvc.entity.LimiteDiario;
import com.coffeeandit.limitessvc.service.LimiteDiarioService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class LimiteDiarioController {

    LimiteDiarioService limiteDiarioService;

    public LimiteDiarioController(LimiteDiarioService limiteDiarioService) {
        this.limiteDiarioService = limiteDiarioService;
    }


    @GetMapping(value = "/limite-diario/{id}")
    public LimiteDiario findById(@PathVariable("id") Long id) {

        Optional<LimiteDiario> limiteDiario = this.limiteDiarioService.findById(id);

        if (limiteDiario.isPresent()) {
            return limiteDiario.get();
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recurso nao encontrado");
    }

}
