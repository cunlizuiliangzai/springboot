package com.liujia.springdatajpa.dao;

import com.liujia.springdatajpa.entity.App;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface AppDao  extends JpaRepository<App, Long>, Serializable {


}
