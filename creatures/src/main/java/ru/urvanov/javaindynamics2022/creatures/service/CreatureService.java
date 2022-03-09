package ru.urvanov.javaindynamics2022.creatures.service;

import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;
import ru.urvanov.javaindynamics2022.creatures.domain.Creature;

public interface CreatureService {
    Mono<Long> create(Creature creature);

    void update(Creature creature);

    Mono<Creature> getById(Long creatureId);

    @Transactional
    void delete(Long creatureId);
}
