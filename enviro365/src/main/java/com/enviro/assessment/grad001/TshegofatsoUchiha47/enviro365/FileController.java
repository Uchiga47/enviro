package com.enviro.assessment.grad001.TshegofatsoUchiha47.enviro365;

import org.mozilla.javascript.tools.idswitch.FileBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FileController {
	

	 private final FileController fileService;

	    @Autowired
	    public FileController(FileController fileService) {
	        this.fileService = fileService;
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<String> getFileById(@PathVariable String id) {
	        String file = fileService.toString();
	        if (file == null) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.status(file);
	    }
    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("File is empty");
        }

        // Process the file as needed
        String fileContents = "File uploaded successfully: " + file.getOriginalFilename();
        
        return ResponseEntity.ok(fileContents);
    }
}
