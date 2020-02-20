package fr.cesi.rila19.samplespringdemo.exceptions;

import lombok.Getter;

@Getter
public class FileBadFormatException extends Exception {

    private String filename;
    private int errorCode;

    public FileBadFormatException(String filename) {
        super();
        this.filename = filename;
    }
}
