package com.example.demo.respository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.user;
@Repository
public interface registrationrepo extends JpaRepository<user,Long>{
public user findByEmail(String email);

public user findByEmailAndPassword(String email, String passwoed);
 List<user> findAll();
}

