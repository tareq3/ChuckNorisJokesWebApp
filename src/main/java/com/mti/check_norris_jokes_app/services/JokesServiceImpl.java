
package com.mti.check_norris_jokes_app.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * JokesServiceImpl
 */
@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    } 

    @Override
    public String getJokes() {
        // TODO Auto-generated method stub
        return chuckNorrisQuotes.getRandomQuote();
    }

   

    
}