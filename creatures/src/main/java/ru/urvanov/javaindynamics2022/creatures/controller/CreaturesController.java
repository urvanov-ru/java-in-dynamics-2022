package ru.urvanov.javaindynamics2022.creatures.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/creatures")
public class CreaturesController {

    private Logger logger = LoggerFactory.getLogger(CreaturesController.class);

    @PostMapping
    public void create() {
        logger.debug("Создание существа");
    }

    @PutMapping("{creatureId}")
    public void update(@PathVariable Long creatureId) {
        logger.debug("Обновление информации о существе");
    }

    @GetMapping("{creatureId}")
    public void info(@PathVariable Long creatureId) {
        logger.debug("Получение информации о существе");
    }

    @DeleteMapping("{creatureId}")
    public void delete(@PathVariable Long creatureId) {
        logger.debug("Удаление существа");
    }
}
