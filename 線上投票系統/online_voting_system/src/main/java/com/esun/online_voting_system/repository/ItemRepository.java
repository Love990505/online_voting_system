package com.esun.online_voting_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.esun.online_voting_system.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
