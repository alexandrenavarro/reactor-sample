package com.github.alexandrenavarro.reactorsample;

import lombok.extern.slf4j.Slf4j;
import reactor.bus.Event;
import reactor.bus.EventBus;

import static reactor.bus.selector.Selectors.$;

/**
 * Created by anavarro on 21/02/17.
 */

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("started");

        final EventBus eventBus = EventBus.create();
        eventBus.on($("subject"), event -> log.info("e:{}", event));
        eventBus.notify("subject", Event.wrap("test"));
        eventBus.notify("subject", Event.wrap("test2"));

        log.info("stop");

    }


}
