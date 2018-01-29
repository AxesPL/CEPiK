package cepik.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class UzupelnijDaneRequest {

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String PESEL;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String VIN;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String numerRejestracyjny;

}
