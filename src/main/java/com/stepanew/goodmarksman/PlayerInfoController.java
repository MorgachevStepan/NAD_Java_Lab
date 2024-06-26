package com.stepanew.goodmarksman;

import com.stepanew.goodmarksman.models.PlayerInfo;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class PlayerInfoController {

    public static VBox createPlayerInfoVBox(PlayerInfo playerInfo){
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.prefWidth(250);

        Label playerNameLabel = new Label("Имя игрока");
        playerNameLabel.getStyleClass().add("text-label");

        Label shotCounterLabel = new Label("Количество выстрелов");
        shotCounterLabel.getStyleClass().add("text-label");

        Label scoreCounterLabel = new Label("Количество очков");
        scoreCounterLabel.getStyleClass().add("text-label");

        Label winsLabel = new Label("Количество побед");
        winsLabel.getStyleClass().add("text-label");

        Text playerNameText = new Text(playerInfo.getPlayerName());
        playerNameText.getStyleClass().add("text");

        Text shotCounterText = new Text(Integer.toString(playerInfo.getShotCounter()));
        shotCounterText.getStyleClass().add("text");

        Text scoreCounterText = new Text(Integer.toString(playerInfo.getScoreCounter()));
        scoreCounterText.getStyleClass().add("text");

        Text winsText = new Text(Integer.toString(playerInfo.getWins()));
        winsText.getStyleClass().add("text");


        vBox.getChildren().add(playerNameLabel);
        vBox.getChildren().add(playerNameText);
        vBox.getChildren().add(shotCounterLabel);
        vBox.getChildren().add(shotCounterText);
        vBox.getChildren().add(scoreCounterLabel);
        vBox.getChildren().add(scoreCounterText);
        vBox.getChildren().add(winsLabel);
        vBox.getChildren().add(winsText);

        return vBox;
    }

    public static void setPlayerName (VBox vBox, String playerName){
        Text text = (Text) vBox.getChildren().get(1);
        text.setText(playerName);
    }

    public static void setShotCounter (VBox vBox, int shotCounter){
        Text text = (Text) vBox.getChildren().get(3);
        text.setText(Integer.toString(shotCounter));
    }

    public static void setScoreCounter (VBox vBox, int scoreCounter){
        Text text = (Text) vBox.getChildren().get(5);
        text.setText(Integer.toString(scoreCounter));
    }

    public static void setWinCounter (VBox vBox, int wins){
        Text text = (Text) vBox.getChildren().get(7);
        text.setText(Integer.toString(wins));
    }

}
