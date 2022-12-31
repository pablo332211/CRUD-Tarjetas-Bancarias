package com.BancoPichincha.demo.Repository;
import com.BancoPichincha.demo.Entity.Estados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estados, Long> {
}
