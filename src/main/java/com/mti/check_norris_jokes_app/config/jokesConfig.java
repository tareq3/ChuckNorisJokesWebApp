
package com.mti.check_norris_jokes_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * jokesConfig
 */
@Configuration
public class jokesConfig {

    
    @Bean
    ChuckNorrisQuotes getChuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
    
}