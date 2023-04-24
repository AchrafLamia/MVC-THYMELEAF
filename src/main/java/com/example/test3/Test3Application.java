package com.example.test3;

import com.example.test3.entities.Patient;
import com.example.test3.repository.PatienRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Test3Application {

    public static void main(String[] args) {
        SpringApplication.run(Test3Application.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner
            (PatienRepository patienRepository){
        return args -> {
            patienRepository.save(new Patient(null,"hassan",new Date(),false,192));
            patienRepository.save(new Patient(null,"hanan",new Date(),true,132));
            patienRepository.save(new Patient(null,"morad",new Date(),true,12));
            patienRepository.save(new Patient(null,"youssef",new Date(),false,132));
            patienRepository.findAll().forEach(p ->{
                System.out.println(p.getNom());
            } );
        };
    }
}
