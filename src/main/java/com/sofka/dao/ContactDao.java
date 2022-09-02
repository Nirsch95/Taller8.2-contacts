package com.sofka.dao;

import com.sofka.domain.Contact;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ContactDao extends CrudRepository<Contact, Long>{
    @Modifying
    @Query("update Contact cont set cont.name = :name where cont.id = :id")
    public void updateName(
            @Param(value = "id") Long id,
            @Param(value = "name") String name
    );

    @Modifying
    @Query("update Contact cont set cont.cell = :cell where cont.id = :id")
    public void updateCell(
            @Param(value = "id") Long id,
            @Param(value = "cell") String cell
    );

    @Modifying
    @Query("update Contact cont set cont.dateBirth = :dateBirth where cont.id = :id")
    public void updateDateBirth(
            @Param(value = "id") Long id,
            @Param(value = "dateBirth") String dateBirth
    );

    @Modifying
    @Query("update Contact cont set cont.dateCreate = :dateCreate where cont.id = :id")
    public void updateDateCreate(
            @Param(value = "id") Long id,
            @Param(value = "dateCreate") String dateCreate
    );

    @Modifying
    @Query("update Contact cont set cont.dateDelete = :dateDelete where cont.id = :id")
    public void updateDateDelete(
            @Param(value = "id") Long id,
            @Param(value = "dateDelete") String dateDelete
    );
}
