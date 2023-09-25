# Trulioo SDK for Java #

## Version 3.0.4

### Introduction

Trulioo provides a collection of API methods to help you build business processes powered by the GlobalGateway Normalized API. The Normalized API is a loosely coupled API; fields may be added to our services and responses as the API evolves, and a client must be able to safely ignore fields and data that are not expected. The GlobalGateway Normalized API can help automate your business processes by performing the following tasks:

#### Identity Verification

Electronic identity verification (eIDV) was created specifically to help your business comply with Anti-Money Laundering (AML) and Know Your Customer (KYC) rules and has since evolved to support a diverse range of international electronic identity verification requirements.

#### Document Verification

ID Document Verification analyzes, verifies, and authenticates 3,500 different types of identity documents from nearly every country in the world. The combination of eIDV and ID Document Verification during the Customer Due Diligence check can assist your business in meeting your AML, KYC and Counter Terrorist Financing (CTF) compliance requirements.

#### Business Verification

Business Verification analyzes, verifies and provides data intelligence for business entities in 83 countries. During Customer Due Diligence, Business Verification assists clients to automate compliance workflows, reduce manual front-to- back office operations, take advantage of digital processes, decrease the risk of fraud, and allow staff to focus on key compliance considerations.

#### AML Watchlist

Global AML Watchlist helps your business comply with domestic and international AML, CTF and sanctions enforcement regulations. The watchlist covers sanction lists, law enforcements lists and governing regulatory bodies from around the world.
## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.trulioo</groupId>
  <artifactId>normalizedapi</artifactId>
  <version>3.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'normalizedapi' jar has been published to maven central.
    mavenLocal()       // Needed if the 'normalizedapi' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.trulioo:normalizedapi:3.0.2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/normalizedapi-3.0.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.trulioo.normalizedapi.ApiClient;
import com.trulioo.normalizedapi.ApiException;
import com.trulioo.normalizedapi.Configuration;
import com.trulioo.normalizedapi.auth.*;
import com.trulioo.normalizedapi.models.*;
import com.trulioo.normalizedapi.api.BusinessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient client = new ApiClient("-- Client ID --", "-- CLIENT SECRET --");

    BusinessApi apiInstance = new BusinessApi(client);
    BusinessSearchRequest businessSearchRequest = new BusinessSearchRequest(); // BusinessSearchRequest | 
    try {
      BusinessSearchResponse result = apiInstance.businessSearch(businessSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessApi#businessSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.trulioo.com*

| Class              | Method                                                                                                               | HTTP request                                                                      | Description                                  |
|--------------------|----------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------|----------------------------------------------|
| *BusinessApi*      | [**businessSearch**](docs/BusinessApi.md#businessSearch)                                                             | **POST** /v3/business/search                                                      | Search                                       |
| *BusinessApi*      | [**businessVerify**](docs/BusinessApi.md#businessVerify)                                                             | **POST** /v3/business/verify                                                      | Verify                                       |
| *BusinessApi*      | [**getBusinessRegistrationNumbers**](docs/BusinessApi.md#getBusinessRegistrationNumbers)                             | **GET** /v3/business/businessregistrationnumbers                                  | GetBusinessRegistrationNumbers               |
| *BusinessApi*      | [**getBusinessRegistrationNumbersWithParameters**](docs/BusinessApi.md#getBusinessRegistrationNumbersWithParameters) | **GET** /v3/business/businessregistrationnumbers/{countryCode}/{jurisdictionCode} | getBusinessRegistrationNumbersWithParameters |
| *BusinessApi*      | [**getCountryJOI**](docs/BusinessApi.md#getCountryJOI)                                                               | **GET** /v3/business/countryJOI/                                                  | GetCountryJOI                                |
| *BusinessApi*      | [**getCountryJOIWithCountryCode**](docs/BusinessApi.md#getCountryJOIWithCountryCode)                                 | **GET** /v3/business/countryJOI/{countryCode}                                     | getCountryJOIWithCountryCode                 |
| *ConfigurationApi* | [**getAllDatasources**](docs/ConfigurationApi.md#getAllDatasources)                                                  | **GET** /v3/configuration/alldatasources/{packageID}                              | Get All Datasources by Country               |
| *ConnectionApi*    | [**sayHello**](docs/ConnectionApi.md#sayHello)                                                                       | **GET** /v3/connection/sayhello/{name}                                            | SayHello                                     |
| *ConnectionApi*    | [**testAuthentication**](docs/ConnectionApi.md#testAuthentication)                                                   | **GET** /v3/connection/testauthentication                                         | TestAuthentication                           |
| *VerificationsApi* | [**getDocumentDownload**](docs/VerificationsApi.md#getDocumentDownload)                                              | **GET** /v3/verifications/documentdownload/{transactionRecordID}/{fieldName}      | DocumentDownload                             |
| *VerificationsApi* | [**getPartialResult**](docs/VerificationsApi.md#getPartialResult)                                                    | **GET** /v3/verifications/transaction/{transactionID}/partialresult               | PartialResult                                |
| *VerificationsApi* | [**getTransactionRecord**](docs/VerificationsApi.md#getTransactionRecord)                                            | **GET** /v3/verifications/transactionrecord/{transactionRecordID}                 | GetTransactionRecord                         |
| *VerificationsApi* | [**getTransactionStatus**](docs/VerificationsApi.md#getTransactionStatus)                                            | **GET** /v3/verifications/transaction/{transactionID}/status                      | GetTransactionStatus                         |
| *VerificationsApi* | [**verify**](docs/VerificationsApi.md#verify)                                                                        | **POST** /v3/verifications/verify                                                 | Verify                                       |

## Documentation for Models

- [Address](docs/Address.md)
- [AppendedField](docs/AppendedField.md)
- [Business](docs/Business.md)
- [BusinessDataFields](docs/BusinessDataFields.md)
- [BusinessLocation](docs/BusinessLocation.md)
- [BusinessRecord](docs/BusinessRecord.md)
- [BusinessRegistrationNumber](docs/BusinessRegistrationNumber.md)
- [BusinessRegistrationNumberMask](docs/BusinessRegistrationNumberMask.md)
- [BusinessResult](docs/BusinessResult.md)
- [BusinessSearchRequest](docs/BusinessSearchRequest.md)
- [BusinessSearchRequestBusinessSearchModel](docs/BusinessSearchRequestBusinessSearchModel.md)
- [BusinessSearchResponse](docs/BusinessSearchResponse.md)
- [BusinessSearchResponseIndustryCode](docs/BusinessSearchResponseIndustryCode.md)
- [BusinessVerifyRequest](docs/BusinessVerifyRequest.md)
- [BusinessVerifyRequestMetadata](docs/BusinessVerifyRequestMetadata.md)
- [CommonProviderCacheSchema](docs/CommonProviderCacheSchema.md)
- [CommonRequiredFieldMetadata](docs/CommonRequiredFieldMetadata.md)
- [Communication](docs/Communication.md)
- [Consent](docs/Consent.md)
- [CountrySubdivision](docs/CountrySubdivision.md)
- [DataField](docs/DataField.md)
- [DataFields](docs/DataFields.md)
- [DatasourceField](docs/DatasourceField.md)
- [DatasourceResult](docs/DatasourceResult.md)
- [DemoPause](docs/DemoPause.md)
- [Document](docs/Document.md)
- [DriverLicence](docs/DriverLicence.md)
- [Location](docs/Location.md)
- [LocationAdditionalFields](docs/LocationAdditionalFields.md)
- [LoginSchemaRequest](docs/LoginSchemaRequest.md)
- [NationalId](docs/NationalId.md)
- [Passport](docs/Passport.md)
- [PersonInfo](docs/PersonInfo.md)
- [PersonInfoAdditionalFields](docs/PersonInfoAdditionalFields.md)
- [PersonOfSignificantControl](docs/PersonOfSignificantControl.md)
- [ProblemDetails](docs/ProblemDetails.md)
- [Record](docs/Record.md)
- [RecordRule](docs/RecordRule.md)
- [Result](docs/Result.md)
- [RiskMonitorSettings](docs/RiskMonitorSettings.md)
- [ServiceError](docs/ServiceError.md)
- [SubmitAddressVerificationCredentialsRequest](docs/SubmitAddressVerificationCredentialsRequest.md)
- [TransactionRecordResult](docs/TransactionRecordResult.md)
- [TransactionStatus](docs/TransactionStatus.md)
- [VerifyAddressCredentials](docs/VerifyAddressCredentials.md)
- [VerifyAddressRequest](docs/VerifyAddressRequest.md)
- [VerifyAddressResult](docs/VerifyAddressResult.md)
- [VerifyRequest](docs/VerifyRequest.md)
- [VerifyRequestMetadata](docs/VerifyRequestMetadata.md)
- [VerifyResult](docs/VerifyResult.md)
- [VerifyResultPartial](docs/VerifyResultPartial.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: https://auth-api.globaldatacompany.com/connect/token
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

### Changelog

The [CHANGELOG.md](https://github.com/Trulioo/sdk-java-v3/blob/master/CHANGELOG.md) file in the root of the repository contains a description of changes for each version of the SDK.

### Documentation and resources

If you need to know more:

* For more about the Trulioo REST API V3, see the [REST API Reference](https://developer.trulioo.com/reference/trulioo-normalized-api-intro).

* For starter guides, product information and best practices see the [Documentation](https://developer.trulioo.com/docs).

* For more about Trulioo in general, see [Trulioo Website](https://www.trulioo.com/).

### Support


1. You will be granted support if you or your company are already covered under an existing maintenance/support agreement. Send an email to _support@trulioo.com_ and include "Trulioo SDK for Java V3" in the subject line.

2. Trulioo will NOT provide support for the extension if the core library has been modified. We would also like to know why you modified the code please send feedback to _support@trulioo.com_

### Contact Us

You can reach via channels listed on [Trulioo website](https://www.trulioo.com/company/contact-us/)

## License

The Trulioo SDK v3 for Java is licensed under the Apache License 2.0. Details about the license can be found in the LICENSE file. Copyright 2023 Trulioo Information Services Inc. Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.



