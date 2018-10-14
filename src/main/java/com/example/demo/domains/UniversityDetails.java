package com.example.demo.domains;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dsm2061 on 7/31/18.
 */
public class UniversityDetails implements Serializable {

    private String alpha_two_code;
    private List<String> domains;
    private String state_province;
    private List<String> web_page;
    private String country;
    private String name;


    public String getAlpha_two_code() {
        return alpha_two_code;
    }

    public void setAlpha_two_code(String alpha_two_code) {
        this.alpha_two_code = alpha_two_code;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public List<String> getWeb_page() {
        return web_page;
    }

    public void setWeb_page(List<String> web_page) {
        this.web_page = web_page;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
