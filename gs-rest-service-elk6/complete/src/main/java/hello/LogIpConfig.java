package hello;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LogIpConfig extends ClassicConverter {
    private static final Logger logger = LoggerFactory.getLogger(LogIpConfig.class);

    @Override
    public String convert(ILoggingEvent event) {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            logger.error("### Get Host IP Error!! ###", e);
        }
        return null;
    }
}