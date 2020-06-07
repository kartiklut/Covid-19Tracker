package com.example.covid_19tracker.ui.country;

public class CovidCountry {

    String mCovidCountry,mCases,MTodayCases,mDeaths,mTodayDeaths,mRecovered,mCritical;

    public CovidCountry(String mCovidCountry, String mCases) {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;
        this.MTodayCases = MTodayCases;
        this.mDeaths = mDeaths;
        this.mTodayDeaths = mTodayDeaths;
        this.mRecovered = mRecovered;
        this.mCritical = mCritical;
    }

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public String getmCases() {

        return mCases;
    }
}
