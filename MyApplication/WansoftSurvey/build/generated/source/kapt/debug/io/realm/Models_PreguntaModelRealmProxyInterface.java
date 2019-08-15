package io.realm;


public interface Models_PreguntaModelRealmProxyInterface {
    public int realmGet$Id();
    public void realmSet$Id(int value);
    public int realmGet$SurveyId();
    public void realmSet$SurveyId(int value);
    public String realmGet$Description();
    public void realmSet$Description(String value);
    public int realmGet$Order();
    public void realmSet$Order(int value);
    public int realmGet$Status();
    public void realmSet$Status(int value);
    public Models.TipoPreguntaModel realmGet$QuestionType();
    public void realmSet$QuestionType(Models.TipoPreguntaModel value);
    public Boolean realmGet$Optional();
    public void realmSet$Optional(Boolean value);
    public RealmList<Models.OpcionesPreguntaModel> realmGet$AnswerOptions();
    public void realmSet$AnswerOptions(RealmList<Models.OpcionesPreguntaModel> value);
}
