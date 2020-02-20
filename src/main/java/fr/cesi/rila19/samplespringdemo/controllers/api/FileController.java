package fr.cesi.rila19.samplespringdemo.controllers.api;

import fr.cesi.rila19.samplespringdemo.exceptions.FileBadFormatException;
import fr.cesi.rila19.samplespringdemo.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
            fService.doTreatment(file);
        } catch (FileBadFormatException e) {
            e.getFilename();
            e.printStackTrace();
        }

    }
}
