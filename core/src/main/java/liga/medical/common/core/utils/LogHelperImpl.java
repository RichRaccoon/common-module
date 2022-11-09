package liga.medical.common.core.utils;

import liga.medical.common.core.api.LogHelper;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class LogHelperImpl implements LogHelper {
    @Override
    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
