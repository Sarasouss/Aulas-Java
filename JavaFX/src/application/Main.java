package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
//	Ele e o construtor da tela 
		try {
			GridPane grid = new GridPane();// Podemos coloca em linhas e colunas
			grid.setHgap(5.0);// Dsitanxia Horizontal
			grid.setVgap(7.0);// Distancia Vertical

			grid.add(new Label("Nome: "), 0, 0); // posicao que quero colocar o texto nome

			TextField txtnome = new TextField();
			grid.add(txtnome, 1, 0); // podemos adicionar conteudo

			grid.add(new Label("Sexo: "), 0, 1);

			RadioButton btnMasc = new RadioButton("Masculino"); // criando botoes de escolhas
			RadioButton btnFem = new RadioButton("Feminino");
			btnFem.setSelected(true);

			ToggleGroup group = new ToggleGroup(); // adicionamos os dois a um grupo, caso eu marque um o outro
													// desmarcara
			btnFem.setToggleGroup(group);
			btnMasc.setToggleGroup(group);

			HBox radioBox = new HBox(5.0, btnFem, btnMasc);// 5.0 da o espacamento entre cada elemento/ ele cria um
															// layout horizontal
			grid.add(radioBox, 1, 1);

			grid.add(new Label("Estado: "), 0, 2);
			ChoiceBox<String> chcEstados = new ChoiceBox<>();
			ObservableList<String> estados = FXCollections.observableArrayList("São Paulo", "Rio de Janeiro",
					"Minas Gerais");
//			Com o choiceBox voce consegue fazer escolhas com a elementos que estao em listado tipo String

			chcEstados.setItems(estados);
			grid.add(chcEstados, 1, 2);

			Label lblTest = new Label();
			Button btntest = new Button("Salvar"); // Cria o botao
			btntest.setOnAction(event -> lblTest.setText(txtnome.getText())); // mensagem que aparecera quando clicar no botao
			btntest.setOnMouseEntered(event -> lblTest.setText("Passou")); // o que aparecera quando clc o mouse em cima 
			btntest.setOnMouseExited(event -> lblTest.setText("Saiu"));// quando tirar
			
			grid.add(lblTest, 0, 4);
			grid.add(btntest, 0, 3);
			
			CheckBox ckbTest = new CheckBox("Teste");
			grid.add(ckbTest, 0, 5);
			
			BorderPane root = new BorderPane(); // Classe que criara um painel
			Scene scene = new Scene(root, 500, 500); // Determina o tamanho da janela
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Estilo da tela

			root.setCenter(grid);
			primaryStage.setScene(scene); // Qual sera a primeira tela
			primaryStage.show(); // Abri a tela

		} catch (Exception e) { // Se der errado mostra a tela antiga
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);

	}
}
