/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoambient;

import java.io.File;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author marce
 */
public class JogoAmbient extends Application {
//    
//    private ImageView imageView;

    private Button btnMetal = new Button();
    private Button btnOrganico = new Button();
    private Button btnPlastico = new Button();
    private Button btnVidro = new Button();
    private Button btnPapel = new Button();
    public Label lVisor = new Label("2");
    Label lPontos = new Label("0");
    private Label lPontosTxt = new Label("Pontos: ");

    Pane pVisor = new Pane();

    @Override
    public void start(Stage stage) {

        pVisor.setPrefSize(500, 500);
    
        AlterarBotoes();
        alterarVisor();

        Pane pPontos = new Pane(lPontos);
        HBox hbPontos = new HBox(10, lPontosTxt, pPontos);

        TilePane tpBotoes = new TilePane(Orientation.HORIZONTAL, btnMetal, btnOrganico, btnPapel, btnPlastico, btnVidro);
        BorderPane bpVisor = new BorderPane(pVisor, hbPontos, null, tpBotoes, null);
        alterarVisor();

        Scene scene = new Scene(bpVisor);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();

        btnMetal.setOnAction(e -> {
            String valor = lVisor.getText();
            String spontos = lPontos.getText();
            if (valor.equals("0")) {

                int iPontos = Integer.parseInt(spontos);
                iPontos += 1;

                lPontos.setText("" + String.valueOf(iPontos));

                alterarVisor();
            } else {
                int numero = Integer.parseInt(spontos);
                numero -= 1;
                if (numero - 1 < 0) {
                    numero = numero + (numero * -1);
                }

                lPontos.setText("" + (numero));
                alterarVisor();
            }
        });
        btnOrganico.setOnAction(e -> {
            String valor = lVisor.getText();
            String pontos = lPontos.getText();

            if (valor.equals("1")) {

                int iPontos = Integer.parseInt(pontos);
                iPontos += 1;

                lPontos.setText("" + String.valueOf(iPontos));
                alterarVisor();
            } else {
                int numero = Integer.parseInt(pontos);
                numero -= 1;
                if (numero - 1 < 0) {
                    numero = numero + (numero * -1);
                }

                lPontos.setText("" + numero);
                alterarVisor();
            }
        });
        btnPapel.setOnAction(e -> {
            String valor = lVisor.getText();

            String pontos = lPontos.getText();
            if (valor.equals("2")) {

                int iPontos = Integer.parseInt(pontos);
                iPontos += 1;

                lPontos.setText("" + String.valueOf(iPontos));
                alterarVisor();
            } else {
                int numero = Integer.parseInt(pontos);
                numero -= 1;
                if (numero - 1 < 0) {
                    numero = numero + (numero * -1);
                }

                lPontos.setText("" + (numero));
                alterarVisor();
            }
        });
        btnPlastico.setOnAction(e -> {
            String valor = lVisor.getText();
            String pontos = lPontos.getText();
            if (valor.equals("3")) {

                int iPontos = Integer.parseInt(pontos);
                iPontos += 1;

                lPontos.setText("" + String.valueOf(iPontos));
                alterarVisor();
            } else {
                int numero = Integer.parseInt(pontos);
                numero -= 1;
                if (numero - 1 < 0) {
                    numero = numero + (numero * -1);
                }

                lPontos.setText("" + (numero));
                alterarVisor();
            }
        });
        btnVidro.setOnAction(e -> {
            String valor = lVisor.getText();
            String pontos = lPontos.getText();
            if (valor.equals("4")) {

                int iPontos = Integer.parseInt(pontos);
                iPontos += 1;

                lPontos.setText("" + String.valueOf(iPontos));
                alterarVisor();
            } else {
                int numero = Integer.parseInt(pontos);
                numero -= 1;
                if (numero - 1 < 0) {
                    numero = numero + (numero * -1);
                }

                lPontos.setText("" + (numero));
                alterarVisor();
            }
        });
    }

    public void alterarVisor() {
        int sNumero = (int) Math.round(Math.random() * 4);
        Image image;
        ImageView imageView = new ImageView();
        imageView.setFitHeight(350);
        imageView.setFitWidth(350);
        imageView.setLayoutX(125);
        imageView.setLayoutY(125);

        if (sNumero < 1) {
            image = new Image("lixoMetal.jpg");
            imageView.setImage(image);
            pVisor.getChildren().add(imageView);
            lVisor.setText(String.valueOf(sNumero));
        } else if (sNumero < 2) {
            image = new Image("lixoOrganico.jpg");
            imageView.setImage(image);
            pVisor.getChildren().add(imageView);
            lVisor.setText(String.valueOf(sNumero));
        } else if (sNumero < 3) {
            image = new Image("lixoPapel.jpg");
            imageView.setImage(image);
            pVisor.getChildren().add(imageView);
            lVisor.setText(String.valueOf(sNumero));
        } else if (sNumero < 4) {
            image = new Image("lixoPlastico.jpg");
            imageView.setImage(image);
            pVisor.getChildren().add(imageView);
            lVisor.setText(String.valueOf(sNumero));
        } else {
            image = new Image("lixoVidro.jpg");
            imageView.setImage(image);
            pVisor.getChildren().add(imageView);
            lVisor.setText(String.valueOf(sNumero));
        }

    }

    public void AlterarBotoes() {
        Image imageMetal = new Image("botaoMetal.png");
        Image imageOrganico = new Image("botaoOrganico.jpg");
        Image imagePapel = new Image("botaoPapel1.jpg");
        Image imagePlastico = new Image("botaoPlastico.png");
        Image imageVidro = new Image("botaoVidro.jpg");
        ImageView imageView = new ImageView(imageMetal);
        imageView.setFitHeight(120);
        imageView.setFitWidth(115);
        
        ImageView imageView2 = new ImageView(imageOrganico);
        imageView2.setFitHeight(120);
        imageView2.setFitWidth(115);
        
        ImageView imageView3 = new ImageView(imagePapel);
        imageView3.setFitHeight(120);
        imageView3.setFitWidth(115);
        
        ImageView imageView4 = new ImageView(imagePlastico);
        imageView4.setFitHeight(120);
        imageView4.setFitWidth(115);
        
        ImageView imageView5 = new ImageView(imageVidro);
        imageView5.setFitHeight(120);
        imageView5.setFitWidth(115);
        
        btnMetal.setGraphic(imageView);

        btnOrganico.setGraphic(imageView2);
        
        btnPapel.setGraphic(imageView3);
        
        btnPlastico.setGraphic(imageView4);
        
        btnVidro.setGraphic(imageView5);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
