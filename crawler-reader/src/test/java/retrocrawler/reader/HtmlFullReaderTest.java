package retrocrawler.reader;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class HtmlFullReaderTest {

    @Test
    public void read_givenFullHtmlPage_returnsSameHtmlPage() throws IOException {
        String expected = HtmlTestData.HTML;
        Reader reader = new InputStreamReader(
                new ByteArrayInputStream(expected.getBytes())
        );

        String actual = new HtmlFullReader().read(reader);

        assertThat(actual, is(equalTo(expected)));
    }
}