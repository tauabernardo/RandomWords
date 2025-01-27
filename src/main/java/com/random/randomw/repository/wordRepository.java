package com.random.randomw.repository;

import com.random.randomw.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface wordRepository extends JpaRepository<Word, Long> {


}
