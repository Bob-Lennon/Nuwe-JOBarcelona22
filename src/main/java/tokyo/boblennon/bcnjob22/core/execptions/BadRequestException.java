package tokyo.boblennon.bcnjob22.core.execptions;

import java.util.HashMap;
import java.util.Map;

public class BadRequestException extends HttpException {
    private final Map<String, String> map = new HashMap<String, String>();

    public BadRequestException() {
        this("Bad Request");
    }

    public BadRequestException(String message) {
        super(400, message);
    }

    public Map<String, String> getExceptions() {
        return this.map;
    }

    public void addException(String key, String message) {
        this.map.put(key, message);
    }
}