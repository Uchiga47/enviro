package com.enviro.assessment.grad001.TshegofatsoUchiha47.enviro365;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class FileProcessor {

    public String processFile(MultipartFile file) throws IOException {
        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }
        }

        return result.toString();
    }
}
