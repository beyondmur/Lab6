package Lab6.view;

import lab6.proj.model.JSONModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lab6.proj.Main;
import lab6.proj.model.HeroesModel;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private TableView<HeroesModel> table;
    @FXML
    private TableColumn<HeroesModel, String> heroIdCol;
    @FXML
    private TableColumn<HeroesModel, String> heroNameCol;
    @FXML
    private TableColumn<HeroesModel, String> heroLocNameCol;
    @FXML
    private TableColumn<HeroesModel, String> heroPrimAttrCol;
    @FXML
    private TableColumn<HeroesModel, String> heroAttTypeCol;
    @FXML
    private TableColumn<HeroesModel, List<String>> heroRolesCol;
    @FXML
    private TableColumn<HeroesModel, String> heroImgCol;
    @FXML
    private TableColumn<HeroesModel, String> heroIconCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroBaseHealthCol;
    @FXML
    private TableColumn<HeroesModel, Double> heroBaseHealthRegCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroBaseManaCol;
    @FXML
    private TableColumn<HeroesModel, Double> heroBaseManaRegCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroBaseArmorCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroBaseMrCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroBaseAttMinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroBaseAttMaxCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroBaseStrCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroBaseAgiCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroBaseIntCol;
    @FXML
    private TableColumn<HeroesModel, Double> heroStrGainCol;
    @FXML
    private TableColumn<HeroesModel, Double> heroAgiGainCol;
    @FXML
    private TableColumn<HeroesModel, Double> heroIntGainCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroAttRangeCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroProjectileSpeedCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroAttRateCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroMoveSpeedCol;
    @FXML
    private TableColumn<HeroesModel, Double> heroTurnRateCol;
    @FXML
    private TableColumn<HeroesModel, Boolean> heroCmEnabledCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroLegsCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroProWinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroProPickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero_IdCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroProBanCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero1PickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero1WinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero2PickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero2WinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero3PickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero3WinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero4PickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero4WinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero5PickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero5WinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero6PickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero6WinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero7PickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero7WinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero8PickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> hero8WinCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroNullPickCol;
    @FXML
    private TableColumn<HeroesModel, Integer> heroNullWinCol;
    @FXML
    private TextField textField;

    private Main main;

    public Controller() {
    }

    @FXML
    private void initialize()  {
        heroIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        heroNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        heroLocNameCol.setCellValueFactory(new PropertyValueFactory<>("localizedName"));
        heroPrimAttrCol.setCellValueFactory(new PropertyValueFactory<>("primaryAttr"));
        heroAttTypeCol.setCellValueFactory(new PropertyValueFactory<>("attackType"));
        heroRolesCol.setCellValueFactory(new PropertyValueFactory<>("roles"));
        heroImgCol.setCellValueFactory(new PropertyValueFactory<>("img"));
        heroIconCol.setCellValueFactory(new PropertyValueFactory<>("icon"));
        heroBaseHealthCol.setCellValueFactory(new PropertyValueFactory<>("baseHealth"));
        heroBaseHealthRegCol.setCellValueFactory(new PropertyValueFactory<>("baseHealthRegen"));
        heroBaseManaCol.setCellValueFactory(new PropertyValueFactory<>("baseMana"));
        heroBaseManaRegCol.setCellValueFactory(new PropertyValueFactory<>("baseManaRegen"));
        heroBaseArmorCol.setCellValueFactory(new PropertyValueFactory<>("baseArmor"));
        heroBaseMrCol.setCellValueFactory(new PropertyValueFactory<>("baseMr"));
        heroBaseAttMinCol.setCellValueFactory(new PropertyValueFactory<>("baseAttackMin"));
        heroBaseAttMaxCol.setCellValueFactory(new PropertyValueFactory<>("baseAttackMax"));
        heroBaseStrCol.setCellValueFactory(new PropertyValueFactory<>("baseStr"));
        heroBaseAgiCol.setCellValueFactory(new PropertyValueFactory<>("baseAgi"));
        heroBaseIntCol.setCellValueFactory(new PropertyValueFactory<>("baseInt"));
        heroStrGainCol.setCellValueFactory(new PropertyValueFactory<>("strGain"));
        heroAgiGainCol.setCellValueFactory(new PropertyValueFactory<>("agiGain"));
        heroIntGainCol.setCellValueFactory(new PropertyValueFactory<>("intGain"));
        heroAttRangeCol.setCellValueFactory(new PropertyValueFactory<>("attackRange"));
        heroProjectileSpeedCol.setCellValueFactory(new PropertyValueFactory<>("projectileSpeed"));
        heroAttRateCol.setCellValueFactory(new PropertyValueFactory<>("attackRate"));
        heroMoveSpeedCol.setCellValueFactory(new PropertyValueFactory<>("moveSpeed"));
        heroTurnRateCol.setCellValueFactory(new PropertyValueFactory<>("turnRate"));
        heroCmEnabledCol.setCellValueFactory(new PropertyValueFactory<>("cmEnabled"));
        heroLegsCol.setCellValueFactory(new PropertyValueFactory<>("legs"));
        heroProWinCol.setCellValueFactory(new PropertyValueFactory<>("proWin"));
        heroProPickCol.setCellValueFactory(new PropertyValueFactory<>("proPick"));
        hero_IdCol.setCellValueFactory(new PropertyValueFactory<>("heroId"));
        heroProBanCol.setCellValueFactory(new PropertyValueFactory<>("proBan"));
        hero1PickCol.setCellValueFactory(new PropertyValueFactory<>("1Pick"));
        hero1WinCol.setCellValueFactory(new PropertyValueFactory<>("1Win"));
        hero2PickCol.setCellValueFactory(new PropertyValueFactory<>("2Pick"));
        hero2WinCol.setCellValueFactory(new PropertyValueFactory<>("2Win"));
        hero3PickCol.setCellValueFactory(new PropertyValueFactory<>("3Pick"));
        hero3WinCol.setCellValueFactory(new PropertyValueFactory<>("3Win"));
        hero4PickCol.setCellValueFactory(new PropertyValueFactory<>("4Pick"));
        hero4WinCol.setCellValueFactory(new PropertyValueFactory<>("4Win"));
        hero5PickCol.setCellValueFactory(new PropertyValueFactory<>("5Pick"));
        hero5WinCol.setCellValueFactory(new PropertyValueFactory<>("5Win"));
        hero6PickCol.setCellValueFactory(new PropertyValueFactory<>("6Pick"));
        hero6WinCol.setCellValueFactory(new PropertyValueFactory<>("6Win"));
        hero7PickCol.setCellValueFactory(new PropertyValueFactory<>("7Pick"));
        hero7WinCol.setCellValueFactory(new PropertyValueFactory<>("7Win"));
        hero8PickCol.setCellValueFactory(new PropertyValueFactory<>("8Pick"));
        hero8WinCol.setCellValueFactory(new PropertyValueFactory<>("8Win"));
        heroNullPickCol.setCellValueFactory(new PropertyValueFactory<>("nullPick"));
        heroNullWinCol.setCellValueFactory(new PropertyValueFactory<>("nullWin"));
    }

    private JSONModel jsonModel = new JSONModel();
    private ObjectMapper mapper = new ObjectMapper();
    private String jsonString;
    public ObservableList<HeroesModel> listHeroes = FXCollections.observableArrayList();

    public void dataLoad() throws IOException {
        jsonModel.setURL("https://api.opendota.com/api/heroStats");
        jsonModel.run();
        jsonString = jsonModel.getJsonIn();
        ArrayList<HeroesModel> heroesModels = mapper.reader()
                .forType(new TypeReference<ArrayList<HeroesModel>>() {
                })
                .readValue(jsonString);
        listHeroes.addAll(heroesModels);
    }

    @FXML
    private void sortFuncArmorDesc() throws IOException {
        listHeroes.clear();
        dataLoad();
        listHeroes.sort(HeroesModel.byBaseArmorDesc);
        table.setItems(listHeroes);
    }

    @FXML
    private void sortFuncArmorAsc() throws IOException {
        listHeroes.clear();
        dataLoad();
        listHeroes.sort(HeroesModel.byBaseArmorAsc);
        table.setItems(listHeroes);
    }

    @FXML
    private void sortFuncAttackRangeDesc() throws IOException {
        listHeroes.clear();
        dataLoad();
        listHeroes.sort(HeroesModel.byAttackRangDesc);
        table.setItems(listHeroes);
    }

    @FXML
    private void sortFuncAttackRangeAsc() throws IOException {
        listHeroes.clear();
        dataLoad();
        listHeroes.sort(HeroesModel.byAttackRangAsc);
        table.setItems(listHeroes);
    }

    @FXML
    private void sortFuncMoveSpeedDesc() throws IOException {
        listHeroes.clear();
        dataLoad();
        listHeroes.sort(HeroesModel.byMoveSpeedDesc);
        table.setItems(listHeroes);
    }

    @FXML
    private void sortFuncMoveSpeedAsc() throws IOException {
        listHeroes.clear();
        dataLoad();
        listHeroes.sort(HeroesModel.byMoveSpeedAsc);
        table.setItems(listHeroes);
    }

    @FXML
    private void sortFuncIntGainDesc() throws IOException {
        listHeroes.clear();
        dataLoad();
        listHeroes.sort(HeroesModel.byIntGainDesc);
        table.setItems(listHeroes);
    }

    @FXML
    private void sortFuncIntGainAsc() throws IOException {
        listHeroes.clear();
        dataLoad();
        listHeroes.sort(HeroesModel.byIntGainAsc);
        table.setItems(listHeroes);
    }

    @FXML
    private void reload() throws IOException {
        listHeroes.clear();
        dataLoad();
    }

    @FXML
    public void filterFunc() throws IOException {

        FilteredList<HeroesModel> filteredList = new FilteredList<>(listHeroes, p -> true);
        if (filteredList.isEmpty())
            dataLoad();

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredList.setPredicate(heroesModel -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();
                if (heroesModel.getLocalizedName().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                }
                return false;
            });
        });
        SortedList<HeroesModel> sortedList = new SortedList<>(filteredList);
        sortedList.comparatorProperty().bind(table.comparatorProperty());

        table.setItems(sortedList);

    }


    public void setMainApp(Main main) {
        this.main = main;

        table.setItems(main.getPersonData());
    }
}