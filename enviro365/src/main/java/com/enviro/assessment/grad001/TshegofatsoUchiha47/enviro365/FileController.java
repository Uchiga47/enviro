package com.enviro.assessment.grad001.TshegofatsoUchiha47.enviro365;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    private final FileProcessor fileProcessor;

    @Autowired
    public FileController(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    @GetMapping("/processFile")
    public String processFile(@RequestParam String fileName) {
        return fileProcessor.processFile(fileName);
    }
}
