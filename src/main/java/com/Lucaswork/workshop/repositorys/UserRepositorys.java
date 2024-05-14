package com.Lucaswork.workshop.repositorys;

import com.Lucaswork.workshop.entities.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorys extends JpaRepository<User,Long> {

}
