package com.api.shoppinglist.repositories;

import com.api.shoppinglist.models.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemRepository extends JpaRepository<ItemModel, Long> {
}
