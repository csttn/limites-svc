package com.coffeeandit.limitessvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.coffeeandit.limitessvc.entity.LimiteDiario;
import com.coffeeandit.limitessvc.repository.LimiteDiarioRepository;




@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {LimiteDiarioRepository.class, LimiteDiarioRepository.class})
@EntityScan(basePackageClasses = {LimiteDiario.class, LimiteDiario.class})
public class LimitesSvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(LimitesSvcApplication.class, args);
    }

}


