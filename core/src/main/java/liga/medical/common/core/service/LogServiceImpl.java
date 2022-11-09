package liga.medical.common.core.service;

import liga.medical.common.core.api.LogService;
import liga.medical.common.core.api.LogHelper;
import liga.medical.common.core.entity.LogEntity;
import liga.medical.common.core.repository.LogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogServiceImpl implements LogService {
    private final LogRepository logRepository;
    private final LogHelper logHelper;

    public LogServiceImpl(LogRepository logRepository, LogHelper logHelper) {
        this.logRepository = logRepository;
        this.logHelper = logHelper;
    }

    @Override
    public void logController(int systemTypeId, String className, String methodName, String methodArgs) {
        LogEntity logEntity = new LogEntity();
        logEntity.setUuid(logHelper.getUUID());
        logEntity.setSystemTypeId(systemTypeId);
        logEntity.setMethodParams(methodArgs);

        logRepository.save(logEntity);

        log.info("Вызван метод: " + className + " : " + methodName + " с аргументами " + methodArgs + " из сервиса " + systemTypeId);
    }
}
