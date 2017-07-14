package com.example.RestAlgorithms.controller;

import com.example.RestAlgorithms.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 7/14/17.
 */
@RestController
public class SortController {

    @Autowired
    SortService sortService;

    @RequestMapping(value="sortStrings", method= RequestMethod.POST,
    consumes = "application/json")
    public List<String> stringSort(@RequestBody List<String> listToSort){
        sortService.lambdaSort(listToSort);
        return listToSort;
    }
}
