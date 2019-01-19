package com.ilkayaktas.springexperiment.config;

import com.ilkayaktas.springexperiment.model.Item;
import com.ilkayaktas.springexperiment.model.ItemImpl;
import com.ilkayaktas.springexperiment.model.Model;
import com.ilkayaktas.springexperiment.model.ModelImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by iaktas on 18.01.2019 at 11:55.
 */

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = "singleton")
    public Item item() {
        return new ItemImpl("Item implementation");
    }

    @Bean
    public Model model(){
        return new ModelImpl("Model implementation");
    }

}
