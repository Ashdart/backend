package com.alertavecinal.backend.repository;

import com.alertavecinal.backend.model.Neighbor;
import org.springframework.data.repository.CrudRepository;

public abstract class NeighborRepository implements CrudRepository<Neighbor, Long> {
}
