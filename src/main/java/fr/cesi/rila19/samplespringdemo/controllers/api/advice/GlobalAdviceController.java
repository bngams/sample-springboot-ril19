package fr.cesi.rila19.samplespringdemo.controllers.api.advice;

import fr.cesi.rila19.samplespringdemo.exceptions.FileBadFormatException;
import fr.cesi.rila19.samplespringdemo.models.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalAdviceController {

    @ExceptionHandler(FileBadFormatException.class)
    public ResponseEntity<ApiError> handleFileBadFormatException(FileBadFormatException e) {
        e.printStackTrace();
        ApiError err = new ApiError("Erreur avec le fichier " + e.getFilename(), 1050);
        return new ResponseEntity<>(err, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
