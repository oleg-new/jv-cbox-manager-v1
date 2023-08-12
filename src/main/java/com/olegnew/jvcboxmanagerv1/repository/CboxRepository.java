package com.olegnew.jvcboxmanagerv1.repository;

import com.olegnew.jvcboxmanagerv1.model.cbox.Cbox;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CboxRepository extends JpaRepository<Cbox, Long> {
    Optional<Cbox> findCboxByStreetAndHouse(String street, String house);
}
