package com.studenthub.api.repository;

import com.studenthub.api.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, UUID> {
}
