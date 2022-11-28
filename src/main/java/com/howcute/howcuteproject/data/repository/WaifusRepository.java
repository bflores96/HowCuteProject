package com.howcute.howcuteproject.data.repository;

import com.howcute.howcuteproject.data.entity.Waifus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaifusRepository extends JpaRepository<Waifus,Integer> {

}
