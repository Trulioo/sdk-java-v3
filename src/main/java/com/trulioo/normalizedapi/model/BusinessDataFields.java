package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.BusinessLocation;
import com.trulioo.normalizedapi.model.PersonOfSignificantControl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.trulioo.normalizedapi.JSON;

/**
 * The data field name-value pairs for the data elements on which the verification is to be performed
 */

public class BusinessDataFields {
  public static final String SERIALIZED_NAME_BUSINESS_NAME = "BusinessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_TRADESTYLE_NAME = "TradestyleName";
  @SerializedName(SERIALIZED_NAME_TRADESTYLE_NAME)
  private String tradestyleName;

  public static final String SERIALIZED_NAME_TAX_I_D_NUMBER = "TaxIDNumber";
  @SerializedName(SERIALIZED_NAME_TAX_I_D_NUMBER)
  private String taxIDNumber;

  public static final String SERIALIZED_NAME_BUSINESS_REGISTRATION_NUMBER = "BusinessRegistrationNumber";
  @SerializedName(SERIALIZED_NAME_BUSINESS_REGISTRATION_NUMBER)
  private String businessRegistrationNumber;

  public static final String SERIALIZED_NAME_DAY_OF_INCORPORATION = "DayOfIncorporation";
  @SerializedName(SERIALIZED_NAME_DAY_OF_INCORPORATION)
  private Integer dayOfIncorporation;

  public static final String SERIALIZED_NAME_MONTH_OF_INCORPORATION = "MonthOfIncorporation";
  @SerializedName(SERIALIZED_NAME_MONTH_OF_INCORPORATION)
  private Integer monthOfIncorporation;

  public static final String SERIALIZED_NAME_YEAR_OF_INCORPORATION = "YearOfIncorporation";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_INCORPORATION)
  private Integer yearOfIncorporation;

  public static final String SERIALIZED_NAME_JURISDICTION_OF_INCORPORATION = "JurisdictionOfIncorporation";
  @SerializedName(SERIALIZED_NAME_JURISDICTION_OF_INCORPORATION)
  private String jurisdictionOfIncorporation;

  public static final String SERIALIZED_NAME_SHAREHOLDER_LIST_DOCUMENT = "ShareholderListDocument";
  @SerializedName(SERIALIZED_NAME_SHAREHOLDER_LIST_DOCUMENT)
  private Boolean shareholderListDocument;

  public static final String SERIALIZED_NAME_FINANCIAL_INFORMATION_DOCUMENT = "FinancialInformationDocument";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_INFORMATION_DOCUMENT)
  private Boolean financialInformationDocument;

  public static final String SERIALIZED_NAME_DUNS_NUMBER = "DunsNumber";
  @SerializedName(SERIALIZED_NAME_DUNS_NUMBER)
  private String dunsNumber;

  public static final String SERIALIZED_NAME_ENHANCED_PROFILE = "EnhancedProfile";
  @SerializedName(SERIALIZED_NAME_ENHANCED_PROFILE)
  private Boolean enhancedProfile;

  public static final String SERIALIZED_NAME_ENTITIES = "Entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private Boolean entities;

  public static final String SERIALIZED_NAME_PEOPLE_OF_SIGNIFICANT_CONTROL = "PeopleOfSignificantControl";
  @SerializedName(SERIALIZED_NAME_PEOPLE_OF_SIGNIFICANT_CONTROL)
  private List<PersonOfSignificantControl> peopleOfSignificantControl;

  public static final String SERIALIZED_NAME_FILINGS = "Filings";
  @SerializedName(SERIALIZED_NAME_FILINGS)
  private Boolean filings;

  public static final String SERIALIZED_NAME_ARTICLE_OF_ASSOCIATION = "ArticleOfAssociation";
  @SerializedName(SERIALIZED_NAME_ARTICLE_OF_ASSOCIATION)
  private Boolean articleOfAssociation;

  public static final String SERIALIZED_NAME_REGISTRATION_DETAILS = "RegistrationDetails";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_DETAILS)
  private Boolean registrationDetails;

  public static final String SERIALIZED_NAME_ANNUAL_REPORT = "AnnualReport";
  @SerializedName(SERIALIZED_NAME_ANNUAL_REPORT)
  private Boolean annualReport;

  public static final String SERIALIZED_NAME_REGISTER_REPORT = "RegisterReport";
  @SerializedName(SERIALIZED_NAME_REGISTER_REPORT)
  private Boolean registerReport;

  public static final String SERIALIZED_NAME_CREDIT_CHECK = "CreditCheck";
  @SerializedName(SERIALIZED_NAME_CREDIT_CHECK)
  private Boolean creditCheck;

  public static final String SERIALIZED_NAME_CREDIT_REPORT = "CreditReport";
  @SerializedName(SERIALIZED_NAME_CREDIT_REPORT)
  private Boolean creditReport;

  public static final String SERIALIZED_NAME_GISA_EXTRACT = "GISAExtract";
  @SerializedName(SERIALIZED_NAME_GISA_EXTRACT)
  private Boolean gisaExtract;

  public static final String SERIALIZED_NAME_VR_EXTRACT = "VRExtract";
  @SerializedName(SERIALIZED_NAME_VR_EXTRACT)
  private Boolean vrExtract;

  public static final String SERIALIZED_NAME_REGISTER_CHECK = "RegisterCheck";
  @SerializedName(SERIALIZED_NAME_REGISTER_CHECK)
  private Boolean registerCheck;

  public static final String SERIALIZED_NAME_TRADE_REGISTER_REPORT = "TradeRegisterReport";
  @SerializedName(SERIALIZED_NAME_TRADE_REGISTER_REPORT)
  private Boolean tradeRegisterReport;

  public static final String SERIALIZED_NAME_BENEFICIAL_OWNERS_CHECK = "BeneficialOwnersCheck";
  @SerializedName(SERIALIZED_NAME_BENEFICIAL_OWNERS_CHECK)
  private Boolean beneficialOwnersCheck;

  public static final String SERIALIZED_NAME_ANNUAL_ACCOUNTS = "AnnualAccounts";
  @SerializedName(SERIALIZED_NAME_ANNUAL_ACCOUNTS)
  private Boolean annualAccounts;

  public static final String SERIALIZED_NAME_FILED_CHANGES = "FiledChanges";
  @SerializedName(SERIALIZED_NAME_FILED_CHANGES)
  private Boolean filedChanges;

  public static final String SERIALIZED_NAME_FILED_DOCUMENTS = "FiledDocuments";
  @SerializedName(SERIALIZED_NAME_FILED_DOCUMENTS)
  private Boolean filedDocuments;

  public static final String SERIALIZED_NAME_COMPLETE_PLUS = "CompletePlus";
  @SerializedName(SERIALIZED_NAME_COMPLETE_PLUS)
  private Boolean completePlus;

  public static final String SERIALIZED_NAME_ARTICLE_OF_AUTHORITY = "ArticleOfAuthority";
  @SerializedName(SERIALIZED_NAME_ARTICLE_OF_AUTHORITY)
  private Boolean articleOfAuthority;

  public static final String SERIALIZED_NAME_AGENT_ADDRESS_CHANGE = "AgentAddressChange";
  @SerializedName(SERIALIZED_NAME_AGENT_ADDRESS_CHANGE)
  private Boolean agentAddressChange;

  public static final String SERIALIZED_NAME_TELEPHONE = "Telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_COUNTRY_SPECIFIC = "CountrySpecific";
  @SerializedName(SERIALIZED_NAME_COUNTRY_SPECIFIC)
  private Map<String, Map<String, String>> countrySpecific;

  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private List<BusinessLocation> location;

  public BusinessDataFields() {
  }

  public BusinessDataFields businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Name of the business to be verified
   * @return businessName
  **/
  @javax.annotation.Nullable

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public BusinessDataFields tradestyleName(String tradestyleName) {
    
    this.tradestyleName = tradestyleName;
    return this;
  }

   /**
   * Trade Style Name of the business to be verified
   * @return tradestyleName
  **/
  @javax.annotation.Nullable

  public String getTradestyleName() {
    return tradestyleName;
  }


  public void setTradestyleName(String tradestyleName) {
    this.tradestyleName = tradestyleName;
  }


  public BusinessDataFields taxIDNumber(String taxIDNumber) {
    
    this.taxIDNumber = taxIDNumber;
    return this;
  }

   /**
   * Tax ID Number of the business to be verified
   * @return taxIDNumber
  **/
  @javax.annotation.Nullable

  public String getTaxIDNumber() {
    return taxIDNumber;
  }


  public void setTaxIDNumber(String taxIDNumber) {
    this.taxIDNumber = taxIDNumber;
  }


  public BusinessDataFields businessRegistrationNumber(String businessRegistrationNumber) {
    
    this.businessRegistrationNumber = businessRegistrationNumber;
    return this;
  }

   /**
   * Registration number of business to be verified
   * @return businessRegistrationNumber
  **/
  @javax.annotation.Nullable

  public String getBusinessRegistrationNumber() {
    return businessRegistrationNumber;
  }


  public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
    this.businessRegistrationNumber = businessRegistrationNumber;
  }


  public BusinessDataFields dayOfIncorporation(Integer dayOfIncorporation) {
    
    this.dayOfIncorporation = dayOfIncorporation;
    return this;
  }

   /**
   * Day of incorporation of the business to be verified
   * @return dayOfIncorporation
  **/
  @javax.annotation.Nullable

  public Integer getDayOfIncorporation() {
    return dayOfIncorporation;
  }


  public void setDayOfIncorporation(Integer dayOfIncorporation) {
    this.dayOfIncorporation = dayOfIncorporation;
  }


  public BusinessDataFields monthOfIncorporation(Integer monthOfIncorporation) {
    
    this.monthOfIncorporation = monthOfIncorporation;
    return this;
  }

   /**
   * Month of incorporation of the business to be verified
   * @return monthOfIncorporation
  **/
  @javax.annotation.Nullable

  public Integer getMonthOfIncorporation() {
    return monthOfIncorporation;
  }


  public void setMonthOfIncorporation(Integer monthOfIncorporation) {
    this.monthOfIncorporation = monthOfIncorporation;
  }


  public BusinessDataFields yearOfIncorporation(Integer yearOfIncorporation) {
    
    this.yearOfIncorporation = yearOfIncorporation;
    return this;
  }

   /**
   * Year of incorporation of the business to be verified
   * @return yearOfIncorporation
  **/
  @javax.annotation.Nullable

  public Integer getYearOfIncorporation() {
    return yearOfIncorporation;
  }


  public void setYearOfIncorporation(Integer yearOfIncorporation) {
    this.yearOfIncorporation = yearOfIncorporation;
  }


  public BusinessDataFields jurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
    return this;
  }

   /**
   * Jurisdiction Of Incorporation of the business to be verified
   * @return jurisdictionOfIncorporation
  **/
  @javax.annotation.Nullable

  public String getJurisdictionOfIncorporation() {
    return jurisdictionOfIncorporation;
  }


  public void setJurisdictionOfIncorporation(String jurisdictionOfIncorporation) {
    this.jurisdictionOfIncorporation = jurisdictionOfIncorporation;
  }


  public BusinessDataFields shareholderListDocument(Boolean shareholderListDocument) {
    
    this.shareholderListDocument = shareholderListDocument;
    return this;
  }

   /**
   * Whether or not to retrieve shareholderList document
   * @return shareholderListDocument
  **/
  @javax.annotation.Nullable

  public Boolean getShareholderListDocument() {
    return shareholderListDocument;
  }


  public void setShareholderListDocument(Boolean shareholderListDocument) {
    this.shareholderListDocument = shareholderListDocument;
  }


  public BusinessDataFields financialInformationDocument(Boolean financialInformationDocument) {
    
    this.financialInformationDocument = financialInformationDocument;
    return this;
  }

   /**
   * Whether or not to retrieve financial information document
   * @return financialInformationDocument
  **/
  @javax.annotation.Nullable

  public Boolean getFinancialInformationDocument() {
    return financialInformationDocument;
  }


  public void setFinancialInformationDocument(Boolean financialInformationDocument) {
    this.financialInformationDocument = financialInformationDocument;
  }


  public BusinessDataFields dunsNumber(String dunsNumber) {
    
    this.dunsNumber = dunsNumber;
    return this;
  }

   /**
   * Duns Number
   * @return dunsNumber
  **/
  @javax.annotation.Nullable

  public String getDunsNumber() {
    return dunsNumber;
  }


  public void setDunsNumber(String dunsNumber) {
    this.dunsNumber = dunsNumber;
  }

  public BusinessDataFields enhancedProfile(Boolean enhancedProfile) {
    
    this.enhancedProfile = enhancedProfile;
    return this;
  }

   /**
   * Whether or not to retrieve enhancedProfile detail
   * @return enhancedProfile
  **/
  @javax.annotation.Nullable

  public Boolean getEnhancedProfile() {
    return enhancedProfile;
  }


  public void setEnhancedProfile(Boolean enhancedProfile) {
    this.enhancedProfile = enhancedProfile;
  }


  public BusinessDataFields entities(Boolean entities) {
    
    this.entities = entities;
    return this;
  }

   /**
   * Whether or not to retrieve entity detail
   * @return entities
  **/
  @javax.annotation.Nullable

  public Boolean getEntities() {
    return entities;
  }


  public void setEntities(Boolean entities) {
    this.entities = entities;
  }


  public BusinessDataFields peopleOfSignificantControl(List<PersonOfSignificantControl> peopleOfSignificantControl) {
    
    this.peopleOfSignificantControl = peopleOfSignificantControl;
    return this;
  }

  public BusinessDataFields addPeopleOfSignificantControlItem(PersonOfSignificantControl peopleOfSignificantControlItem) {
    if (this.peopleOfSignificantControl == null) {
      this.peopleOfSignificantControl = new ArrayList<>();
    }
    this.peopleOfSignificantControl.add(peopleOfSignificantControlItem);
    return this;
  }

   /**
   * A list of people to check for their matchstatus
   * @return peopleOfSignificantControl
  **/
  @javax.annotation.Nullable

  public List<PersonOfSignificantControl> getPeopleOfSignificantControl() {
    return peopleOfSignificantControl;
  }


  public void setPeopleOfSignificantControl(List<PersonOfSignificantControl> peopleOfSignificantControl) {
    this.peopleOfSignificantControl = peopleOfSignificantControl;
  }


  public BusinessDataFields filings(Boolean filings) {
    
    this.filings = filings;
    return this;
  }

   /**
   * Whether or not to retrieve filing detail
   * @return filings
  **/
  @javax.annotation.Nullable

  public Boolean getFilings() {
    return filings;
  }


  public void setFilings(Boolean filings) {
    this.filings = filings;
  }


  public BusinessDataFields articleOfAssociation(Boolean articleOfAssociation) {
    
    this.articleOfAssociation = articleOfAssociation;
    return this;
  }

   /**
   * Whether or not to retrieve article of association document
   * @return articleOfAssociation
  **/
  @javax.annotation.Nullable

  public Boolean getArticleOfAssociation() {
    return articleOfAssociation;
  }


  public void setArticleOfAssociation(Boolean articleOfAssociation) {
    this.articleOfAssociation = articleOfAssociation;
  }


  public BusinessDataFields registrationDetails(Boolean registrationDetails) {
    
    this.registrationDetails = registrationDetails;
    return this;
  }

   /**
   * Whether or not to retrieve registration detail document
   * @return registrationDetails
  **/
  @javax.annotation.Nullable

  public Boolean getRegistrationDetails() {
    return registrationDetails;
  }


  public void setRegistrationDetails(Boolean registrationDetails) {
    this.registrationDetails = registrationDetails;
  }


  public BusinessDataFields annualReport(Boolean annualReport) {
    
    this.annualReport = annualReport;
    return this;
  }

   /**
   * Whether or not to retrieve annual report document
   * @return annualReport
  **/
  @javax.annotation.Nullable

  public Boolean getAnnualReport() {
    return annualReport;
  }


  public void setAnnualReport(Boolean annualReport) {
    this.annualReport = annualReport;
  }

  public BusinessDataFields registerReport(Boolean registerReport) {
    this.registerReport = registerReport;
    return this;
  }

  /**
   * Whether or not to retrieve register report document
   * @return registerReport
   **/
  @javax.annotation.Nullable
  public Boolean getRegisterReport() {    return registerReport;  }

  public void setRegisterReport(Boolean registerReport) {
    this.registerReport = registerReport;
  }

  public BusinessDataFields creditCheck(Boolean creditCheck) {
    this.creditCheck = creditCheck;
    return this;
  }

  /**
   * Whether or not to retrieve credit check document
   * @return creditCheck
   **/
  @javax.annotation.Nullable
  public Boolean getCreditCheck() {    return creditCheck;  }

  public void setCreditCheck(Boolean creditCheck) {
    this.creditCheck = creditCheck;
  }

  public BusinessDataFields creditReport(Boolean creditReport) {
    this.creditReport = creditReport;
    return this;
  }

  /**
   * Whether or not to retrieve credit report document
   * @return creditReport
   **/
  @javax.annotation.Nullable
  public Boolean getCreditReport() {    return creditReport;  }

  public void setCreditReport(Boolean creditReport) {
    this.creditReport = creditReport;
  }

  public BusinessDataFields gisaExtract(Boolean gisaExtract) {
    this.gisaExtract = gisaExtract;
    return this;
  }

  /**
   * Whether or not to retrieve GISA extract document
   * @return gisaExtract
   **/
  @javax.annotation.Nullable
  public Boolean getGISAExtract() {    return gisaExtract;  }

  public void setGISAExtract(Boolean gisaExtract) {
    this.gisaExtract = gisaExtract;
  }

  public BusinessDataFields vrExtract(Boolean vrExtract) {
    this.vrExtract = vrExtract;
    return this;
  }

  /**
   * Whether or not to retrieve VR extract document
   * @return vrExtract
   **/
  @javax.annotation.Nullable
  public Boolean getVRExtract() {    return vrExtract;  }

  public void setVRExtract(Boolean vrExtract) {
    this.vrExtract = vrExtract;
  }

  public BusinessDataFields registerCheck(Boolean registerCheck) {
    this.registerCheck = registerCheck;
    return this;
  }

  /**
   * Whether or not to retrieve register check document
   * @return registerCheck
   **/
  @javax.annotation.Nullable
  public Boolean getRegisterCheck() {    return registerCheck;  }

  public void setRegisterCheck(Boolean registerCheck) {
    this.registerCheck = registerCheck;
  }

  public BusinessDataFields tradeRegisterReport(Boolean tradeRegisterReport) {
    this.tradeRegisterReport = tradeRegisterReport;
    return this;
  }

  /**
   * Whether or not to retrieve trade register report document
   * @return tradeRegisterReport
   **/
  @javax.annotation.Nullable
  public Boolean getTradeRegisterReport() {    return tradeRegisterReport;  }

  public void setTradeRegisterReport(Boolean tradeRegisterReport) {
    this.tradeRegisterReport = tradeRegisterReport;
  }

  public BusinessDataFields beneficialOwnersCheck(Boolean beneficialOwnersCheck) {
    this.beneficialOwnersCheck = beneficialOwnersCheck;
    return this;
  }

  /**
   * Whether or not to retrieve beneficial owners check document
   * @return beneficialOwnersCheck
   **/
  @javax.annotation.Nullable
  public Boolean getBeneficialOwnersCheck() {    return beneficialOwnersCheck;  }

  public void setBeneficialOwnersCheck(Boolean beneficialOwnersCheck) {
    this.beneficialOwnersCheck = beneficialOwnersCheck;
  }

  public BusinessDataFields filedChanges(Boolean filedChanges) {
    this.filedChanges = filedChanges;
    return this;
  }

  /**
   * Whether or not to retrieve filed changes document
   * @return filedChanges
   **/
  @javax.annotation.Nullable
  public Boolean getFiledChanges() {    return filedChanges;  }

  public void setFiledChanges(Boolean filedChanges) {
    this.filedChanges = filedChanges;
  }

  public BusinessDataFields filedDocuments(Boolean filedDocuments) {
    this.filedDocuments = filedDocuments;
    return this;
  }

  /**
   * Whether or not to retrieve filed documents
   * @return filedDocuments
   **/
  @javax.annotation.Nullable
  public Boolean getFiledDocuments() {    return filedDocuments;  }

  public void setFiledDocuments(Boolean filedDocuments) {
    this.filedDocuments = filedDocuments;
  }

  public BusinessDataFields annualAccounts(Boolean annualAccounts) {
    this.annualAccounts = annualAccounts;
    return this;
  }

  /**
   * Whether or not to retrieve annual accounts document
   * @return annualAccounts
   **/
  @javax.annotation.Nullable
  public Boolean getAnnualAccounts() {    return annualAccounts;  }

  public void setAnnualAccounts(Boolean annualAccounts) {
    this.annualAccounts = annualAccounts;
  }

  public BusinessDataFields completePlus(Boolean completePlus) {
    this.completePlus = completePlus;
    return this;
  }

  /**
   * Whether or not to perform a complete plus transaction
   * @return completePlus
   **/
  @javax.annotation.Nullable
  public Boolean getCompletePlus() {
    return completePlus;
  }

  public void setCompletePlus(Boolean completePlus) {
    this.completePlus = completePlus;
  }

  public BusinessDataFields articleOfAuthority(Boolean articleOfAuthority) {
    this.articleOfAuthority = articleOfAuthority;
    return this;
  }

  /**
   * Whether or not to retrieve article of authority document
   * @return articleOfAuthority
   **/
  @javax.annotation.Nullable
  public Boolean getArticleOfAuthority() {
    return articleOfAuthority;
  }

  public void setArticleOfAuthority(Boolean articleOfAuthority) {
    this.articleOfAuthority = articleOfAuthority;
  }

  public BusinessDataFields agentAddressChange(Boolean agentAddressChange) {
    this.agentAddressChange = agentAddressChange;
    return this;
  }

  /**
   * Whether or not to retrieve agent address change document
   * @return agentAddressChange
   **/
  @javax.annotation.Nullable
  public Boolean getAgentAddressChange() {
    return agentAddressChange;
  }

  public void setAgentAddressChange(Boolean agentAddressChange) {
    this.agentAddressChange = agentAddressChange;
  }



  public BusinessDataFields telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * Telephone number of the business to be verified
   * @return telephone
  **/
  @javax.annotation.Nullable

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public BusinessDataFields countrySpecific(Map<String, Map<String, String>> countrySpecific) {
    
    this.countrySpecific = countrySpecific;
    return this;
  }

  public BusinessDataFields putCountrySpecificItem(String key, Map<String, String> countrySpecificItem) {
    if (this.countrySpecific == null) {
      this.countrySpecific = new HashMap<>();
    }
    this.countrySpecific.put(key, countrySpecificItem);
    return this;
  }

   /**
   * CountrySpecific fields  {\&quot;CountryCode\&quot; : {\&quot;Field1\&quot; : \&quot;Value\&quot;,  \&quot;Field2\&quot; : \&quot;Value\&quot;  }}
   * @return countrySpecific
  **/
  @javax.annotation.Nullable

  public Map<String, Map<String, String>> getCountrySpecific() {
    return countrySpecific;
  }


  public void setCountrySpecific(Map<String, Map<String, String>> countrySpecific) {
    this.countrySpecific = countrySpecific;
  }


  public BusinessDataFields location(List<BusinessLocation> location) {
    
    this.location = location;
    return this;
  }

  public BusinessDataFields addLocationItem(BusinessLocation locationItem) {
    if (this.location == null) {
      this.location = new ArrayList<>();
    }
    this.location.add(locationItem);
    return this;
  }

   /**
   * Location Information
   * @return location
  **/
  @javax.annotation.Nullable

  public List<BusinessLocation> getLocation() {
    return location;
  }


  public void setLocation(List<BusinessLocation> location) {
    this.location = location;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessDataFields businessDataFields = (BusinessDataFields) o;
    return Objects.equals(this.businessName, businessDataFields.businessName) &&
        Objects.equals(this.tradestyleName, businessDataFields.tradestyleName) &&
        Objects.equals(this.taxIDNumber, businessDataFields.taxIDNumber) &&
        Objects.equals(this.businessRegistrationNumber, businessDataFields.businessRegistrationNumber) &&
        Objects.equals(this.dayOfIncorporation, businessDataFields.dayOfIncorporation) &&
        Objects.equals(this.monthOfIncorporation, businessDataFields.monthOfIncorporation) &&
        Objects.equals(this.yearOfIncorporation, businessDataFields.yearOfIncorporation) &&
        Objects.equals(this.jurisdictionOfIncorporation, businessDataFields.jurisdictionOfIncorporation) &&
        Objects.equals(this.shareholderListDocument, businessDataFields.shareholderListDocument) &&
        Objects.equals(this.financialInformationDocument, businessDataFields.financialInformationDocument) &&
        Objects.equals(this.dunsNumber, businessDataFields.dunsNumber) &&
        Objects.equals(this.enhancedProfile, businessDataFields.enhancedProfile) &&
        Objects.equals(this.entities, businessDataFields.entities) &&
        Objects.equals(this.peopleOfSignificantControl, businessDataFields.peopleOfSignificantControl) &&
        Objects.equals(this.filings, businessDataFields.filings) &&
        Objects.equals(this.articleOfAssociation, businessDataFields.articleOfAssociation) &&
        Objects.equals(this.registrationDetails, businessDataFields.registrationDetails) &&
        Objects.equals(this.annualReport, businessDataFields.annualReport) &&
        Objects.equals(this.registerReport, businessDataFields.registerReport) &&
        Objects.equals(this.creditCheck, businessDataFields.creditCheck) &&
        Objects.equals(this.creditReport, businessDataFields.creditReport) &&
        Objects.equals(this.gisaExtract, businessDataFields.gisaExtract) &&
        Objects.equals(this.vrExtract, businessDataFields.vrExtract) &&
        Objects.equals(this.registerCheck, businessDataFields.registerCheck) &&
        Objects.equals(this.tradeRegisterReport, businessDataFields.tradeRegisterReport) &&
        Objects.equals(this.beneficialOwnersCheck, businessDataFields.beneficialOwnersCheck) &&
        Objects.equals(this.filedChanges, businessDataFields.filedChanges) &&
        Objects.equals(this.filedDocuments, businessDataFields.filedDocuments) &&
        Objects.equals(this.annualAccounts, businessDataFields.annualAccounts) &&
        Objects.equals(this.completePlus, businessDataFields.completePlus) &&
        Objects.equals(this.articleOfAuthority, businessDataFields.articleOfAuthority) &&
        Objects.equals(this.agentAddressChange, businessDataFields.agentAddressChange) &&
        Objects.equals(this.telephone, businessDataFields.telephone) &&
        Objects.equals(this.countrySpecific, businessDataFields.countrySpecific) &&
        Objects.equals(this.location, businessDataFields.location);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, tradestyleName, taxIDNumber, businessRegistrationNumber, dayOfIncorporation, monthOfIncorporation, yearOfIncorporation, jurisdictionOfIncorporation, shareholderListDocument, financialInformationDocument, dunsNumber, enhancedProfile, entities, peopleOfSignificantControl, filings, articleOfAssociation, registrationDetails, annualReport, registerReport, creditCheck, creditReport, gisaExtract, vrExtract, registerCheck, tradeRegisterReport, beneficialOwnersCheck, filedChanges, filedDocuments, annualAccounts, completePlus, articleOfAuthority, agentAddressChange, telephone, countrySpecific, location);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessDataFields {\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    tradestyleName: ").append(toIndentedString(tradestyleName)).append("\n");
    sb.append("    taxIDNumber: ").append(toIndentedString(taxIDNumber)).append("\n");
    sb.append("    businessRegistrationNumber: ").append(toIndentedString(businessRegistrationNumber)).append("\n");
    sb.append("    dayOfIncorporation: ").append(toIndentedString(dayOfIncorporation)).append("\n");
    sb.append("    monthOfIncorporation: ").append(toIndentedString(monthOfIncorporation)).append("\n");
    sb.append("    yearOfIncorporation: ").append(toIndentedString(yearOfIncorporation)).append("\n");
    sb.append("    jurisdictionOfIncorporation: ").append(toIndentedString(jurisdictionOfIncorporation)).append("\n");
    sb.append("    shareholderListDocument: ").append(toIndentedString(shareholderListDocument)).append("\n");
    sb.append("    financialInformationDocument: ").append(toIndentedString(financialInformationDocument)).append("\n");
    sb.append("    dunsNumber: ").append(toIndentedString(dunsNumber)).append("\n");
    sb.append("    enhancedProfile: ").append(toIndentedString(enhancedProfile)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    peopleOfSignificantControl: ").append(toIndentedString(peopleOfSignificantControl)).append("\n");
    sb.append("    filings: ").append(toIndentedString(filings)).append("\n");
    sb.append("    articleOfAssociation: ").append(toIndentedString(articleOfAssociation)).append("\n");
    sb.append("    registrationDetails: ").append(toIndentedString(registrationDetails)).append("\n");
    sb.append("    annualReport: ").append(toIndentedString(annualReport)).append("\n");
    sb.append("    registerReport: ").append(toIndentedString(registerReport)).append("\n");
    sb.append("    creditCheck: ").append(toIndentedString(creditCheck)).append("\n");
    sb.append("    creditReport: ").append(toIndentedString(creditReport)).append("\n");
    sb.append("    gisaExtract: ").append(toIndentedString(gisaExtract)).append("\n");
    sb.append("    vrExtract: ").append(toIndentedString(vrExtract)).append("\n");
    sb.append("    registerCheck: ").append(toIndentedString(registerCheck)).append("\n");
    sb.append("    tradeRegisterReport: ").append(toIndentedString(tradeRegisterReport)).append("\n");
    sb.append("    beneficialOwnersCheck: ").append(toIndentedString(beneficialOwnersCheck)).append("\n");
    sb.append("    filedChanges: ").append(toIndentedString(filedChanges)).append("\n");
    sb.append("    filedDocuments: ").append(toIndentedString(filedDocuments)).append("\n");
    sb.append("    annualAccounts: ").append(toIndentedString(annualAccounts)).append("\n");
    sb.append("    completePlus: ").append(toIndentedString(completePlus)).append("\n");
    sb.append("    articleOfAuthority: ").append(toIndentedString(articleOfAuthority)).append("\n");
    sb.append("    agentAddressChange: ").append(toIndentedString(agentAddressChange)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    countrySpecific: ").append(toIndentedString(countrySpecific)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("BusinessName");
    openapiFields.add("TradestyleName");
    openapiFields.add("TaxIDNumber");
    openapiFields.add("BusinessRegistrationNumber");
    openapiFields.add("DayOfIncorporation");
    openapiFields.add("MonthOfIncorporation");
    openapiFields.add("YearOfIncorporation");
    openapiFields.add("JurisdictionOfIncorporation");
    openapiFields.add("ShareholderListDocument");
    openapiFields.add("FinancialInformationDocument");
    openapiFields.add("DunsNumber");
    openapiFields.add("EnhancedProfile");
    openapiFields.add("Entities");
    openapiFields.add("PeopleOfSignificantControl");
    openapiFields.add("Filings");
    openapiFields.add("ArticleOfAssociation");
    openapiFields.add("RegistrationDetails");
    openapiFields.add("AnnualReport");
    openapiFields.add("RegisterReport");
    openapiFields.add("CreditCheck");
    openapiFields.add("CreditReport");
    openapiFields.add("GisaExtract");
    openapiFields.add("VrExtract");
    openapiFields.add("RegisterCheck");
    openapiFields.add("TradeRegisterReport");
    openapiFields.add("BeneficialOwnersCheck");
    openapiFields.add("FiledChanges");
    openapiFields.add("FiledDocuments");
    openapiFields.add("AnnualAccounts");
    openapiFields.add("CompletePlus");
    openapiFields.add("ArticleOfAuthority");
    openapiFields.add("AgentAddressChange");
    openapiFields.add("Telephone");
    openapiFields.add("CountrySpecific");
    openapiFields.add("Location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessDataFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessDataFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessDataFields is not found in the empty JSON string", BusinessDataFields.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessDataFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessDataFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("BusinessName") != null && !jsonObj.get("BusinessName").isJsonNull()) && !jsonObj.get("BusinessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessName").toString()));
      }
      if ((jsonObj.get("TradestyleName") != null && !jsonObj.get("TradestyleName").isJsonNull()) && !jsonObj.get("TradestyleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TradestyleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TradestyleName").toString()));
      }
      if ((jsonObj.get("TaxIDNumber") != null && !jsonObj.get("TaxIDNumber").isJsonNull()) && !jsonObj.get("TaxIDNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TaxIDNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TaxIDNumber").toString()));
      }
      if ((jsonObj.get("BusinessRegistrationNumber") != null && !jsonObj.get("BusinessRegistrationNumber").isJsonNull()) && !jsonObj.get("BusinessRegistrationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BusinessRegistrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BusinessRegistrationNumber").toString()));
      }
      if ((jsonObj.get("JurisdictionOfIncorporation") != null && !jsonObj.get("JurisdictionOfIncorporation").isJsonNull()) && !jsonObj.get("JurisdictionOfIncorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JurisdictionOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JurisdictionOfIncorporation").toString()));
      }
      if ((jsonObj.get("DunsNumber") != null && !jsonObj.get("DunsNumber").isJsonNull()) && !jsonObj.get("DunsNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DunsNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DunsNumber").toString()));
      }
      if (jsonObj.get("PeopleOfSignificantControl") != null && !jsonObj.get("PeopleOfSignificantControl").isJsonNull()) {
        JsonArray jsonArraypeopleOfSignificantControl = jsonObj.getAsJsonArray("PeopleOfSignificantControl");
        if (jsonArraypeopleOfSignificantControl != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PeopleOfSignificantControl").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PeopleOfSignificantControl` to be an array in the JSON string but got `%s`", jsonObj.get("PeopleOfSignificantControl").toString()));
          }

          // validate the optional field `PeopleOfSignificantControl` (array)
          for (int i = 0; i < jsonArraypeopleOfSignificantControl.size(); i++) {
            PersonOfSignificantControl.validateJsonObject(jsonArraypeopleOfSignificantControl.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("Telephone") != null && !jsonObj.get("Telephone").isJsonNull()) && !jsonObj.get("Telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Telephone").toString()));
      }
      if (jsonObj.get("Location") != null && !jsonObj.get("Location").isJsonNull()) {
        JsonArray jsonArraylocation = jsonObj.getAsJsonArray("Location");
        if (jsonArraylocation != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Location").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Location` to be an array in the JSON string but got `%s`", jsonObj.get("Location").toString()));
          }

          // validate the optional field `Location` (array)
          for (int i = 0; i < jsonArraylocation.size(); i++) {
            BusinessLocation.validateJsonObject(jsonArraylocation.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessDataFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessDataFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessDataFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessDataFields.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessDataFields>() {
           @Override
           public void write(JsonWriter out, BusinessDataFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessDataFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessDataFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessDataFields
  * @throws IOException if the JSON string is invalid with respect to BusinessDataFields
  */
  public static BusinessDataFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessDataFields.class);
  }

 /**
  * Convert an instance of BusinessDataFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

