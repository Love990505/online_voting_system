package com.esun.online_voting_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.esun.online_voting_system.controller.ItemController;
import com.esun.online_voting_system.entity.Item;
import com.esun.online_voting_system.repository.ItemRepository;

@SpringBootApplication
@ComponentScan(basePackageClasses = ItemController.class)
public class OnlineVotingSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OnlineVotingSystemApplication.class, args);
	}

	@Autowired
	private ItemRepository ItemRepository;

	@Override
	public void run(String... args) throws Exception {

		Item Item1 = Item.builder()
				.itemName("電腦")
				.build();

		Item Item2 = Item.builder()
				.itemName("滑鼠")
				.build();

		ItemRepository.save(Item1);
		ItemRepository.save(Item2);

	}

}
