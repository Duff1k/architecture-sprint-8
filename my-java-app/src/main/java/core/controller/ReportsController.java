package core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping(produces = {APPLICATION_JSON_VALUE})
@RestController
public class ReportsController {

    @GetMapping("/reports")
    public ResponseEntity<List<String>> getNotes() {
        List<String> reports = new ArrayList<>();
        reports.add(String.valueOf(Math.random()));
        reports.add(String.valueOf(Math.random()));
        reports.add(String.valueOf(Math.random()));
        return ResponseEntity.ok().body(reports);
    }

}
