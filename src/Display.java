import com.healthmarketscience.jackcess.*;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

/**
 * Created by ducdoan on 1/4/17.
 */
public class Display {
    Database printRecord = null;

    public static void main(String[] args) {

      initialize();
    }

    public static void initialize(){
        DBController dbController = new DBController("BballPlayers.accdb");
       // dbController.createRecord();
       // dbController.updateRecord();
       // dbController.deleteRecord();
       // dbController.searchRecord();

        dbController.readRecord(); // this is created on PC
        //this is created on mac
        //haha I got this - From PC Good Job!
    }
}