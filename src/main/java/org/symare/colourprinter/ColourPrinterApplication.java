package org.symare.colourprinter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.symare.colourprinter.services.ColourPrinter;

@SpringBootApplication
public class ColourPrinterApplication implements CommandLineRunner {

    private ColourPrinter colourPrinter;

    public ColourPrinterApplication(ColourPrinter colourPrinter) {
        this.colourPrinter = colourPrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColourPrinterApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(colourPrinter.print());
    }
}
