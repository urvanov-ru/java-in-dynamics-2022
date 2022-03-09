package ru.urvanov.javaindynamics2022.creatures.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;
import ru.urvanov.javaindynamics2022.creatures.domain.Creature;
import ru.urvanov.javaindynamics2022.creatures.repository.CreatureRepository;

@Service
public class CreatureServiceImpl implements CreatureService {

    @Autowired
    private CreatureRepository creatureRepository;

    @Override
    @Transactional
    public Mono<Long> create(Creature creature) {
        return creatureRepository.save(creature).map(Creature::getId);
    }

    @Override
    @Transactional
    public void update(Creature creature) {
        creatureRepository.save(creature);
    }

    @Override
    @Transactional(readOnly = true)
    public Mono<Creature> getById(Long creatureId) {
        return creatureRepository.findById(creatureId);
    }

    @Override
    @Transactional
    public void delete(Long creatureId) {
        creatureRepository.deleteById(creatureId);
    }
}
