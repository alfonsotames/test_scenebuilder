package com.mycompany.test_scenebuilder;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class PrimaryController implements Initializable {


    XYChart.Series<String, Number> series = new XYChart.Series<>();
    
    @FXML private LineChart chart;

    
    @FXML
    private void switchToSecondary() throws IOException {
        
        App.setRoot("secondary");
    }
    
    @FXML
    private void testFuncion() {
        chart.setTitle("kepazo");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        chart.setTitle("Hola");
        series.setName("Data Series");
        chart.getData().add(series);
        
    }
    
    @FXML
    public void prueba(String p) {
        chart.setTitle(p);
    }
    
    public void graph(String d, Integer r) {
        series.getData().add(new XYChart.Data<>(d,r));
                if (series.getData().size() > 20)
                    series.getData().remove(0);
    }
}
