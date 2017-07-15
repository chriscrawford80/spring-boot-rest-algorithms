package com.example.RestAlgorithms.controller;

import com.example.RestAlgorithms.model.SortResult;
import com.example.RestAlgorithms.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SortController {


    private SortService sortService;

    @Autowired
    public void setSortService(SortService sortService) {
        this.sortService = sortService;
    }

    @RequestMapping(value="sortStrings", method= RequestMethod.POST,
    consumes = "application/json")
    public List<String> stringSort(@RequestBody ArrayList<String> listToSort){
        sortService.lambdaSort(listToSort);
        System.out.println(listToSort);
        return listToSort;
    }
}
