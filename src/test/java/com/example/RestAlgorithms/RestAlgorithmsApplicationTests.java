package com.example.RestAlgorithms;

import com.example.RestAlgorithms.service.SortService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;
import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestAlgorithmsApplicationTests {

	@Autowired
	public void setSortService(SortService sortService) {
		this.sortService = sortService;
	}

	SortService sortService;

	List<String> listToSort = new ArrayList<>();

	@Before
	public void addStrings(){
		listToSort.add("Ajeet");
		listToSort.add("Harry");
		listToSort.add("Chaitanya");
		listToSort.add("Steve");
		listToSort.add("Anuj");

	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void lambdaSortTest(){
		sortService.lambdaSort(listToSort);
		assertTrue(Ordering.natural().isOrdered(listToSort));
	}

}
