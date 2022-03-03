package ru.urvanov.javaindynamics2022.creatures.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.urvanov.javaindynamics2022.creatures.domain.Creature;

@Service
public class CreatureServiceImpl implements CreatureService {
    @Override
    public Mono<Long> create(Creature creature) {
        return null;
    }

    @Override
    public void update(Creature creature) {

    }

    @Override
    public Mono<Creature> getById(Long creatureId) {
        return null;
    }
}
