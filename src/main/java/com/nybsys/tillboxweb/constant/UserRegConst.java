/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 07/03/2018
 * Time: 05:39
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.constant;

public final class UserRegConst {
    public static final String SAVE = "save";
    public static final String GET = "get";
    public static final String GET_ALL = "getAll";
    public static final String GET_BY_ID = "getByID";
    public static final String SEARCH = "search";
    public static final String DELETE = "delete";
    public static final String SELECT = "select";

    public static final String USER_BASE_URL = "api/user/";
    public static final String USER_CONTROLLER_NAME = "User Controller";
    public static final String USER_CONTROLLER_DESCRIPTION = "User related operations";
    public static final String USER_SIGN_UP = "signUp";
    public static final String USER_SIGN_UP_DESCRIPTION = "sign up";
    public static final String USER_SIGN_UP_CONFIRMATION = "signUpConfirmation";
    public static final String USER_SIGN_UP_CONFIRMATION_DESCRIPTION = "sign up user";
    public static final String USER_LOGIN = "login";
    public static final String USER_LOGIN_DESCRIPTION = "login user";
    public static final String USER_GET_ALL_DESCRIPTION = "get all user by business";
    public static final String USER_GET_BY_ID_DESCRIPTION = "user get by id";
    public static final String USER_GET_ACTIVE_USER_LIST_BY_BUSINESS_ID = "getUserListByBusinessID";
    public static final String USER_GET_ACTIVE_USER_LIST_BY_BUSINESS_ID_DESCRIPTION = "get active users by business id";
    public static final String USER_GET_ACTIVE_INACTIVE_INVITED_USER_LIST_BY_BUSINESS_ID = "getUserListActiveAndInactiveAndInvited";
    public static final String USER_GET_ACTIVE_INACTIVE_INVITED_USER_LIST_BY_BUSINESS_ID_DESCRIPTION = "get active, inactive and invited users by business id";
    public static final String USER_EDIT = "editUser";
    public static final String USER_EDIT_DESCRIPTION = "edit user";
    public static final String USER_ACTIVE = "activateUser";
    public static final String USER_ACTIVE_DESCRIPTION = "active user";
    public static final String USER_INACTIVE = "inActivateUser";
    public static final String USER_INACTIVE_DESCRIPTION = "in activate user";

    public static final String BUSINESS_CONTACT_BASE_URL = "api/businessContact/";
    public static final String BUSINESS_CONTACT_CONTROLLER_NAME = "Business Contact Controller";
    public static final String BUSINESS_CONTACT_CONTROLLER_DESCRIPTION = "Business Contact related operations";
    public static final String BUSINESS_CONTACT_SAVE_DESCRIPTION = "business contact save";
    public static final String BUSINESS_CONTACT_GET_BY_ID_DESCRIPTION = "business contact get by id";
    public static final String BUSINESS_CONTACT_SEARCH_DESCRIPTION = "business contact search";
    public static final String BUSINESS_BASE_URL = "api/business/";
    public static final String BUSINESS_CONTROLLER_NAME = "Business Controller";
    public static final String BUSINESS_CONTROLLER_DESCRIPTION = "Business related operations";
    public static final String BUSINESS_SAVE_DESCRIPTION = "business save";
    public static final String BUSINESS_GET_BY_ID_DESCRIPTION = "business get by id";
    public static final String BUSINESS_SELECT_DESCRIPTION = "business select";
    public static final String BUSINESS_SEARCH_DESCRIPTION = "business search";
    public static final String BUSINESS_GET_BY_USER_ID = "getByUserID";
    public static final String BUSINESS_GET_BY_USER_ID_DESCRIPTION = "get business by user id";
    public static final String BUSINESS_GET_BUSINESS_OPTIONS = "BusinessOptions/get";
    public static final String BUSINESS_GET_BUSINESS_OPTIONS_DESCRIPTION = "get business options";

    public static final String BUSINESS_DETAILS_BASE_URL = "api/businessDetails/";
    public static final String BUSINESS_DETAILS_CONTROLLER_NAME = "Business Details Controller";
    public static final String BUSINESS_DETAILS_CONTROLLER_DESCRIPTION = "Business Details related operations";
    public static final String BUSINESS_DETAILS_SAVE_DESCRIPTION = "business details save";
    public static final String BUSINESS_DETAILS_GET_BY_ID_DESCRIPTION = "business details get by id";
    public static final String BUSINESS_DETAILS_SEARCH_DESCRIPTION = "business details search";

    public static final String COUNTRY_BASE_URL = "api/country/";
    public static final String COUNTRY_CONTROLLER_NAME = "Country Controller";
    public static final String COUNTRY_CONTROLLER_DESCRIPTION = "Country related operations";
    public static final String COUNTRY_SAVE_DESCRIPTION = "country save";
    public static final String COUNTRY_GET_BY_ID_DESCRIPTION = "country get by id";
    public static final String COUNTRY_SEARCH_DESCRIPTION = "country search";
    public static final String COUNTRY_GET_ALL_DESCRIPTION = "country get all";

    public static final String CURRENCY_BASE_URL = "api/currency/";
    public static final String CURRENCY_CONTROLLER_NAME = "Currency Controller";
    public static final String CURRENCY_CONTROLLER_DESCRIPTION = "Currency related operations";
    public static final String CURRENCY_SAVE_DESCRIPTION = "currency save";
    public static final String CURRENCY_SEARCH_DESCRIPTION = "currency search";
    public static final String CURRENCY_GET_ALL_DESCRIPTION = "currency get all";
    public static final String CURRENCY_SELECT_DESCRIPTION = "currency get all";
    public static final String CURRENCY_GET_CURRENCY_EXCHANGE_RATE = "getCurrencyExchangeRate";
    public static final String CURRENCY_GET_CURRENCY_EXCHANGE_RATE_DESCRIPTION = "get currency exchange rate by business id , transaction date and customer/supplier id";
    public static final String CURRENCY_GET_ALL_CURRENCY_EXCHANGE_RATE = "getAllCurrencyExchangeRate";
    public static final String CURRENCY_GET_ALL_CURRENCY_EXCHANGE_RATE_DESCRIPTION = "get all currency exchange rate by business id";

    public static final String CURRENCY_EXCHANGE_RATE_BASE_URL = "api/currencyExchangeRate/";
    public static final String CURRENCY_EXCHANGE_RATE_CONTROLLER_NAME = "Currency Exchange Rate Controller";
    public static final String CURRENCY_EXCHANGE_RATE_CONTROLLER_DESCRIPTION = "Currency Exchange Rate related operations";
    public static final String CURRENCY_EXCHANGE_RATE_SAVE_DESCRIPTION = "currency exchange rate save";
    public static final String CURRENCY_EXCHANGE_RATE_GET_BY_ID_DESCRIPTION = "currency exchange rate get by id";
    public static final String CURRENCY_EXCHANGE_RATE_SEARCH_DESCRIPTION = "currency exchange rate search";
    public static final String BASE_CURRENCY_GET = "getBaseCurrency";
    public static final String BASE_CURRENCY_GET_DESCRIPTION = "get base currency and exchange rate";

    public static final String GST_SETTING_BASE_URL = "api/gstSettings/";
    public static final String GST_SETTING_CONTROLLER_NAME = "GST Setting Controller";
    public static final String GST_SETTING_CONTROLLER_DESCRIPTION = "GST Setting related operations";
    public static final String GST_SETTING_SAVE_DESCRIPTION = "GST setting save";
    public static final String GST_SETTING_GET_BY_ID_DESCRIPTION = "GST setting get by id";
    public static final String GST_SETTING_GET_BY_BUSINESS_ID = "getByBusinessID";
    public static final String GST_SETTING_GET_BY_BUSINESS_ID_DESCRIPTION = "GST setting get by business id";

    public static final String USER_INVITE_BASE_URL = "api/userInvite/";
    public static final String USER_INVITE_CONTROLLER_NAME = "User Invite Controller";
    public static final String USER_INVITE_CONTROLLER_DESCRIPTION = "User Invite related operations";
    public static final String USER_INVITE_INVITE = "invite";
    public static final String USER_INVITE_INVITE_DESCRIPTION = " user invite";
    public static final String USER_INVITE_SEARCH_DESCRIPTION = "User Invite search";
    public static final String USER_INVITE_RE_INVITE = "reInvite";
    public static final String USER_INVITE_RE_INVITE_DESCRIPTION = "user re-invite";
    public static final String USER_INVITE_REMOVE_INVITATION = "removeInvitation";
    public static final String USER_INVITE_REMOVE_INVITATION_DESCRIPTION = " user remove invitation";
    public static final String USER_INVITE_CREATE_USER_WITH_BUSINESS_ID = "createUserWithBusinessId";
    public static final String USER_INVITE_CREATE_USER_WITH_BUSINESS_ID_DESCRIPTION = "create user with business id";

    public static final String PASSWORD_BASE_URL = "api/";
    public static final String PASSWORD_CONTROLLER_NAME = "Password Controller";
    public static final String PASSWORD_CONTROLLER_DESCRIPTION = "Password related operations";
    public static final String PASSWORD_FORGET_PASSWORD_GET = "forgetPassword/userID/get";
    public static final String PASSWORD_FORGET_PASSWORD_GET_DESCRIPTION = "forget password get";
    public static final String PASSWORD_FORGET_PASSWORD_UPDATE = "forgetPassword/update";
    public static final String PASSWORD_FORGET_PASSWORD_UPDATE_DESCRIPTION = "forget password update";
    public static final String PASSWORD_CHANGE_PASSWORD_UPDATE = "changePassword/update";
    public static final String PASSWORD_CHANGE_PASSWORD_UPDATE_DESCRIPTION = "change password update";

    public static final String ADDITIONAL_COMPANY_INFORMATION_CONTROLLER_NAME = "Additional company information Controller";
    public static final String ADDITIONAL_COMPANY_INFORMATION_BASE_URL = "api/additionalCompanyInformation/";
    public static final String ADDITIONAL_COMPANY_INFORMATION_SAVE_DESCRIPTION = "additional company information save";
    public static final String ADDITIONAL_COMPANY_INFORMATION_SEARCH_DESCRIPTION = "additional company information search";

    public static final String COMPANY_DETAIL_CONTROLLER_NAME = "Company detail Controller";
    public static final String COMPANY_DETAIL_BASE_URL = "api/companyDetail/";
    public static final String COMPANY_DETAIL_SAVE_DESCRIPTION = "company detail save";
    public static final String COMPANY_DETAIL_SEARCH_DESCRIPTION = "company detail search";

    public static final String COMPANY_AND_SUPPLIER_SETTING_CONTROLLER_NAME = "Customer and Supplier setting Controller";
    public static final String COMPANY_AND_SUPPLIER_SETTING_BASE_URL = "api/customerAndSupplierSetting/";
    public static final String COMPANY_AND_SUPPLIER_SETTING_SAVE_DESCRIPTION = "customer and supplier setting save";
    public static final String COMPANY_AND_SUPPLIER_SETTING_SEARCH_DESCRIPTION = "customer and supplier setting search";

    public static final String DOCUMENT_DESCRIPTION_CONTROLLER_NAME = "Document description Controller";
    public static final String DOCUMENT_DESCRIPTION_BASE_URL = "api/documentDescription/";
    public static final String DOCUMENT_DESCRIPTION_SAVE_DESCRIPTION = "document description save";
    public static final String DOCUMENT_DESCRIPTION_SEARCH_DESCRIPTION = "document description search";

    public static final String STATEMENT_MESSAGE_CONTROLLER_NAME = "Statement message Controller";
    public static final String STATEMENT_MESSAGE_BASE_URL = "api/statementMessage/";
    public static final String STATEMENT_MESSAGE_SAVE_DESCRIPTION = "statement message save";
    public static final String STATEMENT_MESSAGE_SEARCH_DESCRIPTION = "statement message search";

    public static final String DOCUMENT_MESSAGE_CONTROLLER_NAME = "Document message Controller";
    public static final String DOCUMENT_MESSAGE_BASE_URL = "api/documentMessage/";
    public static final String DOCUMENT_MESSAGE_SAVE_DESCRIPTION = "document message save";
    public static final String DOCUMENT_MESSAGE_SEARCH_DESCRIPTION = "document message search";

    public static final String DOCUMENT_NUMBER_CONTROLLER_NAME = "Document number Controller";
    public static final String DOCUMENT_NUMBER_BASE_URL = "api/documentNumber/";
    public static final String DOCUMENT_NUMBER_SAVE_DESCRIPTION = "document number save";
    public static final String DOCUMENT_NUMBER_SEARCH_DESCRIPTION = "document number search";

    public static final String VAT_RATE_CONTROLLER_NAME = "VAT rate Controller";
    public static final String VAT_RATE_BASE_URL = "api/vATRate/";
    public static final String VAT_RATE_SAVE_DESCRIPTION = "vat rate save";
    public static final String VAT_RATE_SEARCH_DESCRIPTION = "vat rate search";

    public static final String VAT_SYSTEM_CONTROLLER_NAME = "VAT system Controller";
    public static final String VAT_SYSTEM_BASE_URL = "api/vATSystem/";
    public static final String VAT_SYSTEM_SAVE_DESCRIPTION = "vat system save";
    public static final String VAT_SYSTEM_SEARCH_DESCRIPTION = "vat system search";

    public static final String INVOICE_STATEMENT_LAYOUT_TYPE_CONTROLLER_NAME = "Invoice statement layout Controller";
    public static final String INVOICE_STATEMENT_LAYOUT_TYPE_BASE_URL = "api/invoiceStatementLayout/";
    public static final String INVOICE_STATEMENT_LAYOUT_TYPE_SAVE_DESCRIPTION = "invoice statement layout type save";
    public static final String INVOICE_STATEMENT_LAYOUT_TYPE_SEARCH_DESCRIPTION = "invoice statement layout search";

    public static final String CURRENCY_SETTING_BASE_URL = "api/currencySetting/";
    public static final String CURRENCY_SETTING_CONTROLLER_NAME = "Currency Setting Controller";
    public static final String CURRENCY_SETTING_CONTROLLER_DESCRIPTION = "currency setting related operation";
    public static final String CURRENCY_SETTING_SAVE_DESCRIPTION = "save currency setting";
    public static final String CURRENCY_SETTING_GET_BY_BUSINESS_ID = "getByBusinessID";
    public static final String CURRENCY_SETTING_GET_BY_BUSINESS_ID_DESCRIPTION = "get currency setting by business ID";

    public static final String USER_DEFINE_FIELD_CONTROLLER_NAME = "User define field Controller";
    public static final String USER_DEFINE_FIELD_BASE_URL = "api/userDefineField/";
    public static final String USER_DEFINE_FIELD_SAVE_DESCRIPTION = "user define field save";
    public static final String USER_DEFINE_FIELD_SEARCH_DESCRIPTION = "user define field search";

    public static final String BRANDING_BASE_URL = "api/userRegistration/brandingSetting/";
    public static final String BRANDING_CONTROLLER_NAME = "Branding Setting Controller";
    public static final String BRANDING_CONTROLLER_DESCRIPTION = "brand setting related operation";
    public static final String BRANDING_SAVE_DESCRIPTION = "save brand setting";
    public static final String BRANDING_SEARCH_DESCRIPTION = "get brand setting this business";

}
