package com.example.citieslib.controller;

import com.example.citieslib.models.City;
import com.example.citieslib.services.CityService;
import com.example.citieslib.utils.DataInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    private CityService service = null;

    public MainController() {
        service = new CityService();
        DataInitializer initializer = new DataInitializer(service);
        initializer.Initialze();
    }

    @GetMapping(value = {"/", "/index"})
    public String index(Model model){
        model.addAttribute("cities", service.findAllCities());
        return "/index";
    }
    @GetMapping(value = {"/delete"})
    public String delete(@RequestParam int id, Model model){
        service.deleteCity(id);
        return "redirect:/index";
    }
    @GetMapping(value = {"/edit"})
    public String edit(@RequestParam int id, Model model){
        City city = service.findCity(id);
        model.addAttribute("city", city);
        return "/edit";
    }
    @PostMapping(value = {"/edit"})
    public String editConfirm(@ModelAttribute City city,
                                Model model){
        service.updateCity(city);
        return "redirect:/index";
    }

    @GetMapping(value = {"/create"})
    public String create(Model model){
        model.addAttribute("city", new City());
        return "/create";
    }
    @PostMapping(value = {"/create"})
    public String createConfirm(@ModelAttribute City city,
                                Model model){
        service.createCity(city);
        return "redirect:/index";
    }

    @PostMapping(value = {"/search"})
    public String createConfirm(@RequestParam(name = "name") String name,
                                @RequestParam(name = "people") int people,
                                @RequestParam(name = "history") String history,
                                Model model){
        List<City> cities=service.findConditions(name, people, history);
        model.addAttribute("cities", cities);
        return "/index";
    }
}