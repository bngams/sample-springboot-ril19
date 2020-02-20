package fr.cesi.rila19.samplespringdemo.services;

import fr.cesi.rila19.samplespringdemo.exceptions.FileBadFormatException;
import org.apache.tomcat.util.http.fileupload.MultipartStream;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Paths;

@Service
public class FileService {

    public void checkFile(MultipartFile file) throws FileBadFormatException {
        if(file.getOriginalFilename().length() < 3 )
                throw new FileBadFormatException(file.getOriginalFilename());
    }

    public boolean checkFileBis(MultipartFile file) {
        if(file.getOriginalFilename().length() < 3 )
            return false;
        // try {
        //
        // } catch() {
        //     return false;
        // }
        return true;
    }

    public void doTreatment(MultipartFile file) throws IOException {
//        File file = Paths.get('....');
//        BufferedReader in = new BufferedReader(new FileReader(file)) {
//
//        }
//
//        /// FileReader, FileInputStream
//        BufferedReader in = new BufferedReader(new InputStreamReader(file.getInputStream()));
//        while(in.readLine()) {
//
//        }
    }
}
