package com.fileupload.file.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileUploadService {
    public void uploadFile(MultipartFile file) throws IOException {
        file.transferTo(new File("D:\\Programs\\Java\\FileUploaderTest"+file.getOriginalFilename()));

    }
}
