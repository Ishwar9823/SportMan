package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.SportMan;

@Repository
public interface Repository1 extends JpaRepository<SportMan,Integer>{

}
