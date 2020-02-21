package fr.cesi.rila19.samplespringdemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {

    private String msg;
    private Integer code;


}
