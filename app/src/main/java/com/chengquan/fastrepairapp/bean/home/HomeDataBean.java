package com.chengquan.fastrepairapp.bean.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeDataBean {

    @SerializedName("ShopList")
    private List<ShopListBean> shopList;
    @SerializedName("PurchaseList")
    private List<PurchaseListBean> purchaseList;
    @SerializedName("ProductList")
    private List<ProductListBean> productList;
    @SerializedName("MemberList")
    private List<MemberListBean> memberList;
    @SerializedName("SlideImages")
    private List<?> slideImages;

    public List<ShopListBean> getShopList() {
        return shopList;
    }

    public void setShopList(List<ShopListBean> shopList) {
        this.shopList = shopList;
    }

    public List<PurchaseListBean> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<PurchaseListBean> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public List<ProductListBean> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductListBean> productList) {
        this.productList = productList;
    }

    public List<MemberListBean> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberListBean> memberList) {
        this.memberList = memberList;
    }

    public List<?> getSlideImages() {
        return slideImages;
    }

    public void setSlideImages(List<?> slideImages) {
        this.slideImages = slideImages;
    }

    public static class ShopListBean {
        @SerializedName("ShopId")
        private Integer shopId;
        @SerializedName("Logo")
        private String logo;
        @SerializedName("CompanyName")
        private String companyName;

        public Integer getShopId() {
            return shopId;
        }

        public void setShopId(Integer shopId) {
            this.shopId = shopId;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }
    }

    public static class PurchaseListBean {
        @SerializedName("Purchase")
        private Integer purchase;
        @SerializedName("CoverUrl")
        private Object coverUrl;
        @SerializedName("Description")
        private String description;
        @SerializedName("ReleaseDate")
        private String releaseDate;
        @SerializedName("ReadingTimes")
        private Integer readingTimes;
        @SerializedName("Likes")
        private Integer likes;
        @SerializedName("ShareTimes")
        private Integer shareTimes;
        @SerializedName("ClosingDate")
        private String closingDate;

        public Integer getPurchase() {
            return purchase;
        }

        public void setPurchase(Integer purchase) {
            this.purchase = purchase;
        }

        public Object getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(Object coverUrl) {
            this.coverUrl = coverUrl;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
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

        public Integer getShareTimes() {
            return shareTimes;
        }

        public void setShareTimes(Integer shareTimes) {
            this.shareTimes = shareTimes;
        }

        public String getClosingDate() {
            return closingDate;
        }

        public void setClosingDate(String closingDate) {
            this.closingDate = closingDate;
        }
    }

    public static class ProductListBean {
        @SerializedName("ProductId")
        private Integer productId;
        @SerializedName("ProductName")
        private String productName;
        @SerializedName("ShortDescription")
        private String shortDescription;
        @SerializedName("CompanyName")
        private String companyName;
        @SerializedName("Images")
        private List<String> images;
        @SerializedName("VistiCounts")
        private Integer vistiCounts;
        @SerializedName("AddedDate")
        private String addedDate;

        public Integer getProductId() {
            return productId;
        }

        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public Integer getVistiCounts() {
            return vistiCounts;
        }

        public void setVistiCounts(Integer vistiCounts) {
            this.vistiCounts = vistiCounts;
        }

        public String getAddedDate() {
            return addedDate;
        }

        public void setAddedDate(String addedDate) {
            this.addedDate = addedDate;
        }
    }

    public static class MemberListBean {
        @SerializedName("CompanyName")
        private String companyName;

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }
    }
}
