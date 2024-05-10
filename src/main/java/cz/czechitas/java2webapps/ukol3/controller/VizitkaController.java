package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        seznamVizitek.add(new Vizitka("Marie Nováková", "Google", "Nováková 45", "Brno, 12345", "marie.novak@seznam.cz", "+420 123 456 987", "wwww.google.com"));
        seznamVizitek.add(new Vizitka("Alice Samková", "Žádná firma", "Ostravská 789", "Ostrava, 70030", null, null, null));
        seznamVizitek.add(new Vizitka("Martin Blažený", "Testovací s.r.o.", "Liberecká 101", "Liberec, 46001", "martin.blazeny@example.com", null, null));
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView result = new ModelAndView("seznam");
        result.addObject("vizitky", seznamVizitek);
        return result;
    }

    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }
}
