package com.recipe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.foodrecipe.entity.Admin;
import com.foodrecipe.repo.AdminRepository;

@SpringBootTest
class FoodRecipe1ApplicationTests {

	@Autowired
	AdminRepository aRepo;
	@Test
	public void AdminTest() {
		
		Admin a=new Admin();
		a.setId(2);;
		a.setUsername("Shiva");
		a.setPassword("12345");
		aRepo.save(a);
	}
		@Test
		public void AdminTest2() {
			
		Admin b=new Admin();
		b.setId(3);
		b.setUsername("Hemanth");
		b.setPassword("12345");
		aRepo.save(b);
		
	
		
	}

}
