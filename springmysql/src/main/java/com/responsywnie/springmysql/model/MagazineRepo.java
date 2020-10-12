package com.responsywnie.springmysql.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface MagazineRepo extends JpaRepository<Magazine,Long> {
}
