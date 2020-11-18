package Lab6.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeroesModel implements Serializable {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("localizedName")
    private String localizedName;
    @JsonProperty("primaryAttr")
    private String primaryAttr;
    @JsonProperty("attackType")
    private String attackType;
    @JsonProperty("roles")
    private List<String> roles = null;
    @JsonProperty("img")
    private String img;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("baseHealth")
    private int baseHealth;
    @JsonProperty("baseHealthRegen")
    private double baseHealthRegen;
    @JsonProperty("baseMana")
    private int baseMana;
    @JsonProperty("baseManaRegen")
    private int baseManaRegen;
    @JsonProperty("base_armor")
    private int baseArmor;
    @JsonProperty("baseMr")
    private int baseMr;
    @JsonProperty("baseAttackMin")
    private int baseAttackMin;
    @JsonProperty("baseAttackMax")
    private int baseAttackMax;
    @JsonProperty("baseStr")
    private int baseStr;
    @JsonProperty("baseAgi")
    private int baseAgi;
    @JsonProperty("baseInt")
    private int baseInt;
    @JsonProperty("strGain")
    private double strGain;
    @JsonProperty("agiGain")
    private int agiGain;
    @JsonProperty("intGain")
    private double intGain;
    @JsonProperty("attackRange")
    private int attackRange;
    @JsonProperty("projectileSpeed")
    private int projectileSpeed;
    @JsonProperty("attackRate")
    private double attackRate;
    @JsonProperty("moveSpeed")
    private int moveSpeed;
    @JsonProperty("turnRate")
    private double turnRate;
    @JsonProperty("cmEnabled")
    private boolean cmEnabled;
    @JsonProperty("legs")
    private int legs;
    @JsonProperty("proWin")
    private int proWin;
    @JsonProperty("proPick")
    private int proPick;
    @JsonProperty("heroId")
    private int heroId;
    @JsonProperty("proBan")
    private int proBan;
    @JsonProperty("1Pick")
    private int _1Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Рекрут"
    @JsonProperty("1Win")
    private int _1Win;    //кол-во побед, когда персонаж был взят игроком ранга "Рекрут"
    @JsonProperty("2Pick")
    private int _2Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Страж"
    @JsonProperty("2Win")
    private int _2Win;
    @JsonProperty("3Pick")
    private int _3Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Рыцарь"
    @JsonProperty("3Win")
    private int _3Win;
    @JsonProperty("4Pick")
    private int _4Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Герой"
    @JsonProperty("4Win")
    private int _4Win;
    @JsonProperty("5Pick")
    private int _5Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Легенда"
    @JsonProperty("5Win")
    private int _5Win;
    @JsonProperty("6Pick")
    private int _6Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Властелин"
    @JsonProperty("6Win")
    private int _6Win;
    @JsonProperty("7Pick")
    private int _7Pick;   //кол-во раз, когда персонаж был взят игроком ранга "Божество"
    @JsonProperty("7Win")
    private int _7Win;
    @JsonProperty("8Pick")
    private int _8Pick;   //кол-во раз, когда персонаж был взят игроком с рангом "Титан"
    @JsonProperty("8Win")
    private int _8Win;
    @JsonProperty("nullPick")
    private int nullPick;
    @JsonProperty("nullWin")
    private int nullWin;

    public HeroesModel() {
    }

    public HeroesModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("localized_name")
    public String getLocalizedName() {
        return localizedName;
    }

    @JsonProperty("localized_name")
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    @JsonProperty("primary_attr")
    public String getPrimaryAttr() {
        return primaryAttr;
    }

    @JsonProperty("primary_attr")
    public void setPrimaryAttr(String primaryAttr) {
        this.primaryAttr = primaryAttr;
    }

    @JsonProperty("attack_type")
    public String getAttackType() {
        return attackType;
    }

    @JsonProperty("attack_type")
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    @JsonProperty("roles")
    public List<String> getRoles() {
        return roles;
    }

    @JsonProperty("roles")
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @JsonProperty("img")
    public String getImg() {
        return img;
    }

    @JsonProperty("img")
    public void setImg(String img) {
        this.img = img;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("base_health")
    public int getBaseHealth() {
        return baseHealth;
    }

    @JsonProperty("base_health")
    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    @JsonProperty("base_health_regen")
    public double getBaseHealthRegen() {
        return baseHealthRegen;
    }

    @JsonProperty("base_health_regen")
    public void setBaseHealthRegen(double baseHealthRegen) {
        this.baseHealthRegen = baseHealthRegen;
    }

    @JsonProperty("base_mana")
    public int getBaseMana() {
        return baseMana;
    }

    @JsonProperty("base_mana")
    public void setBaseMana(int baseMana) {
        this.baseMana = baseMana;
    }

    @JsonProperty("base_mana_regen")
    public int getBaseManaRegen() {
        return baseManaRegen;
    }

    @JsonProperty("base_mana_regen")
    public void setBaseManaRegen(int baseManaRegen) {
        this.baseManaRegen = baseManaRegen;
    }

    @JsonProperty("base_armor")
    public int getBaseArmor() {
        return baseArmor;
    }

    @JsonProperty("base_armor")
    public void setBaseArmor(int baseArmor) {
        this.baseArmor = baseArmor;
    }

    @JsonProperty("base_mr")
    public int getBaseMr() {
        return baseMr;
    }

    @JsonProperty("base_mr")
    public void setBaseMr(int baseMr) {
        this.baseMr = baseMr;
    }

    @JsonProperty("base_attack_min")
    public int getBaseAttackMin() {
        return baseAttackMin;
    }

    @JsonProperty("base_attack_min")
    public void setBaseAttackMin(int baseAttackMin) {
        this.baseAttackMin = baseAttackMin;
    }

    @JsonProperty("base_attack_max")
    public int getBaseAttackMax() {
        return baseAttackMax;
    }

    @JsonProperty("base_attack_max")
    public void setBaseAttackMax(int baseAttackMax) {
        this.baseAttackMax = baseAttackMax;
    }

    @JsonProperty("base_str")
    public int getBaseStr() {
        return baseStr;
    }

    @JsonProperty("base_str")
    public void setBaseStr(int baseStr) {
        this.baseStr = baseStr;
    }

    @JsonProperty("base_agi")
    public int getBaseAgi() {
        return baseAgi;
    }

    @JsonProperty("base_agi")
    public void setBaseAgi(int baseAgi) {
        this.baseAgi = baseAgi;
    }

    @JsonProperty("base_int")
    public int getBaseInt() {
        return baseInt;
    }

    @JsonProperty("base_int")
    public void setBaseInt(int baseInt) {
        this.baseInt = baseInt;
    }

    @JsonProperty("str_gain")
    public double getStrGain() {
        return strGain;
    }

    @JsonProperty("str_gain")
    public void setStrGain(double strGain) {
        this.strGain = strGain;
    }

    @JsonProperty("agi_gain")
    public int getAgiGain() {
        return agiGain;
    }

    @JsonProperty("agi_gain")
    public void setAgiGain(int agiGain) {
        this.agiGain = agiGain;
    }

    @JsonProperty("int_gain")
    public double getIntGain() {
        return intGain;
    }

    @JsonProperty("int_gain")
    public void setIntGain(double intGain) {
        this.intGain = intGain;
    }

    @JsonProperty("attack_range")
    public int getAttackRange() {
        return attackRange;
    }

    @JsonProperty("attack_range")
    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    @JsonProperty("projectile_speed")
    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    @JsonProperty("projectile_speed")
    public void setProjectileSpeed(int projectileSpeed) {
        this.projectileSpeed = projectileSpeed;
    }

    @JsonProperty("attack_rate")
    public double getAttackRate() {
        return attackRate;
    }

    @JsonProperty("attack_rate")
    public void setAttackRate(double attackRate) {
        this.attackRate = attackRate;
    }

    @JsonProperty("move_speed")
    public int getMoveSpeed() {
        return moveSpeed;
    }

    @JsonProperty("move_speed")
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    @JsonProperty("turn_rate")
    public double getTurnRate() {
        return turnRate;
    }

    @JsonProperty("turn_rate")
    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }

    @JsonProperty("cm_enabled")
    public boolean isCmEnabled() {
        return cmEnabled;
    }

    @JsonProperty("cm_enabled")
    public void setCmEnabled(boolean cmEnabled) {
        this.cmEnabled = cmEnabled;
    }

    @JsonProperty("legs")
    public int getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(int legs) {
        this.legs = legs;
    }

    @JsonProperty("pro_win")
    public int getProWin() {
        return proWin;
    }

    @JsonProperty("pro_win")
    public void setProWin(int proWin) {
        this.proWin = proWin;
    }

    @JsonProperty("pro_pick")
    public int getProPick() {
        return proPick;
    }

    @JsonProperty("pro_pick")
    public void setProPick(int proPick) {
        this.proPick = proPick;
    }

    @JsonProperty("hero_id")
    public int getHeroId() {
        return heroId;
    }

    @JsonProperty("hero_id")
    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    @JsonProperty("pro_ban")
    public int getProBan() {
        return proBan;
    }

    @JsonProperty("pro_ban")
    public void setProBan(int proBan) {
        this.proBan = proBan;
    }

    @JsonProperty("1_pick")
    public int get1Pick() {
        return _1Pick;
    }

    @JsonProperty("1_pick")
    public void set1Pick(int _1Pick) {
        this._1Pick = _1Pick;
    }

    @JsonProperty("1_win")
    public int get1Win() {
        return _1Win;
    }

    @JsonProperty("1_win")
    public void set1Win(int _1Win) {
        this._1Win = _1Win;
    }

    @JsonProperty("2_pick")
    public int get2Pick() {
        return _2Pick;
    }

    @JsonProperty("2_pick")
    public void set2Pick(int _2Pick) {
        this._2Pick = _2Pick;
    }

    @JsonProperty("2_win")
    public int get2Win() {
        return _2Win;
    }

    @JsonProperty("2_win")
    public void set2Win(int _2Win) {
        this._2Win = _2Win;
    }

    @JsonProperty("3_pick")
    public int get3Pick() {
        return _3Pick;
    }

    @JsonProperty("3_pick")
    public void set3Pick(int _3Pick) {
        this._3Pick = _3Pick;
    }

    @JsonProperty("3_win")
    public int get3Win() {
        return _3Win;
    }

    @JsonProperty("3_win")
    public void set3Win(int _3Win) {
        this._3Win = _3Win;
    }

    @JsonProperty("4_pick")
    public int get4Pick() {
        return _4Pick;
    }

    @JsonProperty("4_pick")
    public void set4Pick(int _4Pick) {
        this._4Pick = _4Pick;
    }

    @JsonProperty("4_win")
    public int get4Win() {
        return _4Win;
    }

    @JsonProperty("4_win")
    public void set4Win(int _4Win) {
        this._4Win = _4Win;
    }

    @JsonProperty("5_pick")
    public int get5Pick() {
        return _5Pick;
    }

    @JsonProperty("5_pick")
    public void set5Pick(int _5Pick) {
        this._5Pick = _5Pick;
    }

    @JsonProperty("5_win")
    public int get5Win() {
        return _5Win;
    }

    @JsonProperty("5_win")
    public void set5Win(int _5Win) {
        this._5Win = _5Win;
    }

    @JsonProperty("6_pick")
    public int get6Pick() {
        return _6Pick;
    }

    @JsonProperty("6_pick")
    public void set6Pick(int _6Pick) {
        this._6Pick = _6Pick;
    }

    @JsonProperty("6_win")
    public int get6Win() {
        return _6Win;
    }

    @JsonProperty("6_win")
    public void set6Win(int _6Win) {
        this._6Win = _6Win;
    }

    @JsonProperty("7_pick")
    public int get7Pick() {
        return _7Pick;
    }

    @JsonProperty("7_pick")
    public void set7Pick(int _7Pick) {
        this._7Pick = _7Pick;
    }

    @JsonProperty("7_win")
    public int get7Win() {
        return _7Win;
    }

    @JsonProperty("7_win")
    public void set7Win(int _7Win) {
        this._7Win = _7Win;
    }

    @JsonProperty("8_pick")
    public int get8Pick() {
        return _8Pick;
    }

    @JsonProperty("8_pick")
    public void set8Pick(int _8Pick) {
        this._8Pick = _8Pick;
    }

    @JsonProperty("8_win")
    public int get8Win() {
        return _8Win;
    }

    @JsonProperty("8_win")
    public void set8Win(int _8Win) {
        this._8Win = _8Win;
    }

    @JsonProperty("null_pick")
    public int getNullPick() {
        return nullPick;
    }

    @JsonProperty("null_pick")
    public void setNullPick(int nullPick) {
        this.nullPick = nullPick;
    }

    @JsonProperty("null_win")
    public int getNullWin() {
        return nullWin;
    }

    @JsonProperty("null_win")
    public void setNullWin(int nullWin) {
        this.nullWin = nullWin;
    }

    public static Comparator<HeroesModel> byBaseArmorDesc = (o1, o2) -> Integer.compare(o1.baseArmor, o2.baseArmor);
    public static Comparator<HeroesModel> byBaseArmorAsc = (o1, o2) -> Integer.compare(o2.baseArmor, o1.baseArmor);
    public static Comparator<HeroesModel> byAttackRangDesc = (o1, o2) -> Integer.compare(o1.attackRange, o2.attackRange);
    public static Comparator<HeroesModel> byAttackRangAsc = (o1, o2) -> Integer.compare(o2.attackRange, o1.attackRange);
    public static Comparator<HeroesModel> byMoveSpeedDesc = (o1, o2) -> Integer.compare(o1.moveSpeed, o2.moveSpeed);
    public static Comparator<HeroesModel> byMoveSpeedAsc = (o1, o2) -> Integer.compare(o2.moveSpeed, o1.moveSpeed);
    public static Comparator<HeroesModel> byIntGainDesc = (o1, o2) -> Double.compare(o1.intGain, o2.intGain);
    public static Comparator<HeroesModel> byIntGainAsc = (o1, o2) -> Double.compare(o2.intGain, o1.intGain);
}