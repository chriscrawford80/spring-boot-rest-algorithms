package com.example.RestAlgorithms.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by chris on 7/14/17.
 */
@Service
public interface SortService {

    void lambdaSort(List<String> listToSort);
}
