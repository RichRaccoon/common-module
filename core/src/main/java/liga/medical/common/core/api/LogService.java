package liga.medical.common.core.api;

public interface LogService {
    void logController(int systemTypeId, String className, String methodName, String methodArgs);
}
