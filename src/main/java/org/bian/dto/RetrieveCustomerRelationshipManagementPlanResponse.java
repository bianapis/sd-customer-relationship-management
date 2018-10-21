package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveCustomerRelationshipManagementPlanResponse
 */
public class RetrieveCustomerRelationshipManagementPlanResponse   {
  private String customerRelationshipPlanReference = null;

  private String customerRelationshipPlan = null;

  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerRelationshipRatingType = null;

  private String customerRelationshipRating = null;

  private String customerInsightType = null;

  private String customerInsightDescription = null;

  private String customerBudget = null;

  private String customerProductCoverage = null;

  private String customerProductUsage = null;

  private String customerProductEligibilityProfile = null;

  private String customerSalesPlan = null;

  private String customerProfitability = null;

  private String customerRelationshipContactHistory = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerRelationshipPlanReference
  **/

  public String getCustomerRelationshipPlanReference() {
    return customerRelationshipPlanReference;
  }

  public void setCustomerRelationshipPlanReference(String customerRelationshipPlanReference) {
    this.customerRelationshipPlanReference = customerRelationshipPlanReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipPlan
  **/

  public String getCustomerRelationshipPlan() {
    return customerRelationshipPlan;
  }

  public void setCustomerRelationshipPlan(String customerRelationshipPlan) {
    this.customerRelationshipPlan = customerRelationshipPlan;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipRatingType
  **/

  public String getCustomerRelationshipRatingType() {
    return customerRelationshipRatingType;
  }

  public void setCustomerRelationshipRatingType(String customerRelationshipRatingType) {
    this.customerRelationshipRatingType = customerRelationshipRatingType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipRating
  **/

  public String getCustomerRelationshipRating() {
    return customerRelationshipRating;
  }

  public void setCustomerRelationshipRating(String customerRelationshipRating) {
    this.customerRelationshipRating = customerRelationshipRating;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerInsightType
  **/

  public String getCustomerInsightType() {
    return customerInsightType;
  }

  public void setCustomerInsightType(String customerInsightType) {
    this.customerInsightType = customerInsightType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerInsightDescription
  **/

  public String getCustomerInsightDescription() {
    return customerInsightDescription;
  }

  public void setCustomerInsightDescription(String customerInsightDescription) {
    this.customerInsightDescription = customerInsightDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBudget
  **/

  public String getCustomerBudget() {
    return customerBudget;
  }

  public void setCustomerBudget(String customerBudget) {
    this.customerBudget = customerBudget;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerProductCoverage
  **/

  public String getCustomerProductCoverage() {
    return customerProductCoverage;
  }

  public void setCustomerProductCoverage(String customerProductCoverage) {
    this.customerProductCoverage = customerProductCoverage;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerProductUsage
  **/

  public String getCustomerProductUsage() {
    return customerProductUsage;
  }

  public void setCustomerProductUsage(String customerProductUsage) {
    this.customerProductUsage = customerProductUsage;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerProductEligibilityProfile
  **/

  public String getCustomerProductEligibilityProfile() {
    return customerProductEligibilityProfile;
  }

  public void setCustomerProductEligibilityProfile(String customerProductEligibilityProfile) {
    this.customerProductEligibilityProfile = customerProductEligibilityProfile;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerSalesPlan
  **/

  public String getCustomerSalesPlan() {
    return customerSalesPlan;
  }

  public void setCustomerSalesPlan(String customerSalesPlan) {
    this.customerSalesPlan = customerSalesPlan;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Measure 
   * @return customerProfitability
  **/

  public String getCustomerProfitability() {
    return customerProfitability;
  }

  public void setCustomerProfitability(String customerProfitability) {
    this.customerProfitability = customerProfitability;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerRelationshipContactHistory
  **/

  public String getCustomerRelationshipContactHistory() {
    return customerRelationshipContactHistory;
  }

  public void setCustomerRelationshipContactHistory(String customerRelationshipContactHistory) {
    this.customerRelationshipContactHistory = customerRelationshipContactHistory;
  }


}

