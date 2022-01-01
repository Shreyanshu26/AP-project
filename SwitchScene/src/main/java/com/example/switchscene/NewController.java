package com.example.switchscene;

import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

public class NewController implements Initializable {


    private Scene scene;
    private Stage stage;
    static ArrayList<ImageView> islandarr = new ArrayList<ImageView>();

    @FXML
    public AnchorPane GameScene;
    @FXML
    private  AnchorPane scenePane;
    @FXML
    private ImageView heroImg;
    @FXML
    public Label scoreLabel;
    @FXML
    private ImageView island;

    @FXML
    private ImageView isl4;
    @FXML
    private ImageView isl5;

    @FXML
    private ImageView islass;
    @FXML
    private ImageView islass1;

    @FXML
    private  ImageView isl6;
    @FXML
    private  ImageView isl61;
    @FXML
    private ImageView isl7;
    @FXML
    private ImageView isl8;
    @FXML
    private ImageView isl9;
    @FXML
    private ImageView isl10;
    @FXML
    private ImageView isl11;
    @FXML
    private ImageView orc;
    @FXML
    private ImageView orc1;
    @FXML
    private ImageView orc11;
    @FXML
    private ImageView chestClosed;
    @FXML
    private ImageView chestClosed1;
    @FXML
    private ImageView chestClosed2;
    @FXML
    private ImageView sword1;
    @FXML
    private ImageView hammer;

    private boolean canjump=true;
    private Point2D velocity = new Point2D(0,0);

    ArrayList<ImageView> chests = new ArrayList<ImageView>();
    ArrayList<ImageView> orcs = new ArrayList<ImageView>();
    static ArrayList<ImageView> heros = new ArrayList<ImageView>();

    static ArrayList<Integer> spaces= new ArrayList<Integer>();

    int score=0;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1){

        //up down
        TranslateTransition tr = new TranslateTransition();
        tr.setNode(heroImg);
        tr.setDuration(Duration.millis(600));
        tr.setCycleCount(TranslateTransition.INDEFINITE);

        tr.setByY(-60);
        tr.setAutoReverse(true);
        tr.play();
        //sword
        TranslateTransition tr2 = new TranslateTransition();
        tr2.setNode(sword1);
        tr2.setDuration(Duration.millis(600));
        tr2.setCycleCount(TranslateTransition.INDEFINITE);
        tr2.setByY(-60);
        tr2.setAutoReverse(true);
        tr2.play();
        //hammer
        TranslateTransition tr3 = new TranslateTransition();
        tr3.setNode(hammer);
        tr3.setDuration(Duration.millis(600));
        tr3.setCycleCount(TranslateTransition.INDEFINITE);
        tr3.setByY(-60);
        tr3.setAutoReverse(true);
        tr3.play();
        //up down 2
        TranslateTransition tra = new TranslateTransition();
        tra.setNode(orc);
        tra.setDuration(Duration.millis(500));
        tra.setCycleCount(TranslateTransition.INDEFINITE);
        tra.setByY(-50);
        tra.setAutoReverse(true);
        tra.play();
        //











    }
    public void addHero(){
        heros.add(heroImg);
    }
    public void addIsl(){
        islandarr.add(island);
        islandarr.add(islass);
        islandarr.add(isl8);
        islandarr.add(isl6);

        islandarr.add(isl7);


        islandarr.add(islass1);
        islandarr.add(isl5);
        islandarr.add(isl61);
        islandarr.add(isl9);
        islandarr.add(isl10);











//        islandarr.add(isl4);

    }
    public void addChest(){
        chests.add(chestClosed);
        chests.add(chestClosed1);
        chests.add(chestClosed2);
    }

    public void addOrc(){
        orcs.add(orc);
        orcs.add(orc1);
        orcs.add(orc11);
    }






    public void HOMESCREEN(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Scene1.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }


    public void LOGIN(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Login.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }

    public void SETTINGS(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Settings.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();
//        Parent root1 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Settings.fxml")));
//        stage1 = new Stage();
//        Scene scene1 = new Scene(root1);
//        stage1.setScene(scene1);
//        stage1.show();

    }
    public void LOADGAME(ActionEvent event) throws IOException{
        heroImg.setX(heroImg.getX()+1);

    }

//    public void Settings(ActionEvent event) throws IOException{
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Settings.fxml"))));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene((scene));
//        stage.show();
//
//    }
    public void Exit(ActionEvent event){
        Alert ar = new Alert(Alert.AlertType.CONFIRMATION);
        ar.setTitle("EXIT");
        ar.setContentText("Do you want to save before exiting?");
        ar.setHeaderText("You are about to logout");


        if(ar.showAndWait().get() == ButtonType.OK){
            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
    public void Exit1(ActionEvent event){
//        Alert ar = new Alert(Alert.AlertType.CONFIRMATION);
//        ar.setTitle("EXIT");
//        ar.setContentText("Do you want to save before exiting?");
//        ar.setHeaderText("You are about to logout");


//        if(ar.showAndWait().get() == ButtonType.OK){
//            stage = (Stage) scenePane.getScene().getWindow();
//            System.out.println("You successfully logged out!");
//            stage.close();
//        }
        stage = (Stage) scenePane.getScene().getWindow();

        stage.close();
    }
    public void ResumeGame(ActionEvent event) throws IOException {
//        Exit1(event);
//        stage = (Stage) scenePane.getScene().getWindow();


        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("SceneGame.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }
    public void ReturnHome(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(("Scene1.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene((scene));
        stage.show();

    }

    public void hello(){

        TranslateTransition tr = new TranslateTransition();
        tr.setNode(heroImg);
        tr.setDuration(Duration.millis(1000));

        heroImg.setLayoutX((heroImg.getLayoutX()+50));
        TranslateTransition tr1 = new TranslateTransition();
        tr1.setNode(sword1);
        tr1.setDuration(Duration.millis(1000));
        RotateTransition rot = new RotateTransition();
        rot.setNode(sword1);
        rot.setCycleCount(1);
        rot.setInterpolator(Interpolator.LINEAR);
        rot.setByAngle(360);
        rot.setAxis(Rotate.Z_AXIS);
        rot.play();
        RotateTransition rot1 = new RotateTransition();
        rot1.setNode(hammer);
        rot1.setCycleCount(1);
        rot1.setInterpolator(Interpolator.LINEAR);
        rot1.setByAngle(360);
        rot1.setAxis(Rotate.Z_AXIS);
        rot1.play();
        sword1.setLayoutX((sword1.getLayoutX()+50));
        TranslateTransition tr2 = new TranslateTransition();
        tr2.setNode(hammer);
        tr2.setDuration(Duration.millis(1000));
        hammer.setLayoutX((hammer.getLayoutX()+35));
        for(Node c : GameScene.getChildren()){
            if(c instanceof ImageView){
                ((ImageView) c).setLayoutX(((ImageView) c).getLayoutX()-40);
            }
        }
        score++;
        scoreLabel.setText( Integer.toString(score) );

        openChest();
        checkGravity(heroImg);










    }
    public void ENTERGAME(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Saveve.fxml"));
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
        Parent root = loader.load();
        NewController controller = loader.getController();
        controller.sword1.setVisible(false);
        controller.hammer.setVisible(false);
//        sword1.setVisible(false);
        controller.addIsl();
        controller.addChest();
        controller.addOrc();
        controller.jump();
        controller.addHero();
        controller.addSpaces();


//        System.out.println(islandarr);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root,750, 400);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.RIGHT) {
                    controller.hello();





                }
            }


        });

        stage.setScene((scene));
        stage.show();
        MyTimer timer = new MyTimer();
        //timer.start();



    }
    public class MyTimer extends AnimationTimer{

        @Override
        public void handle(long l) {
//            System.out.println(NewController.heros.get(0).getLayoutX());
//            for(Node c : islandarr){
//                System.out.println(c.getLayoutX());
//            }
            checkGravity(NewController.heros.get(0));
        }

    }


//    public void setGravity(){
//        if(velocity.getY()<10){
//            velocity=velocity.add(0,1);
//        }
//        moveY((int)velocity.getY());
//    }
    public void moveY(int mag){
        boolean goDown=mag >0;
        for(int i =0; i<Math.abs(mag); i++) {
            for(ImageView j: islandarr) {
                if (heroImg.getBoundsInParent().intersects(j.getBoundsInParent())) {
                    if (goDown) {
                        heroImg.setTranslateY(heroImg.getTranslateY() - 1);
                        canjump = true;
                        jump();
                    }
                }
            }
            heroImg.setTranslateY(heroImg.getTranslateY()+(goDown?1:-1));

        }
    }
    public void jump(){
        if(canjump){
            velocity = velocity.add(0,-30);

            moveY((int) velocity.getY());
            canjump=false;

        }else{
            velocity=velocity.add(0,10);

            moveY((int)velocity.getY());
        }

    }
    public void openChest() {

        Random r = new Random();
        int x = r.nextInt(2);
//        System.out.println(x);
        for (ImageView i : chests) {
            if (x == 0) {

                //sword
                if (i.getLayoutX() + i.getFitWidth() / 2 >= heroImg.getLayoutX() && i.getLayoutX() - i.getFitWidth() / 2 <= heroImg.getLayoutX()) {
                    //            chestClosed.setVisible(false);
                    i.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/ChestOpen.png"));
                    heroImg.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/DangWillHero.png"));
                    hammer.setVisible(false);
                    sword1.setVisible(true);
                    break;

                }
            } else {
                if (i.getLayoutX() + i.getFitWidth() / 2 >= heroImg.getLayoutX() && i.getLayoutX() - i.getFitWidth() / 2 <= heroImg.getLayoutX()) {
                    //            chestClosed.setVisible(false);
                    i.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/ChestOpen.png"));
                    heroImg.setImage(new Image("file:///C:/Users/HP/IdeaProjects/SwitchScene/src/main/java/com/example/switchscene/ImagesTot/DangWillHero.png"));
                    sword1.setVisible(false);
                    hammer.setVisible(true);
                    break;


                }

            }
        }

    }
    public void checkGravity(ImageView heroImg){

        for(int i=0;i<spaces.size()-1;i++){
            System.out.println(heroImg.getLayoutX()+" "+spaces.get(i+1)+" "+spaces.get(i));
            if(heroImg.getLayoutX()<= spaces.get(i+1)||heroImg.getLayoutX()>=spaces.get(i)){
//                System.out.println("yes");
                break;

            }
            else{
                TranslateTransition tr = new TranslateTransition();
                tr.setNode(NewController.heros.get(0));
                tr.setDuration(Duration.millis(60));


                tr.setByY(60);

                tr.play();

            }
        }
//        System.out.println(spaces);


    }
    public void addSpaces(){
        for(int i=0; i<islandarr.size(); i++){

            //spaces.add((int)(islandarr.get(i).getLayoutX()+islandarr.get(i).getFitWidth()/2));
            spaces.add((int)islandarr.get(i).getBoundsInParent().getMinX());
            spaces.add((int)islandarr.get(i).getBoundsInParent().getMaxX());
//            System.out.println(islandarr.get(i).getBoundsInParent().getMaxX());
//            System.out.println((int)(islandarr.get(i).getLayoutX()+islandarr.get(i).getFitWidth()/2));
//            spaces.add((int)(islandarr.get(i+1).getLayoutX()-islandarr.get(i+1).getFitWidth()/2));
//            System.out.println((int)(islandarr.get(i).getLayoutX()+islandarr.get(i).getFitWidth()/2));
//
//            System.out.println((int)(islandarr.get(i+1).getLayoutX()-islandarr.get(i+1).getFitWidth()/2));
        }
//        System.out.println(spaces);
    }
    public void collide(){

    }



}
