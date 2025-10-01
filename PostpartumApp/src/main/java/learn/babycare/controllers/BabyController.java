package learn.babycare.controllers;

import learn.babycare.domain.BabyService;
import learn.babycare.models.Baby;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baby")
public class BabyController {

    private final BabyService service;

    public BabyController(BabyService service) {
        this.service = service;
    }

    @GetMapping("/{babyId}")
    public ResponseEntity<Baby> findById(@PathVariable int babyId) {
        Baby baby = service.findById(babyId);
        if(baby == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(baby);
    }
}
