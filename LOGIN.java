import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class prac  extends Application {


    public void start(Stage stage){
        Text text1 = new Text("email");//creating label email
        Text text2 = new Text("Password");//creating label password
        TextField textField1 = new TextField();//creating text field for email
        PasswordField textField2 = new PasswordField();//creating new pasword field
        //creating buttons
        Button button1  = new Button("submmit");
        Button button2 = new Button("clear");
        //creating grid plane
        GridPane gridPane = new GridPane();
        //setting size for the pane
        gridPane.setMinSize(400,200);
        //setting padding
        gridPane.setPadding(new Insets(10,10,10,10));
        //setting verticle and horizontal gaps between the coloumns
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        //setting grid allingment
        gridPane.setAlignment(Pos.CENTER);
        //Arranging all nodes in the grid
        gridPane.add(text1,0,0);
        gridPane.add(textField1,1,0);
        gridPane.add(text2,0,1);
        gridPane.add(textField2,1,1);
        gridPane.add(button1,0,2);
        gridPane.add(button2,1,2);
        //styling nodes
        button1.setStyle("-fx-background-color:darkslateblue;-fx-text-fill:white");
        button2.setStyle("-fx-background-color:darkslateblue;-fx-text-fill:white");
        text1.setStyle("-fx-font:normal bold 20px 'serif'");
        text2.setStyle("-fx-font:normal bold 20px 'serif'");
        gridPane.setStyle("-fx-background-color:BEIGE;");
        //creating a scene object
        Scene scene = new Scene(gridPane);
        //setting title to the stage
        stage.setTitle("ISE FAMILY");
        //Adding scene to the stage
        stage.setScene(scene);
        //Displaying contents of the stage
        stage.show();
    }
    public static  void main(String args[]){
        launch(args);
    }

}








