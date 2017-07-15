package com.example.RestAlgorithms.service;

import com.example.RestAlgorithms.model.SortResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public interface SortService {

    void lambdaSort(List<String> listToSort);
}
