package org.example.statistics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

import javax.swing.event.SwingPropertyChangeSupport;

import org.example.statistics.model.TextStatistics;

public class TextStatisticsService {
    public TextStatistics getStatistics(String text) {
        // TODO
        // Please use Streams
        // getting string from the input and will be splitting on space to get all the words
        List<String> data = Arrays.asList(text.replaceAll("[^a-zA-Z0-9]", " ").split("\\s+"));
        // doing some statistics on
        System.out.println(data);
        return null;
        
    }

}
