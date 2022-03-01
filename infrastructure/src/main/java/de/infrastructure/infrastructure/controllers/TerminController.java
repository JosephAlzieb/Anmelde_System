package de.infrastructure.infrastructure.controllers;

import gruppe.Gruppe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import services.GruppenService;
import services.TerminService;

import java.util.List;

@Controller
@RequestMapping("/termine")
public class TerminController {

    private TerminService terminService;
    private GruppenService gruppenService;

    public TerminController(TerminService terminService, GruppenService gruppenService) {
        this.terminService = terminService;
        this.gruppenService = gruppenService;
    }

    @GetMapping()
    public String getTermine(Model model){
        model.addAttribute("termine", terminService.getTermine() );
        return "termine";
    }

    @GetMapping ("/{terminId}")
    public String getGruppen(Model model, @PathVariable("terminId") Long terminId){
        Gruppe gruppe = gruppenService.getGruppeById(terminId);
        model.addAttribute("gruppen", List.of(gruppe));
        model.addAttribute("terminId", terminId);
        return "gruppen";
    }


    @GetMapping("/{terminId}/{gruppeId}")
    public String belegen(Model model, @PathVariable("terminId") Long terminId, @PathVariable("gruppeId") Long gruppeId){
        model.addAttribute("github", "Joseph");
        model.addAttribute("terminId", terminId);
        model.addAttribute("gruppeId", gruppeId);

        return "belegen";
    }

    @PostMapping("/{terminId}/{gruppeId}")
    public String anmeldung(Model model,
                            @RequestParam("matrikelNr") String matrikelNr,
                            @RequestParam("name") String name,
                            @PathVariable("terminId") Long terminId,
                            @PathVariable("gruppeId") Long gruppeId
                            ){
        System.out.println(matrikelNr);
       gruppenService.addUserToGruppe(gruppeId,"josephK",name, matrikelNr);
        return "redirect:/termine" ;
    }



}
