package com.logback.logback.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServicioImpl implements Servicio {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicioImpl.class);

    @Override
    public void doStuff(String value) {
        LOGGER.trace("doStuff necesita mas informacion - {}", value);
        LOGGER.debug("doStuff necesita debugear - {}",value);
        LOGGER.info("doStuff took info - {}",value);
        LOGGER.warn("doStuff necesita advertir - {}",value);
        LOGGER.error("doStuff encontro un error con valor - {}",value);
    }
}
