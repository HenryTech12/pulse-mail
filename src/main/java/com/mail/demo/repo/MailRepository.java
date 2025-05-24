package com.mail.demo.repo;

<<<<<<< HEAD
import com.mail.demo.model.MailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MailRepository extends JpaRepository<MailModel, Long> {
    Optional<List<MailModel>> findByType(String type);
=======
public interface MailRepository extends JpaRepository<MailModel, Long> {


>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
}