package com.mail.demo.repo;

import com.mail.demo.model.MailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MailRepository extends JpaRepository<MailModel, Long> {
    Optional<List<MailModel>> findByType(String type);
}