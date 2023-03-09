package example_GSON;

import example_GSON.parser.GSON_parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GSON_parser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
