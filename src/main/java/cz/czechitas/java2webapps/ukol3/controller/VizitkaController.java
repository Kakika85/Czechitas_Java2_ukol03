package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final List<Vizitka> seznamVizitek = new ArrayList<>();

    public VizitkaController() {
        seznamVizitek.add(new Vizitka("Petr Novák", "Seznam", "Nováková 45", "Brno, 12345", "petr.novak@seznam.cz", "+420 123 456 789", "wwww.seznam.cz"));
        seznamVizitek.add(new Vizitka("Alice Samková", "Coca‑Cola", "Českobrodská 1329", "Praha 9 – Kyje, 198 21", null, "+420 777 666 555", null));
        seznamVizitek.add(new Vizitka("Martin Blažený", "Testovací s.r.o.", "Okrajová 517/8", "Těrlicko, 73542", "martin.blazeny@example.com", null, "www.testovaci.cz"));
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView result = new ModelAndView("seznam");
        result.addObject("vizitky", seznamVizitek);
        return result;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView model = new ModelAndView("detail");
        model.addObject("vizitky", seznamVizitek.get(id));
        return model;
    }
}