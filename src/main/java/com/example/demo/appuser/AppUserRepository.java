package com.example.demo.appuser;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

@Repository
@Transactional()
public interface AppUserRepository
        extends JpaRepository<AppUser, Long>{

    Optional<AppUser> findByEmail(String email);

}
