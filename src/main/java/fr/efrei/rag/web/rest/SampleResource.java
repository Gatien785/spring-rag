package fr.efrei.rag.web.rest;

//import net.filecode.rag.web.dto.sample;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleResource {

    @GetMapping("/sample/{value}")
    public String hello(@PathVariable(value = "value", required = false) final String value){
        return "Hello " + value + "!";
    }
}