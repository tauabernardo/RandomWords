package com.random.randomw.repository;

import com.random.randomw.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {


}
