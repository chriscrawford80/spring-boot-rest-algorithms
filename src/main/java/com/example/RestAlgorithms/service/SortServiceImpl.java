package com.example.RestAlgorithms.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by chris on 7/14/17.
 */
@Service
public class SortServiceImpl implements SortService {
    @Override
    public void lambdaSort(List<String> listToSort) {
        Collections.sort(listToSort, (s1, s2) -> s1.compareTo(s2));
    }
}
