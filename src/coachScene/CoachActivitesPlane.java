package coachScene;
import healthclub.Admin;
import healthclub.Coach;
import healthclub.PlanTime;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import mainStage.AdminStage;
import mainStage.CoachStage;
public class CoachActivitesPlane {
public static GridPane CoachActivitesPlane(Stage souse,int iD)
{
Label Sunday = new Label("Sunday");
Label Monday = new Label("Monday");
Label Tuesday = new Label("Tuesday");
Label Wednesday = new Label("Wednesday");
Label Thursday = new Label("Thursday");
Label Friday = new Label("Friday");
Label Saturday  = new Label("Saturday ");
TextField sunday =new TextField();
TextField monday =new TextField();
TextField tuesday =new TextField();
TextField wednesday =new TextField();
TextField thursday =new TextField();
TextField friday =new TextField();
TextField saturday  =new TextField();
final Text actiontarget=new Text();
ArrayList<String>timeplan1=new ArrayList<String>();
Coach cc=new Coach();
timeplan1=cc.getplanbyId(iD);
sunday.setText(timeplan1.get(0));
monday.setText(timeplan1.get(1));
tuesday.setText(timeplan1.get(2));
wednesday.setText(timeplan1.get(3));
thursday.setText(timeplan1.get(4));
friday.setText(timeplan1.get(5));
saturday.setText(timeplan1.get(6));
Button btn = new Button("add plan");
btn.setOnAction((ActionEvent event) -> {
ArrayList<String>timeplan=new ArrayList<String>();
timeplan.add(sunday.getText());
timeplan.add(monday.getText());
timeplan.add(tuesday.getText());
timeplan.add(wednesday.getText());
timeplan.add(thursday.getText());
timeplan.add(friday.getText());
timeplan.add(saturday.getText());
Coach c=new Coach();
c.addplanbyId(timeplan, iD);
CoachStage.coachStage(iD);
souse.close();
});
GridPane grid = new GridPane();
grid.setHgap(5);
grid.setVgap(5);
grid.add(Sunday,3,2);
grid.add(Monday,3,4);
grid.add(Tuesday,3,8);
grid.add(Wednesday,3,6);
grid.add(Thursday,3,10);
grid.add(Friday,3,12);
grid.add(Saturday ,3,14);
grid.add(sunday,6,2);
grid.add(monday,6,4);
grid.add(tuesday,6,6);
grid.add(wednesday,6,8);
grid.add(thursday,6,10);
grid.add(friday,6,12);
grid.add(saturday ,6,14);
grid.add(btn,15,28);
grid.add(actiontarget,14,25);
souse.setTitle("Coach-SetPlan");
return grid;
}
}