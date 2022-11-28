package com.howcute.howcuteproject.data.repository;

import com.howcute.howcuteproject.data.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {
}
