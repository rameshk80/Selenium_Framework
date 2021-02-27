package SelWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelFileAccess {
    private String inputFileName;

    ExcelFileAccess()
    {
        inputFileName = "/Users/rasandesh/Code/Java/src/SelWork/TestCases.xlsx";
    }

    private void openFile()
    {
        FileInputStream inputFile;
        try {
            inputFile = new FileInputStream(inputFileName);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
