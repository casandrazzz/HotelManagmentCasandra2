package test.serviceTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import repository.GuestRepository;
import service.GuestCSVParser;
import service.GuestCSVReader;
import service.GuestService;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertThrows;

class GuestServiceTest {
    @Mock
    private static GuestRepository guestRepository;

    @Mock
    private static GuestCSVParser parser;

    @Mock
    private static GuestCSVReader reader;

    @BeforeAll
    static void setup() {
        GuestService guestService = new GuestService(guestRepository);
        parser = new GuestCSVParser ();
        reader = new GuestCSVReader ();

    }


    @Test
    void test_FileNotFoundException_isThrown() {
        assertThrows ( FileNotFoundException.class, () -> {
            String fileName = "";
            new FileInputStream ( fileName );
        } );
    }

    @Test
    void test_NullPointerException_isThrown() {
        assertThrows ( NullPointerException.class, () -> {
            String fileName = null;
            new FileInputStream (Objects.requireNonNull(fileName));
        } );
    }

    @Test
    void should_readRules() {
        Charset charset = Charset.forName ( "UTF8" );
        Path path = Paths.get ( "Rules.txt" );
        try (BufferedReader reader = Files.newBufferedReader ( path, charset )) {
            String line;

            while (true) {
                if (reader.readLine () == null) break;
            }
        } catch (IOException e) {
            e.printStackTrace ();


        }
    }
}

