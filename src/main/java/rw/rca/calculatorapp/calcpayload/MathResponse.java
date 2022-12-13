package rw.rca.calculatorapp.calcpayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MathResponse {
    private Boolean success;
    private String message;
    private Object data;

    public MathResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public MathResponse(Boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public static MathResponse success(Object data) {
        return new MathResponse(true, data);
    }

    public static MathResponse fail(Object data) {
        return new MathResponse(false, data);
    }

    public static MathResponse success(String message) {
        return new MathResponse(true, message);
    }

    public static MathResponse fail(String message) {
        return new MathResponse(false, message);
    }
}
