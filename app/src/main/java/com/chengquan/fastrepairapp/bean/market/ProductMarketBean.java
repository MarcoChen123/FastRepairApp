package com.chengquan.fastrepairapp.bean.market;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductMarketBean {

    @SerializedName("HotProducts")
    private List<HotProductsBean> hotProducts;
    @SerializedName("FlashSaleProducts")
    private List<?> flashSaleProducts;
    @SerializedName("ShopList")
    private List<ShopListBean> shopList;

    public List<HotProductsBean> getHotProducts() {
        return hotProducts;
    }

    public void setHotProducts(List<HotProductsBean> hotProducts) {
        this.hotProducts = hotProducts;
    }

    public List<?> getFlashSaleProducts() {
        return flashSaleProducts;
    }

    public void setFlashSaleProducts(List<?> flashSaleProducts) {
        this.flashSaleProducts = flashSaleProducts;
    }

    public List<ShopListBean> getShopList() {
        return shopList;
    }

    public void setShopList(List<ShopListBean> shopList) {
        this.shopList = shopList;
    }

    public static class HotProductsBean {
        @SerializedName("Id")
        private Integer id;
        @SerializedName("ShopId")
        private Integer shopId;
        @SerializedName("CategoryId")
        private Integer categoryId;
        @SerializedName("CategoryPath")
        private String categoryPath;
        @SerializedName("CategoryTopId")
        private Integer categoryTopId;
        @SerializedName("TypeId")
        private Integer typeId;
        @SerializedName("BrandId")
        private Integer brandId;
        @SerializedName("ProductName")
        private String productName;
        @SerializedName("ProductCode")
        private String productCode;
        @SerializedName("ShortDescription")
        private String shortDescription;
        @SerializedName("SaleStatus")
        private Integer saleStatus;
        @SerializedName("AddedDate")
        private String addedDate;
        @SerializedName("DisplaySequence")
        private Integer displaySequence;
        @SerializedName("MarketPrice")
        private Double marketPrice;
        @SerializedName("MinSalePrice")
        private Double minSalePrice;
        @SerializedName("HasSKU")
        private Boolean hasSKU;
        @SerializedName("VistiCounts")
        private Integer vistiCounts;
        @SerializedName("SaleCounts")
        private Integer saleCounts;
        @SerializedName("VirtualSaleCounts")
        private Integer virtualSaleCounts;
        @SerializedName("AuditStatus")
        private Integer auditStatus;
        @SerializedName("FreightTemplateId")
        private Integer freightTemplateId;
        @SerializedName("Weight")
        private Double weight;
        @SerializedName("Volume")
        private Double volume;
        @SerializedName("Quantity")
        private Integer quantity;
        @SerializedName("MeasureUnit")
        private String measureUnit;
        @SerializedName("EditStatus")
        private Integer editStatus;
        @SerializedName("ConcernedCount")
        private Integer concernedCount;
        @SerializedName("ImagePath")
        private String imagePath;
        @SerializedName("RelativePath")
        private String relativePath;
        @SerializedName("IsDeleted")
        private Boolean isDeleted;
        @SerializedName("MaxBuyCount")
        private Integer maxBuyCount;
        @SerializedName("OrderCounts")
        private Integer orderCounts;
        @SerializedName("Address")
        private Object address;
        @SerializedName("ShopName")
        private Object shopName;
        @SerializedName("BrandName")
        private Object brandName;
        @SerializedName("IsOpenLadder")
        private Boolean isOpenLadder;
        @SerializedName("VersionAlias")
        private Object versionAlias;
        @SerializedName("SizeAlias")
        private Object sizeAlias;
        @SerializedName("ColorAlias")
        private Object colorAlias;
        @SerializedName("VideoPath")
        private Object videoPath;
        @SerializedName("ShopDisplaySequence")
        private Integer shopDisplaySequence;
        @SerializedName("ProductType")
        private Integer productType;
        @SerializedName("CategoryNames")
        private Object categoryNames;
        @SerializedName("IsCategory")
        private Integer isCategory;
        @SerializedName("TopId")
        private Integer topId;
        @SerializedName("BottomId")
        private Integer bottomId;
        @SerializedName("ShowProductState")
        private String showProductState;
        @SerializedName("Description")
        private Object description;
        @SerializedName("SKUS")
        private Object sKUS;
        @SerializedName("Attributes")
        private Object attributes;
        @SerializedName("Specifications")
        private Object specifications;
        @SerializedName("ValidityType")
        private Boolean validityType;
        @SerializedName("StartDate")
        private Object startDate;
        @SerializedName("EndDate")
        private Object endDate;
        @SerializedName("EffectiveType")
        private Integer effectiveType;
        @SerializedName("Hour")
        private Integer hour;
        @SerializedName("SupportRefundType")
        private Integer supportRefundType;
        @SerializedName("UseNotice")
        private Object useNotice;
        @SerializedName("VirtualProductItemInfo")
        private Object virtualProductItemInfo;
        @SerializedName("LadderPrices")
        private Object ladderPrices;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getShopId() {
            return shopId;
        }

        public void setShopId(Integer shopId) {
            this.shopId = shopId;
        }

        public Integer getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryPath() {
            return categoryPath;
        }

        public void setCategoryPath(String categoryPath) {
            this.categoryPath = categoryPath;
        }

        public Integer getCategoryTopId() {
            return categoryTopId;
        }

        public void setCategoryTopId(Integer categoryTopId) {
            this.categoryTopId = categoryTopId;
        }

        public Integer getTypeId() {
            return typeId;
        }

        public void setTypeId(Integer typeId) {
            this.typeId = typeId;
        }

        public Integer getBrandId() {
            return brandId;
        }

        public void setBrandId(Integer brandId) {
            this.brandId = brandId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductCode() {
            return productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        public Integer getSaleStatus() {
            return saleStatus;
        }

        public void setSaleStatus(Integer saleStatus) {
            this.saleStatus = saleStatus;
        }

        public String getAddedDate() {
            return addedDate;
        }

        public void setAddedDate(String addedDate) {
            this.addedDate = addedDate;
        }

        public Integer getDisplaySequence() {
            return displaySequence;
        }

        public void setDisplaySequence(Integer displaySequence) {
            this.displaySequence = displaySequence;
        }

        public Double getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(Double marketPrice) {
            this.marketPrice = marketPrice;
        }

        public Double getMinSalePrice() {
            return minSalePrice;
        }

        public void setMinSalePrice(Double minSalePrice) {
            this.minSalePrice = minSalePrice;
        }

        public Boolean getHasSKU() {
            return hasSKU;
        }

        public void setHasSKU(Boolean hasSKU) {
            this.hasSKU = hasSKU;
        }

        public Integer getVistiCounts() {
            return vistiCounts;
        }

        public void setVistiCounts(Integer vistiCounts) {
            this.vistiCounts = vistiCounts;
        }

        public Integer getSaleCounts() {
            return saleCounts;
        }

        public void setSaleCounts(Integer saleCounts) {
            this.saleCounts = saleCounts;
        }

        public Integer getVirtualSaleCounts() {
            return virtualSaleCounts;
        }

        public void setVirtualSaleCounts(Integer virtualSaleCounts) {
            this.virtualSaleCounts = virtualSaleCounts;
        }

        public Integer getAuditStatus() {
            return auditStatus;
        }

        public void setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
        }

        public Integer getFreightTemplateId() {
            return freightTemplateId;
        }

        public void setFreightTemplateId(Integer freightTemplateId) {
            this.freightTemplateId = freightTemplateId;
        }

        public Double getWeight() {
            return weight;
        }

        public void setWeight(Double weight) {
            this.weight = weight;
        }

        public Double getVolume() {
            return volume;
        }

        public void setVolume(Double volume) {
            this.volume = volume;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getMeasureUnit() {
            return measureUnit;
        }

        public void setMeasureUnit(String measureUnit) {
            this.measureUnit = measureUnit;
        }

        public Integer getEditStatus() {
            return editStatus;
        }

        public void setEditStatus(Integer editStatus) {
            this.editStatus = editStatus;
        }

        public Integer getConcernedCount() {
            return concernedCount;
        }

        public void setConcernedCount(Integer concernedCount) {
            this.concernedCount = concernedCount;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public String getRelativePath() {
            return relativePath;
        }

        public void setRelativePath(String relativePath) {
            this.relativePath = relativePath;
        }

        public Boolean getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
        }

        public Integer getMaxBuyCount() {
            return maxBuyCount;
        }

        public void setMaxBuyCount(Integer maxBuyCount) {
            this.maxBuyCount = maxBuyCount;
        }

        public Integer getOrderCounts() {
            return orderCounts;
        }

        public void setOrderCounts(Integer orderCounts) {
            this.orderCounts = orderCounts;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getShopName() {
            return shopName;
        }

        public void setShopName(Object shopName) {
            this.shopName = shopName;
        }

        public Object getBrandName() {
            return brandName;
        }

        public void setBrandName(Object brandName) {
            this.brandName = brandName;
        }

        public Boolean getIsOpenLadder() {
            return isOpenLadder;
        }

        public void setIsOpenLadder(Boolean isOpenLadder) {
            this.isOpenLadder = isOpenLadder;
        }

        public Object getVersionAlias() {
            return versionAlias;
        }

        public void setVersionAlias(Object versionAlias) {
            this.versionAlias = versionAlias;
        }

        public Object getSizeAlias() {
            return sizeAlias;
        }

        public void setSizeAlias(Object sizeAlias) {
            this.sizeAlias = sizeAlias;
        }

        public Object getColorAlias() {
            return colorAlias;
        }

        public void setColorAlias(Object colorAlias) {
            this.colorAlias = colorAlias;
        }

        public Object getVideoPath() {
            return videoPath;
        }

        public void setVideoPath(Object videoPath) {
            this.videoPath = videoPath;
        }

        public Integer getShopDisplaySequence() {
            return shopDisplaySequence;
        }

        public void setShopDisplaySequence(Integer shopDisplaySequence) {
            this.shopDisplaySequence = shopDisplaySequence;
        }

        public Integer getProductType() {
            return productType;
        }

        public void setProductType(Integer productType) {
            this.productType = productType;
        }

        public Object getCategoryNames() {
            return categoryNames;
        }

        public void setCategoryNames(Object categoryNames) {
            this.categoryNames = categoryNames;
        }

        public Integer getIsCategory() {
            return isCategory;
        }

        public void setIsCategory(Integer isCategory) {
            this.isCategory = isCategory;
        }

        public Integer getTopId() {
            return topId;
        }

        public void setTopId(Integer topId) {
            this.topId = topId;
        }

        public Integer getBottomId() {
            return bottomId;
        }

        public void setBottomId(Integer bottomId) {
            this.bottomId = bottomId;
        }

        public String getShowProductState() {
            return showProductState;
        }

        public void setShowProductState(String showProductState) {
            this.showProductState = showProductState;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Object getSKUS() {
            return sKUS;
        }

        public void setSKUS(Object sKUS) {
            this.sKUS = sKUS;
        }

        public Object getAttributes() {
            return attributes;
        }

        public void setAttributes(Object attributes) {
            this.attributes = attributes;
        }

        public Object getSpecifications() {
            return specifications;
        }

        public void setSpecifications(Object specifications) {
            this.specifications = specifications;
        }

        public Boolean getValidityType() {
            return validityType;
        }

        public void setValidityType(Boolean validityType) {
            this.validityType = validityType;
        }

        public Object getStartDate() {
            return startDate;
        }

        public void setStartDate(Object startDate) {
            this.startDate = startDate;
        }

        public Object getEndDate() {
            return endDate;
        }

        public void setEndDate(Object endDate) {
            this.endDate = endDate;
        }

        public Integer getEffectiveType() {
            return effectiveType;
        }

        public void setEffectiveType(Integer effectiveType) {
            this.effectiveType = effectiveType;
        }

        public Integer getHour() {
            return hour;
        }

        public void setHour(Integer hour) {
            this.hour = hour;
        }

        public Integer getSupportRefundType() {
            return supportRefundType;
        }

        public void setSupportRefundType(Integer supportRefundType) {
            this.supportRefundType = supportRefundType;
        }

        public Object getUseNotice() {
            return useNotice;
        }

        public void setUseNotice(Object useNotice) {
            this.useNotice = useNotice;
        }

        public Object getVirtualProductItemInfo() {
            return virtualProductItemInfo;
        }

        public void setVirtualProductItemInfo(Object virtualProductItemInfo) {
            this.virtualProductItemInfo = virtualProductItemInfo;
        }

        public Object getLadderPrices() {
            return ladderPrices;
        }

        public void setLadderPrices(Object ladderPrices) {
            this.ladderPrices = ladderPrices;
        }
    }

    public static class ShopListBean {
        @SerializedName("Id")
        private Integer id;
        @SerializedName("GradeId")
        private Integer gradeId;
        @SerializedName("ShopName")
        private String shopName;
        @SerializedName("Logo")
        private String logo;
        @SerializedName("SubDomains")
        private Object subDomains;
        @SerializedName("Theme")
        private Object theme;
        @SerializedName("IsSelf")
        private Boolean isSelf;
        @SerializedName("ShopStatus")
        private Integer shopStatus;
        @SerializedName("RefuseReason")
        private Object refuseReason;
        @SerializedName("CreateDate")
        private String createDate;
        @SerializedName("EndDate")
        private String endDate;
        @SerializedName("CompanyName")
        private String companyName;
        @SerializedName("CompanyRegionId")
        private Integer companyRegionId;
        @SerializedName("CompanyAddress")
        private String companyAddress;
        @SerializedName("CompanyPhone")
        private String companyPhone;
        @SerializedName("CompanyEmployeeCount")
        private Integer companyEmployeeCount;
        @SerializedName("CompanyRegisteredCapital")
        private Double companyRegisteredCapital;
        @SerializedName("ContactsName")
        private String contactsName;
        @SerializedName("ContactsPhone")
        private String contactsPhone;
        @SerializedName("ContactsEmail")
        private String contactsEmail;
        @SerializedName("ContactsQQ")
        private String contactsQQ;
        @SerializedName("ContactsPostalCode")
        private String contactsPostalCode;
        @SerializedName("ContactsFax")
        private String contactsFax;
        @SerializedName("ContactsSite")
        private String contactsSite;
        @SerializedName("BusinessLicenceNumber")
        private String businessLicenceNumber;
        @SerializedName("BusinessLicenceNumberPhoto")
        private String businessLicenceNumberPhoto;
        @SerializedName("BusinessLicenceRegionId")
        private Integer businessLicenceRegionId;
        @SerializedName("BusinessLicenceStart")
        private String businessLicenceStart;
        @SerializedName("BusinessLicenceEnd")
        private String businessLicenceEnd;
        @SerializedName("BusinessSphere")
        private String businessSphere;
        @SerializedName("OrganizationCode")
        private String organizationCode;
        @SerializedName("OrganizationCodePhoto")
        private String organizationCodePhoto;
        @SerializedName("GeneralTaxpayerPhot")
        private String generalTaxpayerPhot;
        @SerializedName("BankAccountName")
        private String bankAccountName;
        @SerializedName("BankAccountNumber")
        private String bankAccountNumber;
        @SerializedName("BankName")
        private String bankName;
        @SerializedName("BankCode")
        private String bankCode;
        @SerializedName("BankRegionId")
        private Integer bankRegionId;
        @SerializedName("BankPhoto")
        private String bankPhoto;
        @SerializedName("TaxRegistrationCertificate")
        private String taxRegistrationCertificate;
        @SerializedName("TaxpayerId")
        private String taxpayerId;
        @SerializedName("TaxRegistrationCertificatePhoto")
        private String taxRegistrationCertificatePhoto;
        @SerializedName("PayPhoto")
        private String payPhoto;
        @SerializedName("PayRemark")
        private String payRemark;
        @SerializedName("SenderName")
        private String senderName;
        @SerializedName("SenderAddress")
        private String senderAddress;
        @SerializedName("SenderPhone")
        private String senderPhone;
        @SerializedName("Freight")
        private Double freight;
        @SerializedName("FreeFreight")
        private Double freeFreight;
        @SerializedName("Stage")
        private Integer stage;
        @SerializedName("SenderRegionId")
        private Integer senderRegionId;
        @SerializedName("BusinessLicenseCert")
        private Object businessLicenseCert;
        @SerializedName("ProductCert")
        private Object productCert;
        @SerializedName("OtherCert")
        private Object otherCert;
        private Object legalPerson;
        @SerializedName("CompanyFoundingDate")
        private Object companyFoundingDate;
        @SerializedName("BusinessType")
        private Integer businessType;
        @SerializedName("IDCard")
        private String iDCard;
        @SerializedName("IDCardUrl")
        private String iDCardUrl;
        @SerializedName("IDCardUrl2")
        private Object iDCardUrl2;
        @SerializedName("WeiXinNickName")
        private String weiXinNickName;
        @SerializedName("WeiXinSex")
        private Integer weiXinSex;
        @SerializedName("WeiXinAddress")
        private String weiXinAddress;
        @SerializedName("WeiXinTrueName")
        private String weiXinTrueName;
        @SerializedName("WeiXinOpenId")
        private String weiXinOpenId;
        @SerializedName("WeiXinImg")
        private Object weiXinImg;
        @SerializedName("AutoAllotOrder")
        private Boolean autoAllotOrder;
        @SerializedName("IsAutoPrint")
        private Boolean isAutoPrint;
        @SerializedName("PrintCount")
        private Integer printCount;
        @SerializedName("IsOpenTopImageAd")
        private Boolean isOpenTopImageAd;
        @SerializedName("CompanyInfor")
        private String companyInfor;
        @SerializedName("BusinessScope")
        private String businessScope;
        @SerializedName("ShowShopAuditStatus")
        private Integer showShopAuditStatus;
        @SerializedName("ShopAccount")
        private Object shopAccount;
        @SerializedName("BusinessCategory")
        private Object businessCategory;
        @SerializedName("Sales")
        private Integer sales;
        @SerializedName("ProductAndDescription")
        private Object productAndDescription;
        @SerializedName("SellerServiceAttitude")
        private Object sellerServiceAttitude;
        @SerializedName("SellerDeliverySpeed")
        private Object sellerDeliverySpeed;
        @SerializedName("CasesinforList")
        private List<CasesinforListBean> casesinforList;
        @SerializedName("ShopStatisticOrderComments")
        private Double shopStatisticOrderComments;
        @SerializedName("ShopVistiCounts")
        private Double shopVistiCounts;
        @SerializedName("ShopOrderPayCount")
        private Double shopOrderPayCount;
        @SerializedName("ShopOrderCounts")
        private Double shopOrderCounts;
        @SerializedName("ModifiedColumns")
        private List<?> modifiedColumns;
        @SerializedName("EnableLazyLoad")
        private Boolean enableLazyLoad;
        @SerializedName("IgnoreReference")
        private Boolean ignoreReference;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getGradeId() {
            return gradeId;
        }

        public void setGradeId(Integer gradeId) {
            this.gradeId = gradeId;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public Object getSubDomains() {
            return subDomains;
        }

        public void setSubDomains(Object subDomains) {
            this.subDomains = subDomains;
        }

        public Object getTheme() {
            return theme;
        }

        public void setTheme(Object theme) {
            this.theme = theme;
        }

        public Boolean getIsSelf() {
            return isSelf;
        }

        public void setIsSelf(Boolean isSelf) {
            this.isSelf = isSelf;
        }

        public Integer getShopStatus() {
            return shopStatus;
        }

        public void setShopStatus(Integer shopStatus) {
            this.shopStatus = shopStatus;
        }

        public Object getRefuseReason() {
            return refuseReason;
        }

        public void setRefuseReason(Object refuseReason) {
            this.refuseReason = refuseReason;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public Integer getCompanyRegionId() {
            return companyRegionId;
        }

        public void setCompanyRegionId(Integer companyRegionId) {
            this.companyRegionId = companyRegionId;
        }

        public String getCompanyAddress() {
            return companyAddress;
        }

        public void setCompanyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
        }

        public String getCompanyPhone() {
            return companyPhone;
        }

        public void setCompanyPhone(String companyPhone) {
            this.companyPhone = companyPhone;
        }

        public Integer getCompanyEmployeeCount() {
            return companyEmployeeCount;
        }

        public void setCompanyEmployeeCount(Integer companyEmployeeCount) {
            this.companyEmployeeCount = companyEmployeeCount;
        }

        public Double getCompanyRegisteredCapital() {
            return companyRegisteredCapital;
        }

        public void setCompanyRegisteredCapital(Double companyRegisteredCapital) {
            this.companyRegisteredCapital = companyRegisteredCapital;
        }

        public String getContactsName() {
            return contactsName;
        }

        public void setContactsName(String contactsName) {
            this.contactsName = contactsName;
        }

        public String getContactsPhone() {
            return contactsPhone;
        }

        public void setContactsPhone(String contactsPhone) {
            this.contactsPhone = contactsPhone;
        }

        public String getContactsEmail() {
            return contactsEmail;
        }

        public void setContactsEmail(String contactsEmail) {
            this.contactsEmail = contactsEmail;
        }

        public String getContactsQQ() {
            return contactsQQ;
        }

        public void setContactsQQ(String contactsQQ) {
            this.contactsQQ = contactsQQ;
        }

        public String getContactsPostalCode() {
            return contactsPostalCode;
        }

        public void setContactsPostalCode(String contactsPostalCode) {
            this.contactsPostalCode = contactsPostalCode;
        }

        public String getContactsFax() {
            return contactsFax;
        }

        public void setContactsFax(String contactsFax) {
            this.contactsFax = contactsFax;
        }

        public String getContactsSite() {
            return contactsSite;
        }

        public void setContactsSite(String contactsSite) {
            this.contactsSite = contactsSite;
        }

        public String getBusinessLicenceNumber() {
            return businessLicenceNumber;
        }

        public void setBusinessLicenceNumber(String businessLicenceNumber) {
            this.businessLicenceNumber = businessLicenceNumber;
        }

        public String getBusinessLicenceNumberPhoto() {
            return businessLicenceNumberPhoto;
        }

        public void setBusinessLicenceNumberPhoto(String businessLicenceNumberPhoto) {
            this.businessLicenceNumberPhoto = businessLicenceNumberPhoto;
        }

        public Integer getBusinessLicenceRegionId() {
            return businessLicenceRegionId;
        }

        public void setBusinessLicenceRegionId(Integer businessLicenceRegionId) {
            this.businessLicenceRegionId = businessLicenceRegionId;
        }

        public String getBusinessLicenceStart() {
            return businessLicenceStart;
        }

        public void setBusinessLicenceStart(String businessLicenceStart) {
            this.businessLicenceStart = businessLicenceStart;
        }

        public String getBusinessLicenceEnd() {
            return businessLicenceEnd;
        }

        public void setBusinessLicenceEnd(String businessLicenceEnd) {
            this.businessLicenceEnd = businessLicenceEnd;
        }

        public String getBusinessSphere() {
            return businessSphere;
        }

        public void setBusinessSphere(String businessSphere) {
            this.businessSphere = businessSphere;
        }

        public String getOrganizationCode() {
            return organizationCode;
        }

        public void setOrganizationCode(String organizationCode) {
            this.organizationCode = organizationCode;
        }

        public String getOrganizationCodePhoto() {
            return organizationCodePhoto;
        }

        public void setOrganizationCodePhoto(String organizationCodePhoto) {
            this.organizationCodePhoto = organizationCodePhoto;
        }

        public String getGeneralTaxpayerPhot() {
            return generalTaxpayerPhot;
        }

        public void setGeneralTaxpayerPhot(String generalTaxpayerPhot) {
            this.generalTaxpayerPhot = generalTaxpayerPhot;
        }

        public String getBankAccountName() {
            return bankAccountName;
        }

        public void setBankAccountName(String bankAccountName) {
            this.bankAccountName = bankAccountName;
        }

        public String getBankAccountNumber() {
            return bankAccountNumber;
        }

        public void setBankAccountNumber(String bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
        }

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getBankCode() {
            return bankCode;
        }

        public void setBankCode(String bankCode) {
            this.bankCode = bankCode;
        }

        public Integer getBankRegionId() {
            return bankRegionId;
        }

        public void setBankRegionId(Integer bankRegionId) {
            this.bankRegionId = bankRegionId;
        }

        public String getBankPhoto() {
            return bankPhoto;
        }

        public void setBankPhoto(String bankPhoto) {
            this.bankPhoto = bankPhoto;
        }

        public String getTaxRegistrationCertificate() {
            return taxRegistrationCertificate;
        }

        public void setTaxRegistrationCertificate(String taxRegistrationCertificate) {
            this.taxRegistrationCertificate = taxRegistrationCertificate;
        }

        public String getTaxpayerId() {
            return taxpayerId;
        }

        public void setTaxpayerId(String taxpayerId) {
            this.taxpayerId = taxpayerId;
        }

        public String getTaxRegistrationCertificatePhoto() {
            return taxRegistrationCertificatePhoto;
        }

        public void setTaxRegistrationCertificatePhoto(String taxRegistrationCertificatePhoto) {
            this.taxRegistrationCertificatePhoto = taxRegistrationCertificatePhoto;
        }

        public String getPayPhoto() {
            return payPhoto;
        }

        public void setPayPhoto(String payPhoto) {
            this.payPhoto = payPhoto;
        }

        public String getPayRemark() {
            return payRemark;
        }

        public void setPayRemark(String payRemark) {
            this.payRemark = payRemark;
        }

        public String getSenderName() {
            return senderName;
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }

        public String getSenderAddress() {
            return senderAddress;
        }

        public void setSenderAddress(String senderAddress) {
            this.senderAddress = senderAddress;
        }

        public String getSenderPhone() {
            return senderPhone;
        }

        public void setSenderPhone(String senderPhone) {
            this.senderPhone = senderPhone;
        }

        public Double getFreight() {
            return freight;
        }

        public void setFreight(Double freight) {
            this.freight = freight;
        }

        public Double getFreeFreight() {
            return freeFreight;
        }

        public void setFreeFreight(Double freeFreight) {
            this.freeFreight = freeFreight;
        }

        public Integer getStage() {
            return stage;
        }

        public void setStage(Integer stage) {
            this.stage = stage;
        }

        public Integer getSenderRegionId() {
            return senderRegionId;
        }

        public void setSenderRegionId(Integer senderRegionId) {
            this.senderRegionId = senderRegionId;
        }

        public Object getBusinessLicenseCert() {
            return businessLicenseCert;
        }

        public void setBusinessLicenseCert(Object businessLicenseCert) {
            this.businessLicenseCert = businessLicenseCert;
        }

        public Object getProductCert() {
            return productCert;
        }

        public void setProductCert(Object productCert) {
            this.productCert = productCert;
        }

        public Object getOtherCert() {
            return otherCert;
        }

        public void setOtherCert(Object otherCert) {
            this.otherCert = otherCert;
        }

        public Object getLegalPerson() {
            return legalPerson;
        }

        public void setLegalPerson(Object legalPerson) {
            this.legalPerson = legalPerson;
        }

        public Object getCompanyFoundingDate() {
            return companyFoundingDate;
        }

        public void setCompanyFoundingDate(Object companyFoundingDate) {
            this.companyFoundingDate = companyFoundingDate;
        }

        public Integer getBusinessType() {
            return businessType;
        }

        public void setBusinessType(Integer businessType) {
            this.businessType = businessType;
        }

        public String getIDCard() {
            return iDCard;
        }

        public void setIDCard(String iDCard) {
            this.iDCard = iDCard;
        }

        public String getIDCardUrl() {
            return iDCardUrl;
        }

        public void setIDCardUrl(String iDCardUrl) {
            this.iDCardUrl = iDCardUrl;
        }

        public Object getIDCardUrl2() {
            return iDCardUrl2;
        }

        public void setIDCardUrl2(Object iDCardUrl2) {
            this.iDCardUrl2 = iDCardUrl2;
        }

        public String getWeiXinNickName() {
            return weiXinNickName;
        }

        public void setWeiXinNickName(String weiXinNickName) {
            this.weiXinNickName = weiXinNickName;
        }

        public Integer getWeiXinSex() {
            return weiXinSex;
        }

        public void setWeiXinSex(Integer weiXinSex) {
            this.weiXinSex = weiXinSex;
        }

        public String getWeiXinAddress() {
            return weiXinAddress;
        }

        public void setWeiXinAddress(String weiXinAddress) {
            this.weiXinAddress = weiXinAddress;
        }

        public String getWeiXinTrueName() {
            return weiXinTrueName;
        }

        public void setWeiXinTrueName(String weiXinTrueName) {
            this.weiXinTrueName = weiXinTrueName;
        }

        public String getWeiXinOpenId() {
            return weiXinOpenId;
        }

        public void setWeiXinOpenId(String weiXinOpenId) {
            this.weiXinOpenId = weiXinOpenId;
        }

        public Object getWeiXinImg() {
            return weiXinImg;
        }

        public void setWeiXinImg(Object weiXinImg) {
            this.weiXinImg = weiXinImg;
        }

        public Boolean getAutoAllotOrder() {
            return autoAllotOrder;
        }

        public void setAutoAllotOrder(Boolean autoAllotOrder) {
            this.autoAllotOrder = autoAllotOrder;
        }

        public Boolean getIsAutoPrint() {
            return isAutoPrint;
        }

        public void setIsAutoPrint(Boolean isAutoPrint) {
            this.isAutoPrint = isAutoPrint;
        }

        public Integer getPrintCount() {
            return printCount;
        }

        public void setPrintCount(Integer printCount) {
            this.printCount = printCount;
        }

        public Boolean getIsOpenTopImageAd() {
            return isOpenTopImageAd;
        }

        public void setIsOpenTopImageAd(Boolean isOpenTopImageAd) {
            this.isOpenTopImageAd = isOpenTopImageAd;
        }

        public String getCompanyInfor() {
            return companyInfor;
        }

        public void setCompanyInfor(String companyInfor) {
            this.companyInfor = companyInfor;
        }

        public String getBusinessScope() {
            return businessScope;
        }

        public void setBusinessScope(String businessScope) {
            this.businessScope = businessScope;
        }

        public Integer getShowShopAuditStatus() {
            return showShopAuditStatus;
        }

        public void setShowShopAuditStatus(Integer showShopAuditStatus) {
            this.showShopAuditStatus = showShopAuditStatus;
        }

        public Object getShopAccount() {
            return shopAccount;
        }

        public void setShopAccount(Object shopAccount) {
            this.shopAccount = shopAccount;
        }

        public Object getBusinessCategory() {
            return businessCategory;
        }

        public void setBusinessCategory(Object businessCategory) {
            this.businessCategory = businessCategory;
        }

        public Integer getSales() {
            return sales;
        }

        public void setSales(Integer sales) {
            this.sales = sales;
        }

        public Object getProductAndDescription() {
            return productAndDescription;
        }

        public void setProductAndDescription(Object productAndDescription) {
            this.productAndDescription = productAndDescription;
        }

        public Object getSellerServiceAttitude() {
            return sellerServiceAttitude;
        }

        public void setSellerServiceAttitude(Object sellerServiceAttitude) {
            this.sellerServiceAttitude = sellerServiceAttitude;
        }

        public Object getSellerDeliverySpeed() {
            return sellerDeliverySpeed;
        }

        public void setSellerDeliverySpeed(Object sellerDeliverySpeed) {
            this.sellerDeliverySpeed = sellerDeliverySpeed;
        }

        public List<CasesinforListBean> getCasesinforList() {
            return casesinforList;
        }

        public void setCasesinforList(List<CasesinforListBean> casesinforList) {
            this.casesinforList = casesinforList;
        }

        public Double getShopStatisticOrderComments() {
            return shopStatisticOrderComments;
        }

        public void setShopStatisticOrderComments(Double shopStatisticOrderComments) {
            this.shopStatisticOrderComments = shopStatisticOrderComments;
        }

        public Double getShopVistiCounts() {
            return shopVistiCounts;
        }

        public void setShopVistiCounts(Double shopVistiCounts) {
            this.shopVistiCounts = shopVistiCounts;
        }

        public Double getShopOrderPayCount() {
            return shopOrderPayCount;
        }

        public void setShopOrderPayCount(Double shopOrderPayCount) {
            this.shopOrderPayCount = shopOrderPayCount;
        }

        public Double getShopOrderCounts() {
            return shopOrderCounts;
        }

        public void setShopOrderCounts(Double shopOrderCounts) {
            this.shopOrderCounts = shopOrderCounts;
        }

        public List<?> getModifiedColumns() {
            return modifiedColumns;
        }

        public void setModifiedColumns(List<?> modifiedColumns) {
            this.modifiedColumns = modifiedColumns;
        }

        public Boolean getEnableLazyLoad() {
            return enableLazyLoad;
        }

        public void setEnableLazyLoad(Boolean enableLazyLoad) {
            this.enableLazyLoad = enableLazyLoad;
        }

        public Boolean getIgnoreReference() {
            return ignoreReference;
        }

        public void setIgnoreReference(Boolean ignoreReference) {
            this.ignoreReference = ignoreReference;
        }

        public static class CasesinforListBean {
            @SerializedName("Id")
            private Integer id;
            @SerializedName("ShopId")
            private Integer shopId;
            @SerializedName("Title")
            private String title;
            @SerializedName("InforType")
            private Integer inforType;
            @SerializedName("CoverUrl")
            private String coverUrl;
            @SerializedName("Description")
            private Object description;
            @SerializedName("ReleaseDate")
            private String releaseDate;
            @SerializedName("ShareTimes")
            private Integer shareTimes;
            @SerializedName("ReadingTimes")
            private Integer readingTimes;
            @SerializedName("Likes")
            private Integer likes;
            @SerializedName("Recommend")
            private Integer recommend;
            @SerializedName("Enable")
            private Integer enable;
            @SerializedName("CreateTime")
            private String createTime;
            @SerializedName("CreateUserID")
            private Integer createUserID;
            @SerializedName("UpdateTime")
            private String updateTime;
            @SerializedName("UpdateUserID")
            private Integer updateUserID;
            @SerializedName("ModifiedColumns")
            private List<?> modifiedColumns;
            @SerializedName("EnableLazyLoad")
            private Boolean enableLazyLoad;
            @SerializedName("IgnoreReference")
            private Boolean ignoreReference;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public Integer getShopId() {
                return shopId;
            }

            public void setShopId(Integer shopId) {
                this.shopId = shopId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public Integer getInforType() {
                return inforType;
            }

            public void setInforType(Integer inforType) {
                this.inforType = inforType;
            }

            public String getCoverUrl() {
                return coverUrl;
            }

            public void setCoverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
            }

            public Object getDescription() {
                return description;
            }

            public void setDescription(Object description) {
                this.description = description;
            }

            public String getReleaseDate() {
                return releaseDate;
            }

            public void setReleaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
            }

            public Integer getShareTimes() {
                return shareTimes;
            }

            public void setShareTimes(Integer shareTimes) {
                this.shareTimes = shareTimes;
            }

            public Integer getReadingTimes() {
                return readingTimes;
            }

            public void setReadingTimes(Integer readingTimes) {
                this.readingTimes = readingTimes;
            }

            public Integer getLikes() {
                return likes;
            }

            public void setLikes(Integer likes) {
                this.likes = likes;
            }

            public Integer getRecommend() {
                return recommend;
            }

            public void setRecommend(Integer recommend) {
                this.recommend = recommend;
            }

            public Integer getEnable() {
                return enable;
            }

            public void setEnable(Integer enable) {
                this.enable = enable;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public Integer getCreateUserID() {
                return createUserID;
            }

            public void setCreateUserID(Integer createUserID) {
                this.createUserID = createUserID;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public Integer getUpdateUserID() {
                return updateUserID;
            }

            public void setUpdateUserID(Integer updateUserID) {
                this.updateUserID = updateUserID;
            }

            public List<?> getModifiedColumns() {
                return modifiedColumns;
            }

            public void setModifiedColumns(List<?> modifiedColumns) {
                this.modifiedColumns = modifiedColumns;
            }

            public Boolean getEnableLazyLoad() {
                return enableLazyLoad;
            }

            public void setEnableLazyLoad(Boolean enableLazyLoad) {
                this.enableLazyLoad = enableLazyLoad;
            }

            public Boolean getIgnoreReference() {
                return ignoreReference;
            }

            public void setIgnoreReference(Boolean ignoreReference) {
                this.ignoreReference = ignoreReference;
            }
        }
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
