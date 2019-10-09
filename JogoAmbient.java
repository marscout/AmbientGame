/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoambient;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;


/**
 *
 * @author marce
 */
public class JogoAmbient extends Application {

    private Button btnMetal = new Button("Metal");
    private Button btnOrganico = new Button("Organico");
    private Button btnPlastico = new Button("Plastico");
    private Button btnVidro = new Button("Vidro");
    private Button btnPapel = new Button("Papel");
    public Label lVisor = new Label("2");
    Label lPontos = new Label("0");
    private Label lPontosTxt = new Label("Pontos: ");

    @Override
    public void start(Stage stage) {
        ImageView ivMateriais = new ImageView();
        Pane pPontos = new Pane(lPontos);
        HBox hbPontos = new HBox(10, lPontosTxt, pPontos);

        Pane pVisor = new Pane(lVisor);
        TilePane tpBotoes = new TilePane(Orientation.HORIZONTAL, btnMetal, btnOrganico, btnPapel, btnPlastico, btnVidro);
        BorderPane bpVisor = new BorderPane(pVisor, hbPontos, null, tpBotoes, null);
        alterarVisor();

        Scene scene = new Scene(bpVisor, 350, 350);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();

        btnMetal.setOnAction(e -> {
            String valor = lVisor.getText();
            String spontos = lPontos.getText();
            if (valor.equals("0")) {

               // pPontos.getChildren().clear();

                int iPontos = Integer.parseInt(spontos);
                iPontos += 1;
                //Label lPontos = new Label(String.valueOf(iPontos));

                //pPontos.getChildren().add(lPontos);
                lPontos.setText(""+String.valueOf(iPontos));

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
                //pPontos.getChildren().clear();

                int iPontos = Integer.parseInt(pontos);
                iPontos += 1;
                //Label lPontos = new Label(String.valueOf(iPontos));

                //pPontos.getChildren().add(lPontos);
                lPontos.setText(""+String.valueOf(iPontos));
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
                //pPontos.getChildren().clear();

                int iPontos = Integer.parseInt(pontos);
                iPontos += 1;
                //Label lPontos = new Label(String.valueOf(iPontos));

                //pPontos.getChildren().add(lPontos);
                lPontos.setText(""+String.valueOf(iPontos));
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
                //pPontos.getChildren().clear();

                int iPontos = Integer.parseInt(pontos);
                iPontos += 1;
                //Label lPontos = new Label(String.valueOf(iPontos));

                //pPontos.getChildren().add(lPontos);
                lPontos.setText(""+String.valueOf(iPontos));
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
                //.getChildren().clear();

                int iPontos = Integer.parseInt(pontos);
                iPontos += 1;
                //Label lPontos = new Label(String.valueOf(iPontos));

                //pPontos.getChildren().add(lPontos);
                lPontos.setText(""+String.valueOf(iPontos));
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

    /* public void verificarAcerto(ActionEvent e) {
        String valor = lVisor.getText();
        String pontos = lPontos.getText();
        e.getSource();
        if (btnMetal.getText() == "Metal" && valor == "0") {
            int numero = Integer.parseInt(pontos);
            lPontos.setText(" " + (numero += 1));
            alterarVisor();
        } else if (btnOrganico.getText() == "Organico" && valor == "1") {
            int numero = Integer.parseInt(pontos);
            lPontos.setText(" " + (numero += 1));
            alterarVisor();
        } else if (btnPapel.getText() == "Papel" && valor == "2") {
            int numero = Integer.parseInt(pontos);
            lPontos.setText(" " + (numero += 1));
            alterarVisor();
        } else if (btnPlastico.getText() == "Plastico" && valor == "3") {
            int numero = Integer.parseInt(pontos);
            lPontos.setText(" " + (numero += 1));
            alterarVisor();
        } else if (btnVidro.getText() == "Vidro" && valor == "4") {
            int numero = Integer.parseInt(pontos);
            lPontos.setText(" " + (numero += 1));
            alterarVisor();
        }

    }
     */
    public void alterarVisor() {
        int sNumero = (int) Math.round(Math.random() * 4);

        lVisor.setText(String.valueOf(sNumero));
    }

    public static void main(String[] args) {
        launch(args);
    }

}
