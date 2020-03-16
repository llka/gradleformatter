package ru.ilka.gradleformatter;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class FormattingService {
    private static final String SINGLE_QUOTED_SUBSTRING_REGEX = "'[0-9a-zA-z_\\.\\-:]*'";

    public String toShortFormat(String dependency) {
        List<String> allMatches = new ArrayList<>(3);
        Matcher matcher = Pattern.compile(SINGLE_QUOTED_SUBSTRING_REGEX).matcher(dependency);
        while (matcher.find()) {
            allMatches.add(matcher.group().replaceAll("'", ""));
        }

        return "(\"" + String.join(":", allMatches) + "\")";
    }
}
