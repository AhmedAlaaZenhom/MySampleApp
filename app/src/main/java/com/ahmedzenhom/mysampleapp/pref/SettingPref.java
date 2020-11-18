package com.ahmedzenhom.mysampleapp.pref;


import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SettingPref {

    private final static String KEY_TUTORIAL = "tutorial_show";
    private final static String KEY_LOCALE_SELECT = "languageSelected";

    @Inject
    public SettingPref() {
    }

    public void setShowTutorial(boolean b) {
        SharedPrefManager.getInstance().setBoolean(KEY_TUTORIAL, b);
    }

    public boolean showTutorial() {
        return SharedPrefManager.getInstance().getBoolean(KEY_TUTORIAL, true);
    }

    public void setIsLangSelected(boolean b) {
        SharedPrefManager.getInstance().setBoolean(KEY_LOCALE_SELECT, b);
    }

    public boolean isLanguageSelected() {
        return SharedPrefManager.getInstance().getBoolean(KEY_LOCALE_SELECT);
    }
}
