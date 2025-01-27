package com.random.randomw.service;

import com.random.randomw.entity.Word;
import com.random.randomw.repository.wordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WordService {

    @Autowired
    private wordRepository wordRepository;

    public Word saveWord(Word word) {
        return wordRepository.save(word);
    }

    public List<Word> getAllWords(){
        return wordRepository.findAll();
    }

    public Optional<Word> getWordByID(Long id) {
        return wordRepository.findById(id);
    }

    public void deleteWord(Long id) {
        wordRepository.deleteById(id);
    }




}
