package com.example.RestAlgorithms.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
public class SortServiceImpl implements SortService {
    @Override
    public void lambdaSort(List<String> listToSort) {
        listToSort.sort((Comparator.naturalOrder()));
    }

}
