package com.lynow.lynow_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RecepcaoController {
    @GetMapping("/ola")
    public String darBoasVindas() {
        return "Bem-Vindo a Lynow Corp, o servidor está rodando!";
    }

    @GetMapping("/status")
    public String statusDoServidor() {
        return "Sistema 100 % Operacional";
    }
}
