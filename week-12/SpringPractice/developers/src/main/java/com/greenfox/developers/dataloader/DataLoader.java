package com.greenfox.developers.dataloader;

import com.greenfox.developers.models.Developer;
import com.greenfox.developers.models.Skill;
import com.greenfox.developers.repositories.DeveloperRepository;
import com.greenfox.developers.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ${SzilviaB} on 2017. 01. 22..
 */
@Component
public class DataLoader implements CommandLineRunner {

    private SkillRepository skillRepository;
    private DeveloperRepository developerRepository;

    @Autowired
    public DataLoader(SkillRepository skillRepository, DeveloperRepository developerRepository) {
        this.skillRepository = skillRepository;
        this.developerRepository = developerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Skill javascript = new Skill("javascript", "Javascript language skill");
        Skill ruby = new Skill("ruby", "Ruby language skill");
        Skill emberjs = new Skill("emberjs", "Emberjs framework");
        Skill angularjs = new Skill("angularjs", "Angularjs framework");

        skillRepository.deleteAll();
        skillRepository.save(javascript);
        skillRepository.save(ruby);
        skillRepository.save(emberjs);
        skillRepository.save(angularjs);

        List<Developer> developers = new LinkedList<Developer>();
        developers.add(new Developer("John", "Smith", "john.smith@example.com",
                Arrays.asList(new Skill[] { javascript, ruby })));
        developers.add(new Developer("Mark", "Johnson", "mjohnson@example.com",
                Arrays.asList(new Skill[] { emberjs, ruby })));
        developers.add(new Developer("Michael", "Williams", "michael.williams@example.com",
                Arrays.asList(new Skill[] { angularjs, ruby })));
        developers.add(new Developer("Fred", "Miller", "f.miller@example.com",
                Arrays.asList(new Skill[] { emberjs, angularjs, javascript })));
        developers.add(new Developer("Bob", "Brown", "brown@example.com",
                Arrays.asList(new Skill[] { emberjs })));
        developerRepository.deleteAll();
        developerRepository.save(developers);
    }
}
