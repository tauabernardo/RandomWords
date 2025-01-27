package com.random.randomw.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String englishWord;

    @Column(nullable = false)
    private String portugueseTranslation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getPortugueseTranslation() {
        return portugueseTranslation;
    }

    public void setPortugueseTranslation(String portugueseTranslation) {
        this.portugueseTranslation = portugueseTranslation;
    }
}
