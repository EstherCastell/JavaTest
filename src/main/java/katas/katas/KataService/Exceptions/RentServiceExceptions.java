package katas.katas.KataService.Exceptions;

public class RentServiceExceptions extends RuntimeException{
    private String code;

    public String getCode() {
        return code;
    }

    public RentServiceExceptions(String message, String code) {
        super(message);
        this.code = code;
    }
}
