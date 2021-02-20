package com.fileupload.file.controller;

import com.fileupload.file.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;
    /*
    Spring provides a MultipartFile interface to handle HTTP multi-part requests for uploading files.
    Multipart-file requests break large files into smaller chunks which makes it efficient for file uploads.
     */
    @PostMapping
    @CrossOrigin(origins = "*" ,allowedHeaders = "*")
    public void uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        fileUploadService.uploadFile(file);
    }
}
