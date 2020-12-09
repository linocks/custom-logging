package com.linocks.customlogging.config;

import io.reflectoring.descriptivelogger.DescriptiveLogger;
import io.reflectoring.descriptivelogger.LogMessage;
import org.slf4j.event.Level;

@DescriptiveLogger
public interface MyLogger {

    @LogMessage(message = "{}", level = Level.INFO, id = 154454)
    void info(String s);

    @LogMessage(message = "{}", level = Level.TRACE, id = 154455)
    void trace(String s);

    @LogMessage(message = "{}", level = Level.ERROR, id = 154456)
    void error(String s);

    @LogMessage(message = "{}", level = Level.DEBUG, id = 154457)
    void debug(String s);

    @LogMessage(message = "{}", level = Level.WARN, id = 154458)
    void warn(String s);
}
