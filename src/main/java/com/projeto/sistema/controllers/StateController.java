package com.projeto.sistema.controllers;

import com.projeto.sistema.models.DataBaseState;
import com.projeto.sistema.repositories.RepositoryState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Map;

@Controller // Informar ao Spring que é um controller
public class StateController {

    @Autowired // Realizar a conexão com o StateRepository
    private RepositoryState repositoryState;

//    @GetMapping("/stateRegistration") // Para obter o mapeamento
//    public ModelAndView register(DataBaseState state) {
//        ModelAndView modelAndView = new ModelAndView("administrative/states/register");
//        modelAndView.addObject("state", state);
//
//        return modelAndView; // Retornar o Model and View
//    }

    @GetMapping("/stateRegistration") // Para obter o mapeamento
    public ModelAndView register(Model model, DataBaseState state) {
        ModelAndView modelAndView = new ModelAndView("administrative/states/register");
        model.addAttribute("state", state);
        return modelAndView;
    }

    @PostMapping("/stateSaved")
    public ModelAndView save(Model model, DataBaseState state, BindingResult result) {
        if (result.hasErrors()) return register(model, state);

        repositoryState.saveAndFlush(state);
        return register(model, new DataBaseState());
    }
}