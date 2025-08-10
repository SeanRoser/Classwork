import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CylinderApplication extends Application
{
    private final int GRID_SPACING = 20;
    private final int WINDOW_WIDTH = 960;
    private final int WINDOW_HEIGHT = 540;
    
    private GridPane windowPane;
    private Scene windowScene;
    
    private Label radiusLabel;
    private TextField radiusInput;
    private Label radiusUnits;
    private Label heightLabel;
    private TextField heightInput;
    private Label heightUnits;
    private Label descriptionLabel;
    private TextField descriptionInput;
    
    public CylinderApplication()
    {
        windowPane = new GridPane();
        
        radiusLabel = new Label("Radius");
        radiusInput = new TextField("1.5");
        radiusUnits = new Label("meters");
        
        heightLabel = new Label("Height");
        heightInput = new TextField("2.5");
        heightUnits = new Label("meters");
        
        descriptionLabel = new Label("Description");
        descriptionInput = new TextField("Cylinder");
        
        windowPane.setAlignment(Pos.CENTER);
        windowPane.setHgap(GRID_SPACING);
        windowPane.setVgap(GRID_SPACING);
        
        windowPane.add(radiusLabel, 0, 0);
        windowPane.add(radiusInput, 1, 0);
        windowPane.add(radiusUnits, 2, 0);
        
        windowPane.add(heightLabel, 0, 1);
        windowPane.add(heightInput, 1, 1);
        windowPane.add(heightUnits, 2, 1);
        
        windowPane.add(descriptionLabel, 0, 2);
        windowPane.add(descriptionInput, 1, 2);
        
        windowScene = new Scene(windowPane, WINDOW_WIDTH, WINDOW_HEIGHT);
    }
    
    @Override
    public void start(Stage windowStage)
    {
        windowStage.setScene(windowScene);
        windowStage.setTitle("CylinderApplication");
        windowStage.show();
    }
}





