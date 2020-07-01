package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movieShow = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(movieShow + " !");
    }
}