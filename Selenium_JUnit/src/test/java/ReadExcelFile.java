import com.sun.media.sound.InvalidFormatException;
import org.junit.Test;

import java.io.IOException;

public class ReadExcelFile extends DriverSetup {

    @Test
    public void readExcelFile() throws IOException, InvalidFormatException {
        String filePath = ".\\src\\test\\resources";
        ReadFromExcel.readFromExcel(filePath, "ExportExcel.xls", "Sheet1");
    }
}
