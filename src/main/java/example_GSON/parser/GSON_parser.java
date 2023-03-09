package example_GSON.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import example_GSON.entity.CurrencyRate;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Currency;

public class GSON_parser {
    public static void parseJson(String url) throws IOException {

        GsonBuilder gsonBuilder =new GsonBuilder();
        gsonBuilder.setPrettyPrinting();//коректное отображение
        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));

        CurrencyRate [] currencyRates = gson.fromJson(jsonReader, CurrencyRate [].class );
            for (CurrencyRate currencyRate: currencyRates){
                System.out.println(currencyRate);
            }

            String gsonString = gson.toJson(currencyRates);
        Files.write(Paths.get("C:\\program1\\json\\src\\main\\resources\\gsonCurrency.json"),
                gsonString.getBytes(), StandardOpenOption.CREATE);


    }
}
