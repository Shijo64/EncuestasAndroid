package io.realm;


public interface Models_EncuestaModelRealmProxyInterface {
    public Integer realmGet$Id();
    public void realmSet$Id(Integer value);
    public String realmGet$Name();
    public void realmSet$Name(String value);
    public java.util.Date realmGet$CreationDate();
    public void realmSet$CreationDate(java.util.Date value);
    public Integer realmGet$Status();
    public void realmSet$Status(Integer value);
    public Boolean realmGet$Default();
    public void realmSet$Default(Boolean value);
    public RealmList<Models.PreguntaModel> realmGet$Questions();
    public void realmSet$Questions(RealmList<Models.PreguntaModel> value);
}
