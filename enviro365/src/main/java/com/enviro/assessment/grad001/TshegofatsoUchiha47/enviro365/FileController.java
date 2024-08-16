package com.enviro.assessment.grad001.TshegofatsoUchiha47.enviro365;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.ApiOperation;

@RestController
public class FileController {

    @Autowired
    public FileController(FileProcessor fileProcessor) {
    }
    /**
     * @api {post} /upload Upload a file
     * @apiName UploadFile
     * @apiGroup File
     * @apiDescription This endpoint allows users to upload a file for processing.
     *
     * @apiParam {File} file The file to be uploaded.
     *
     * @apiSuccess {String} message Success message.
     * @apiSuccess {String} fileName The name of the uploaded file.
     *
     * @apiError FileTooLarge The file is too large.
     * @apiError InvalidFileFormat The file format is not supported.
     */
    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
        // Logic to handle file upload
        return ResponseEntity.ok("File uploaded successfully");
    }
    /**
     * @api {get} /data Retrieve all data
     * @apiName GetAllData
     * @apiGroup Data
     * @apiDescription This endpoint retrieves a list of all environmental data.
     *
     * @apiSuccess {Object[]} dataList List of environmental data.
     * @apiSuccess {String} dataList.id The unique ID of the data entry.
     * @apiSuccess {String} dataList.type The type of environmental data.
     * @apiSuccess {String} dataList.value The value of the environmental data.
     * @apiSuccess {Date} dataList.timestamp The timestamp when the data was recorded.
     *
     * @apiError DataNotFound No data found in the database.
     */
    @ApiOperation(value = "Retrieve all files", notes = "This endpoint retrieves all files from the database.")
    @GetMapping("/processFile")
    public ResponseEntity<List> getAllData() {
        List dataList = dataService.getAllData();
        return ResponseEntity.ok(dataList);
    }
}
