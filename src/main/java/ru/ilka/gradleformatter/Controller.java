package ru.ilka.gradleformatter;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class Controller {
    private final FormattingService formattingService;

    @GetMapping(path = "/format")
    public String toShortFormat(@RequestParam(name = "dependency") String dependency) {
        return formattingService.toShortFormat(dependency);
    }
}
