package ru.urvanov.javaindynamics2022.creatures.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import ru.urvanov.javaindynamics2022.creatures.domain.Creature;
import ru.urvanov.javaindynamics2022.creatures.service.CreatureService;

@RestController
@RequestMapping("/creatures")
public class CreaturesController {

    @Autowired
    private CreatureService creatureService;

    private Logger logger
            = LoggerFactory.getLogger(CreaturesController.class);

    @PostMapping
    public Mono<Long> create(@RequestBody Creature creature) {
        logger.debug("Создание существа");
        return creatureService.create(creature);
    }

    @PutMapping("{creatureId}")
    public Mono<Void> update(@PathVariable Long creatureId, @RequestBody Creature creature) {
        logger.debug("Обновление информации о существе");
        creature.setId(creatureId);
        creatureService.update(creature);
        return Mono.empty();
    }

    @GetMapping("{creatureId}")
    public Mono<Creature> info(@PathVariable Long creatureId) {
        logger.debug("Получение информации о существе");
        return creatureService.getById(creatureId);
    }

    @DeleteMapping("{creatureId}")
    public Mono<Void> delete(@PathVariable Long creatureId) {
        logger.debug("Удаление существа");
        return creatureService.delete(creatureId);
    }
}
