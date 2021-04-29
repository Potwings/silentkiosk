package org.judy.silentkiosk.store.repository;

import org.judy.silentkiosk.store.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query("select m from Menu m where m.mno=:mno")
    Menu getMenu(Long mno);
}
