package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;

import javax.swing.text.html.ListView;
import java.util.Observable;

public class Controller {
    private Task<ObservableList<String>> task;
    @FXML
    private ListView listView;
    public void initialize(){
        task=new Task<ObservableList<String>>(){
            protected ObservableList<String> call() throws Exception{
                Thread.sleep(1000);
                ObservableList<String>employees = FXCollections.observableArrayList("Angajat 1",
                        "Angajat 2",
                        "Angajat 3",
                        "Angajat 4",
                        "Angajat 5"

                );
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        listView.setItems(employees);
                    }
                });
return employees;
            }
        };
    }
    @FXML
    public void buttonPressed(){
new Thread(task).start();
    }
}

