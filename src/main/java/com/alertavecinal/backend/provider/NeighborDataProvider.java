package com.alertavecinal.backend.provider;

import com.alertavecinal.backend.repository.NeighborRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class NeighborDataProvider implements NeighborProvider {

    @Autowired
    private NeighborRepository neighborRepository;



}
