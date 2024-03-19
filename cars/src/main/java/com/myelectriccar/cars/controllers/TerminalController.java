package com.myelectriccar.cars.controllers;

import com.myelectriccar.cars.services.TerminalService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TerminalController {
    public TerminalService terminalService;

    public TerminalController(TerminalService terminalService) {
        this.terminalService = terminalService;
    }


}
