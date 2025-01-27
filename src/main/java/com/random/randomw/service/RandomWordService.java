package com.random.randomw.service;
import com.random.randomw.entity.Word;
import com.random.randomw.repository.WordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Random;
import java.util.List;


@Service
public class RandomWordService {

    @Autowired
    private WordRepository wordRepository;

    public Word getRandomWord() {
        List<Word> words = wordRepository.findAll();

        if(words.isEmpty()){
            return null;
        }

        Random random = new Random();
        return words.get(random.nextInt(words.size()));

    }

}
