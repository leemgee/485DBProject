package DBMain;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.Statement;


public class Main extends Application {

    public Statement stmt;

    public Button view = new Button("View");
    public Button insert = new Button("Insert");
    public Button update = new Button("Update");
    public Button clear = new Button("Clear");
    public Button clearSQLResult = new Button("Clear Result");
    public Button connect = new Button("Connect DB");
    public Button login = new Button("Login");
    public Button login2 = new Button("Login");
    public Button register = new Button("Register");
    public Button search = new Button("Search");
    public Button editUser = new Button("Edit User");
    public Button regUser = new Button("Register");
    public Button back1 = new Button("Back");
    public Button back2 = new Button("Back");
    public Button back3 = new Button("Back");
    public Button back4 = new Button("Back");
    public Button yourProfile = new Button("Profile");
    public Button editYrProfile = new Button("Edit Profile");
    public Button saveEditsUser = new Button("Save Changes");
    public Button logOutUser = new Button("Logout");


    public TextField email = new TextField();
    public TextField firstname = new TextField();
    public TextField lastname = new TextField();
    public TextField address = new TextField();
    public TextField ID = new TextField();
    public TextField StfxID = new TextField();
    public TextField password = new TextField();
    public TextField job = new TextField();
    public TextField majorStudy = new TextField();
    public TextField yearGraduated = new TextField();
    public TextField userSearching = new TextField();
    public TextArea result = new TextArea();

    public TextField email2 = new TextField();
    public TextField firstname2 = new TextField();
    public TextField lastname2 = new TextField();
    public TextField StfxID2 = new TextField();
    public TextField password2 = new TextField();
    public TextField job2 = new TextField();
    public TextField majorStudy2 = new TextField();
    public TextField yearGraduated2 = new TextField();

    public Label lblStatus = new Label();
    public Label newUser = new Label("New User? Register below!");
    public Label existUser = new Label("Already a user? Login below!");
    public Label firstName = new Label("First Name");
    public Label lastName = new Label("Last Name");
    public Label major = new Label("Major (Ie: Mathematics, Computer Science, Statistics, etc.)");
    public Label gradYear = new Label("Graduated Year");
    public Label yourXID = new Label("Stfx ID");
    public Label XID = new Label("Stfx ID");
    public Label jobTitle = new Label("Job Title");
    public Label emailAddress = new Label("Email");
    public Label pass = new Label("Password");
    public Label searchuser = new Label("Search for user");
    public Label edituser = new Label("Edit User");

    public Label firstName2 = new Label("First Name");
    public Label lastName2 = new Label("Last Name");
    public Label major2 = new Label("Major (Ie: Mathematics, Computer Science, Statistics, etc.)");
    public Label gradYear2 = new Label("Graduated Year");
    public Label yourXID2 = new Label("Stfx ID");
    public Label jobTitle2 = new Label("Job Title");
    public Label emailAddress2 = new Label("Email");

    public ChoiceBox searchOptions = new ChoiceBox(FXCollections.observableArrayList("Major", "Name", "Grad Year"));


    @Override
    public void start(Stage primaryStage) {

        GridPane loginScreen = new GridPane();
        GridPane loginScreen2 = new GridPane();
        GridPane registerScreen = new GridPane();
        GridPane userSearch = new GridPane();
        GridPane userEditAdmin = new GridPane();
        GridPane userResults = new GridPane();
        GridPane userEditUser = new GridPane();
        GridPane userProfile = new GridPane();

        loginScreen.add(existUser, 2, 1);
        loginScreen.add(login, 2, 2);
        loginScreen.add(newUser, 2, 4);
        loginScreen.add(register, 2, 5);

        registerScreen.add(firstName, 1, 1);
        registerScreen.add(lastName, 2, 1);
        registerScreen.add(firstname, 1, 2);
        registerScreen.add(lastname, 2, 2);
        registerScreen.add(major, 1, 4);
        registerScreen.add(majorStudy, 1, 5);
        registerScreen.add(gradYear, 2, 4);
        registerScreen.add(yearGraduated, 2, 5);
        registerScreen.add(yourXID, 3, 1);
        registerScreen.add(StfxID, 3, 2);
        registerScreen.add(emailAddress, 3, 4);
        registerScreen.add(email, 3, 5);
        registerScreen.add(jobTitle, 1, 7);
        registerScreen.add(job, 1, 8);
        registerScreen.add(regUser, 1, 9);
        registerScreen.add(back1, 2, 9);

        loginScreen2.add(XID, 3, 2);
        loginScreen2.add(ID, 3, 3);
        loginScreen2.add(pass, 3, 5);
        loginScreen2.add(password, 3, 6);
        loginScreen2.add(login2,3,8);
        loginScreen2.add(back2,3,9);

        userSearch.add(searchOptions, 2, 1);
        userSearch.add(searchuser, 1, 1);
        userSearch.add(userSearching, 2, 2);
        userSearch.add(search, 2, 3);
        userSearch.add(result, 2, 5, 3, 5);
        userSearch.add(yourProfile,3,1);
        userSearch.add(logOutUser,1,12);

        userProfile.add(editYrProfile,3,8);
        userProfile.add(back4,3,9);

//        userEditAdmin.add();

        userEditUser.add(back3,3,9);
        userEditUser.add(saveEditsUser,3,8);
        userEditUser.add(firstName2, 1, 1);
        userEditUser.add(lastName2, 2, 1);
        userEditUser.add(firstname2, 1, 2);
        userEditUser.add(lastname2, 2, 2);
        userEditUser.add(major2, 1, 4);
        userEditUser.add(majorStudy2, 1, 5);
        userEditUser.add(gradYear2, 2, 4);
        userEditUser.add(yearGraduated2, 2, 5);
        userEditUser.add(yourXID2, 3, 1);
        userEditUser.add(StfxID2, 3, 2);
        userEditUser.add(emailAddress2, 3, 4);
        userEditUser.add(email2, 3, 5);
        userEditUser.add(jobTitle2, 1, 7);
        userEditUser.add(job2, 1, 8);

        Scene scene1 = new Scene(loginScreen, 650, 500);
        Scene scene2 = new Scene(loginScreen2, 650, 500);
        Scene scene3 = new Scene(registerScreen, 650, 500);
        Scene scene4 = new Scene(userSearch, 650, 500);
        Scene scene5 = new Scene(userEditUser,650,500);
        Scene scene6 = new Scene(userProfile,650,500);

        primaryStage.setTitle("485 DB Project");
        primaryStage.setScene(scene1);
        primaryStage.show();

        login.setOnAction(e -> primaryStage.setScene(scene2));
        login2.setOnAction(e -> primaryStage.setScene(scene4));
        back2.setOnAction(e -> primaryStage.setScene(scene1));
        register.setOnAction(e -> primaryStage.setScene(scene3));
        back1.setOnAction(e -> primaryStage.setScene(scene1));
        yourProfile.setOnAction(e -> primaryStage.setScene(scene6));
        back4.setOnAction(e -> primaryStage.setScene(scene4));
        editYrProfile.setOnAction(e -> primaryStage.setScene(scene5));
        back3.setOnAction(e -> primaryStage.setScene(scene6));
        logOutUser.setOnAction(e -> primaryStage.close());


    }


    public static void main(String[] args) {
        launch(args);
    }
