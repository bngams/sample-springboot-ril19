package fr.cesi.rila19.samplespringdemo.controllers.api;

import fr.cesi.rila19.samplespringdemo.exceptions.FileBadFormatException;
import fr.cesi.rila19.samplespringdemo.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
public class FileController {

    private FileService fService;

    @Autowired
    FileController(FileService fService) {
        this.fService = fService;
    }

    @PostMapping("/uploadFile")
    public void uploadFile(@RequestParam("file") MultipartFile file) {
        // operations sur le fichier
        // ex: verification nom , format, etc...
        // file.getOriginalFilename()
        try {
            fService.checkFile(file);
            // fService.doTreatment(file);
        } catch (FileBadFormatException e) {
            e.getFilename();
        }

    }

    @PostMapping("/uploadFileBis")
    public void uploadFileWithExceptionHandler(@RequestParam("file") MultipartFile file)
        throws FileBadFormatException, RuntimeException {
        fService.checkFile(file);
    }


}
