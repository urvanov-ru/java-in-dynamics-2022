package ru.urvanov.javaindynamics2022.creatures.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.urvanov.javaindynamics2022.creatures.domain.Creature;

public interface CreatureRepository extends ReactiveCrudRepository<Creature, Long> {
}
