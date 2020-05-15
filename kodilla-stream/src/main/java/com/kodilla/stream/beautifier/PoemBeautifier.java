package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String text, PoemDecorator poemDecorator){
        String moreBeatifulText = poemDecorator.decorate(text);
        return moreBeatifulText;
    }
}
