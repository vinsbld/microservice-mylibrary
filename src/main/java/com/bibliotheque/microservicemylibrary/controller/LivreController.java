package com.bibliotheque.microservicemylibrary.controller;

import com.bibliotheque.microservicemylibrary.dao.CopieDao;
import com.bibliotheque.microservicemylibrary.dao.LivreDao;
import com.bibliotheque.microservicemylibrary.model.Livre;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class LivreController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LivreDao livreDao;

    @Autowired
    private CopieDao copieDao;

    @GetMapping("/Livres")
    public List<Livre> ListeDeLivres(){

        return livreDao.findAll();
    }

    @GetMapping("/livre/{id}")
    public Optional<Livre> afficherUnLivre(@PathVariable Long id) {

        Optional<Livre> livre = livreDao.findById(id);

        return livre;
    }

}
