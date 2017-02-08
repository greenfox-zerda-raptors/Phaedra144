package com.greenfox.developers.controllers;

import com.greenfox.developers.models.Developer;
import com.greenfox.developers.models.Skill;
import com.greenfox.developers.repositories.DeveloperRepository;
import com.greenfox.developers.repositories.SkillRepository;
import com.greenfox.developers.services.DeveloperServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by ${SzilviaB} on 2017. 01. 22..
 */
@Controller
@RequestMapping("/developers")
public class DeveloperController {

    private SkillRepository skillRepository;
    private DeveloperRepository developerRepository;

    @Autowired
    public DeveloperController(SkillRepository skillRepository, DeveloperRepository developerRepository) {
        this.skillRepository = skillRepository;
        this.developerRepository = developerRepository;
    }

    @RequestMapping(value = {"", "/list"})
    public String index(Model model) {
        model.addAttribute("developers", developerRepository.findAll());
        model.addAttribute("skills", skillRepository.findAll());
        model.addAttribute("addedDeveloper", new Developer());
        return "index";
    }

    @RequestMapping("/view/{id}")
    public String viewDeveloper(Model model, @PathVariable long id) {
        model.addAttribute("developer", developerRepository.findOne(id));
        model.addAttribute("skills", skillRepository.findAll());
        return "view";
    }

    @PostMapping("/create")
    public String developerSubmit(@Valid Developer developer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()){
            return "index";
        }else{
            developerRepository.save(developer);
            return "redirect:/developers/view/" + developer.getId();
        }
    }

    @RequestMapping(value="/{id}/skills", method=RequestMethod.POST)
    public String developersAddSkill(@PathVariable Long id, @RequestParam Long skillId, Model model) {
        Skill skill = skillRepository.findOne(skillId);
        Developer developer = developerRepository.findOne(id);

        if (developer != null) {
            if (!developer.hasSkill(skill)) {
                developer.getSkills().add(skill);
            }
            developerRepository.save(developer);
            model.addAttribute("developer", developerRepository.findOne(id));
            model.addAttribute("skills", skillRepository.findAll());
            return "redirect:/developers/view/" + developer.getId();
        }

        model.addAttribute("developers", developerRepository.findAll());
        return "redirect:/developers";
    }





}
