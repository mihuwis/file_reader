package com.mihuwis.file_reader.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PoKeMoNcAsE {
    public String pokemonize(String word) {
        List<String> listOfChars = Arrays.asList(word.split(""));

        return IntStream.range(0, listOfChars.size())
                .mapToObj(n -> n % 2 == 0
                        ? listOfChars.get(n).toUpperCase()
                        : listOfChars.get(n))
                .collect(Collectors.joining());
    }

}
